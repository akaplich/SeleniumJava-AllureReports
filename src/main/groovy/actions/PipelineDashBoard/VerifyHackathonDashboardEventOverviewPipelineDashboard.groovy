package actions.PipelineDashBoard;

import actions.selenium.Exists
import actions.selenium.VerifyText
import actions.selenium.utils.VerifyNumberOfMatches
import screens.PipelineDashboard.EventOverviewDashboardLocators

class VerifyHackathonDashboardEventOverviewPipelineDashboard{
    public void run(def params){
        
        if(params."Visitor"){
            VerifyText.run("ID Type":"By",By:EventOverviewDashboardLocators.visitorsStatBoxNumber, Text: params."Visitor") 
        }
        
        if(params."Participants"){
            VerifyText.run("ID Type":"By",By:EventOverviewDashboardLocators.participantsStatBoxNumber, Text: params."Participants") 
        } 
        
        if(params."Teams"){
            VerifyText.run("ID Type":"By",By:EventOverviewDashboardLocators.teamsStatBoxNumber, Text: params."Teams")            
        }   
        
        if(params."Ideas"){
            VerifyText.run("ID Type":"By",By:EventOverviewDashboardLocators.ideasStatBoxNumber, Text: params."Ideas")                       
        } 

        if(params."Votes"){
            VerifyText.run("ID Type":"By",By:EventOverviewDashboardLocators.votesStatBoxNumber, Text: params."Votes")                                   
        }
        
        if(params."Comments"){
            VerifyText.run("ID Type":"By",By:EventOverviewDashboardLocators.commentsStatBoxNumber, Text: params."Comments")                                               
        }   
        
        if(params."Percent of Highly Engaged Users"){
            VerifyText.run("ID Type":"By",By:EventOverviewDashboardLocators.highlyEngagedCalloutNumber, Text: params."Percent of Highly Engaged Users")                                                           
        }  
        
        if(params."Percent Of Total Ideas in Draft"){
            VerifyText.run("ID Type":"By",By:EventOverviewDashboardLocators.totalIdeasInDraftCalloutNumber, Text: params."Percent Of Total Ideas in Draft")                                                                       
        }  
        
        if(params."Participants on Multiple Teams"){
            VerifyText.run("ID Type":"By",By:EventOverviewDashboardLocators.participantsOnMultipleTeamsCalloutNumber, Text: params."Participants on Multiple Teams")                                                                                   
        }         
        
        if(params."User Engagement Funnel Label"){
            VerifyText.run(ID:"//div[@class='f-stat-chart']//*[@class='highcharts-title'][text()='User Engagement Funnel']/../../../..//*[@class='f-chart-label']", Text: params."User Engagement Funnel Label")                        
        }
        
        if(params."Submitted Ideas Per User Label"){
            VerifyText.run(ID:"//div[@class='f-stat-chart']//*[@class='highcharts-title'][text()='Submitted Ideas Per Participant']/../../../..//*[@class='f-chart-label']", Text: params."Submitted Ideas Per User Label")                        
        }   
        
        if(params."Participants Per Team"){
            VerifyText.run(ID:"//div[@class='f-stat-chart']//*[@class='highcharts-title'][text()='Participants Per Team']/../../../..//*[@class='f-chart-label']", Text: params."Participants Per Team")                        
        }          
        
        // Verify Chart Labels
        if(params."Chart Labels"){
            String[] str;
      		str = params."Chart Labels".split(',');
            for( String label : str ){
          		println(label);
                assert Exists.run("ID Type":"By",By:EventOverviewDashboardLocators.getChartLabel(label))==1,"Error - Chart Label '${label}' was not found"
            }
        }
        
        // Verify Tooltips
        if(params."Chart Tooltips"){
            String[] str;
      		str = params."Chart Tooltips".split(',');
            for( String tooltip : str ){
          		println(tooltip);
                assert Exists.run("ID Type":"By",By:EventOverviewDashboardLocators.getChartTooltip(tooltip))==1,"Error - Chart Tooltip '${tooltip}' was not found"
            }
        }
        
        // Verify Point Counts
        if(params."Chart Point Count"){
            String[] str;
      		str = params."Chart Point Count".split(',');
            int i = 0;
            for( String count : str ){
          		println(count);
                VerifyNumberOfMatches.run(ID:"//*[contains(@class,'highcharts-point highcharts-color-${i}')]", "Number of Matches": count.toInteger())
                i++;
            }            
        }
        
        // Verify Legend
        if(params."Chart Legend Items"){
            String[] str;
      		str = params."Chart Legend Items".split(',');
            for( String legendItem : str ){
          		println(legendItem);
                assert Exists.run("ID Type":"By",By:EventOverviewDashboardLocators.getChartLegendItems(legendItem))==1,"Error - Chart Legend Item '${legendItem}' was not found"            
            }            
        } 
        
        if(params."Heatmap Level 0 Count"){
            VerifyNumberOfMatches.run("ID Type":"By",By:EventOverviewDashboardLocators.heatmapCellLevel0, "Number of Matches": params."Heatmap Level 0 Count".toInteger())            
        } 
        
        if(params."Heatmap Level 1 Count"){
            VerifyNumberOfMatches.run("ID Type":"By",By:EventOverviewDashboardLocators.heatmapCellLevel1, "Number of Matches": params."Heatmap Level 1 Count".toInteger())            
        } 
        
        if(params."Heatmap Level 2 Count"){
            VerifyNumberOfMatches.run("ID Type":"By",By:EventOverviewDashboardLocators.heatmapCellLevel2, "Number of Matches": params."Heatmap Level 2 Count".toInteger())            
        }  
        
        if(params."Heatmap Level 3 Count"){
            VerifyNumberOfMatches.run("ID Type":"By",By:EventOverviewDashboardLocators.heatmapCellLevel3, "Number of Matches": params."Heatmap Level 3 Count".toInteger())            
        }  
        
        if(params."Heatmap Level 4 Count"){
            VerifyNumberOfMatches.run("ID Type":"By",By:EventOverviewDashboardLocators.heatmapCellLevel4, "Number of Matches": params."Heatmap Level 4 Count".toInteger())            
        }         
  
        if(params."Heatmap Level 5 Count"){
            VerifyNumberOfMatches.run("ID Type":"By",By:EventOverviewDashboardLocators.heatmapCellLevel5, "Number of Matches": params."Heatmap Level 5 Count".toInteger())            
        }        
        
        
    }
}