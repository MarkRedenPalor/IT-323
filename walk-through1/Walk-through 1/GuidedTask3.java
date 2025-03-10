//Print today's date and time using Java’s built-in libraries.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GuidedTask3{
        public static void main(String[] args){
            LocalDateTime currentDate = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
            String DateAndTime = currentDate.format(formatter);

            System.out.println("Today's Date and Time: " + DateAndTime);
       } 
}