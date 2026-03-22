package Static_Methods_in_Interfaces.Date_Format_Utility;

import java.time.LocalDate;

public class DateTest {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        String formatted1 = DateUtils.formatDate(today, "dd-MM-yyyy");
        String formatted2 = DateUtils.formatDate(today, "MMM dd, yyyy");

        System.out.println("Format 1: " + formatted1);
        System.out.println("Format 2: " + formatted2);
    }

}
