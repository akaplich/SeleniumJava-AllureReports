package actions.selenium

import actions.selenium.Browser
import java.net.URL

class NavigateToURL{
  
  public static void run(def params){
      def link
      println("will navigate to ${params."URL"}")
      
      if (params.URL.contains(',') && params."Link Number In Case Of Multiple URL" != null){
          println("Will select ${params."Link Number In Case Of Multiple URL"} URL")
          link = params.URL.split(',')[params."Link Number In Case Of Multiple URL".toInteger()]
      }else {
          link = params.URL
      } 
      
      /*if(params."Link Number In Case Of Multiple URL"){
          link = params.URL.split(",")[params."Link Number In Case Of Multiple URL".toInteger()]          
      } else {
          link = params.URL
      }*/
      Browser.Driver.navigate().to("${link}")
      println("Navigated to URL")
  }
}