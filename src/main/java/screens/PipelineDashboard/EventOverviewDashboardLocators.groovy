package screens.PipelineDashboard;
import org.openqa.selenium.By


class EventOverviewDashboardLocators{
    
    // Stat Box Numbers
    public static By visitorsStatBoxNumber = getStatBoxNumber("Visitor")
    public static By participantsStatBoxNumber = getStatBoxNumber("Participants")
    public static By teamsStatBoxNumber = getStatBoxNumber("Teams")
    public static By ideasStatBoxNumber = getStatBoxNumber("Ideas")
    public static By votesStatBoxNumber = getStatBoxNumber("Votes")
    public static By commentsStatBoxNumber = getStatBoxNumber("Comments")
    
    // Callout Numbers
    public static By highlyEngagedCalloutNumber = getCalloutNumber("of users are highly engaged.")
    public static By totalIdeasInDraftCalloutNumber = getCalloutNumber("of total ideas still in draft.")
    public static By participantsOnMultipleTeamsCalloutNumber = getCalloutNumber("Participants are on more than one team.")
    
    // Heatmap Cells
    public static By heatmapCellLevel0 = getHeatmapCell("rgb(247, 251, 255)")
    public static By heatmapCellLevel1 = getHeatmapCell("rgb(207, 225, 242)")
    public static By heatmapCellLevel2 = getHeatmapCell("rgb(147, 195, 223)")
    public static By heatmapCellLevel3 = getHeatmapCell("rgb(75, 151, 201)")
    public static By heatmapCellLevel4 = getHeatmapCell("rgb(24, 100, 170)")
    public static By heatmapCellLevel5 = getHeatmapCell("rgb(8, 48, 107)")
    


    // Constructor to initialize the driver and instantiate elements using PageFactory
    public EventTimelineDashboardLocators() {
    }
    
    // Dynamic locators
    public static By getChartLabel(String label) {
        return By.xpath("//*[contains(@class,'highcharts-plot-band-label')][.='${label}']")
    }
    public static By getStatBoxNumber(String label) {
        return By.xpath("//div[@class='f-stat-box']//*[text()='${label}']/..//span[@class='f-stat-number']")
    }
    public static By getCalloutNumber(String label) {
        return By.xpath("//div[@class='f-stat-callout']//*[text()='${label}']/..//*[@class='f-callout-number']")
    }
    public static By getHeatmapCell(String style) {
        return By.xpath("//div[@class='f-heatmap']//*[@class='heatmap-cell'][@style='background-color: ${style};']")
    }   
    public static By getChartTooltip(String tooltip) {
        return By.xpath("//*[contains(@class,'highcharts-annotation-label')][.='${tooltip}']")
    }
    //public static By getChartPointCountByChartIndex(String chartIndex) {
    //    By tagField = By.xpath("//*[contains(@class,'highcharts-point highcharts-color-${chartIndex}')]")
    //    return 
    //}
    public static By getChartLegendItems(String legendItem) {
        return By.xpath("//*[contains(@class,'highcharts-legend-item')][contains(@class,'highcharts-legend-item')]//*[text()='${legendItem}']")
    }
}