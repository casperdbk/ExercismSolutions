package Leap;

import java.time.LocalDate;

class Leap {
    boolean isLeapYear(int year) {
        LocalDate date = LocalDate.of(year,1,1);
        return date.isLeapYear();
    }
}

