package week_11.reflection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println(getSummerSolsticeCountdown(LocalDate.parse("2020-10-01")));
        System.out.println(getYearSolstice(LocalDate.parse("2020-10-01")));
    }

    public static String getSummerSolsticeCountdown(LocalDate localDate) {

        if (localDate.isAfter(getYearSolstice(localDate))) {
           return LocalDate.of(getYearSolstice(localDate).getYear()+1,getYearSolstice(localDate).getMonthValue(),getYearSolstice(localDate).getDayOfMonth()).toString();
        }

        return getYearSolstice(localDate).toString();
    }

    private static LocalDate getYearSolstice(LocalDate localDate) {
        if (localDate.isLeapYear()) {
            return LocalDate.of( localDate.getYear(),6,20);

        }
        return LocalDate.of(localDate.getYear(),6,21);
    }
    }





