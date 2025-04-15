package actions.Utils;

import java.text.SimpleDateFormat
import java.util.Date

class ReturnCurrentTime{
        public static run(def params){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        // Round the minutes to the nearest hour
        if (calendar.get(Calendar.MINUTE) >= 58) {
            calendar.add(Calendar.HOUR, 1);
        }
        calendar.set(Calendar.MINUTE, 0);

        SimpleDateFormat dateFormat = new SimpleDateFormat("${params."Format"}");
        String currentTime = dateFormat.format(calendar.getTime());
        println("Current time (12-hour format, rounded to the hour): ${currentTime}");
        return currentTime;
    }
}