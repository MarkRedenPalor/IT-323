//2. Use LocalDateTime to print the current time along with the date. 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SelfPractice2 {
     public static void main(String[] args){
            LocalDateTime currentDate = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
            String DateAndTime = currentDate.format(formatter);

            System.out.println("Today's Date and Time: " + DateAndTime);
       } 
}
