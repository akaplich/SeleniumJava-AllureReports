package actions.Utils;

import java.time.Duration;
import java.time.LocalDateTime;

class ReturnSecondsTillNextHour{
    public String run(def params){
        LocalDateTime now = LocalDateTime.now(); // 1. Current time
        System.out.println("Current time: " + now);

        // 2. Next top of the hour (same hour +1, zero minutes and seconds)
        LocalDateTime nextHour = now.plusHours(1).withMinute(0).withSecond(0).withNano(0);

        // 3. Calculate duration between now and the next hour
        Duration duration = Duration.between(now, nextHour);
        long minutesLeft = duration.toMinutes();
        long secondsLeft = duration.getSeconds();

        System.out.println("Minutes until next hour: " + minutesLeft);
        System.out.println("Seconds until next hour: " + secondsLeft);
        
        return String.valueOf(duration.getSeconds());
        
    }
}