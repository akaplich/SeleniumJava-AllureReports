package actions.Utils;

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

class ReturnDateinRequestedFormat{
    public static run(def params) {
        
        // Parse the format parameter
        SimpleDateFormat dateFormat = new SimpleDateFormat("${params."Format"}")
        
       try {
           // If it's a number, treat it as days to add/subtract
           int daysToAddOrSubtract = Integer.parseInt(params.Days)
            // Check if params.Days is a number or a specific date
            if (params."Previous Month Date" == null) {
                // Create a Calendar instance and set it to today's date
                Calendar calendar = Calendar.getInstance()

                // Add the specified number of days to the calendar
                calendar.add(Calendar.DAY_OF_YEAR, daysToAddOrSubtract)

                // Get the new date after adding/subtracting days
                Date adjustedDate = calendar.getTime()

                // Format the adjusted date into the requested format
                String formattedDate = dateFormat.format(adjustedDate)

                // Print and return the formatted date
                println("Adjusted date: ${formattedDate}")
                return formattedDate
            } else if (params."Previous Month Date" == true) {
                // Handle PreviousMonthDate parameter
                Calendar calendar = Calendar.getInstance()

                // Set calendar to the first day of the current month
                calendar.set(Calendar.DAY_OF_MONTH, 1)

                // Subtract one day to go to the last day of the previous month
                calendar.add(Calendar.DAY_OF_YEAR, daysToAddOrSubtract)

                // Get the last day of the previous month
                Date previousMonthDate = calendar.getTime()

                // Format the previous month date into the requested format
                String formattedDate = dateFormat.format(previousMonthDate)

                // Print and return the formatted date
                println("Previous month's last date: ${formattedDate}")
                return formattedDate;
            } else {
                // Treat params.Days as a specific date string
                SimpleDateFormat inputDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                Date specificDate = inputDateFormat.parse(params.Days)

                // Format the specific date into the requested format
                String formattedDate = dateFormat.format(specificDate)

                // Print and return the formatted date
                println("Specified date: ${formattedDate}")
                return formattedDate
            }
        } catch (ParseException e) {
            // Handle invalid date format
            println("Error: Invalid date format in params.Days. Expected MM/dd/yyyy for specific dates.")
            throw new IllegalArgumentException("Invalid date format: " + params.Days)
        }
    }
}