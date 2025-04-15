package actions.Utils;

import java.time.format.DateTimeFormatter
import java.time.ZonedDateTime 
import java.time.ZoneOffset
import java.time.temporal.ChronoUnit
import java.time.LocalDate


class AddSubstractFromDate{
	public static String run(def params){
        //Date
    	//Operation: Add, Subtract
    	//Number:1,2
    	//Units: Days, Months, Years
        
       //set formatter to the default format MM/dd/yyyy
       DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy") 
       ZonedDateTime today= ZonedDateTime.now(ZoneOffset.UTC)

       if(params."Add or Subtract".contains("Subtract")){
            if(params.Units.contains("Days")){
                return dateFormat.format(today.minus(params."Number".toInteger(),ChronoUnit.DAYS))
            }
           if(params.Units.contains("Months")){
                return dateFormat.format(today.minus(params."Number".toInteger(),ChronoUnit.MONTHS))
            }
           if(params.Units.contains("Years")){
                return dateFormat.format(today.minus(params."Number".toInteger(),ChronoUnit.YEARS))
            }
        }
        if(params."Add or Subtract".contains("Add")){
            if(params.Units.contains("Days")){
                println("We are adding Days")
               	println("Will return ${dateFormat.format(today.plus(params."Number".toInteger(),ChronoUnit.DAYS))}")
                return dateFormat.format(today.plus(params."Number".toInteger(),ChronoUnit.DAYS))
            }
           if(params.Units.contains("Months")){
                return dateFormat.format(today.plus(params."Number".toInteger(),ChronoUnit.MONTHS))
            }
           if(params.Units.contains("Years")){
                return dateFormat.format(today.plus(params."Number".toInteger(),ChronoUnit.YEARS))
            }
        }
    }
}