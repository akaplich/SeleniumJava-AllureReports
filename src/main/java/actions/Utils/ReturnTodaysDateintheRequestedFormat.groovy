package actions.Utils;

import java.text.SimpleDateFormat 
import java.time.LocalDateTime   

class ReturnTodaysDateintheRequestedFormat{
    public static run(def params){
        String formattedDate;
        
        SimpleDateFormat outputFormat = new SimpleDateFormat("${params."Format"}")
        if (params.Date==null){
            return outputFormat.format(new Date())
        }
        else{
            SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy"); 
            Date date = inputFormat.parse(params.Date)	
            return outputFormat.format(date)
        }
        println("Formatted date: ${formattedDate}")        
    }
}