package utils;

import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;

public class ProgressReportListener implements TestExecutionListener {
    private final AtomicInteger completed = new AtomicInteger(0);
    private int totalTests = 0;
    private static final String PROGRESS_FILE = "target/test-progress.txt";

    @Override
    public void testPlanExecutionStarted(TestPlan testPlan) {
        totalTests = (int) testPlan.countTestIdentifiers(TestIdentifier::isTest);
        updateProgressFile(0);
        System.out.printf("[TEST PROGRESS] 0 of %d tests completed (0%%)\n", totalTests);
    }

    @Override
    public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult result) {
        if (testIdentifier.isTest()) {
            int current = completed.incrementAndGet();
            int percentage = (int)((current / (double)totalTests) * 100);
            updateProgressFile(current);
            System.out.printf("[TEST PROGRESS] %d of %d tests completed (%d%%)\n",
                    current, totalTests, percentage);
        }
    }

    private void updateProgressFile(int current) {
        try {
            Files.createDirectories(Paths.get("target"));
            try (FileWriter writer = new FileWriter(PROGRESS_FILE)) {
                writer.write(String.format("%d of %d", current, totalTests));
            }
        } catch (IOException e) {
            System.err.println("Failed to write progress: " + e.getMessage());
        }
    }
}