package Exercise01;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int endOfMonth = now.lengthOfMonth();
        int remainingDaysOfTheMonth = endOfMonth - now.getDayOfMonth();
        System.out.println("Days until end of the month: " + remainingDaysOfTheMonth);

        int endOfYear = now.lengthOfYear();
        int remainingDaysOfTheYear = endOfYear - now.getDayOfYear();
        System.out.println("Days until end of the year: " + remainingDaysOfTheYear);
    }
}
