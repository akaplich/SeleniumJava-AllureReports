package actions.Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AddSubtractFromTime{
    public String run(def params){
        LocalDateTime now, newTime
        
        if(params."Time"=="Now"){
            now = LocalDateTime.now();
        }
        if(params."Add or Subtract".contains("Subtract")){
            if(params.Units=="Hours"){
                newTime = now.minusHours(params."Number".toInteger()).withMinute(0).withSecond(0);;
            }
        }
        if(params."Add or Subtract".contains("Add")){
            if(params.Units=="Hours"){
                newTime = now.plusHours(params."Number".toInteger()).withMinute(0).withSecond(0);;
            }
        }
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(params."Format");
        return newTime.format(formatter);
    }
}