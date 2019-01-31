package week_11;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Timetable {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.parse("2003-03-13");
        LocalTime localTime = LocalTime.parse("10:00:00");
        LocalDateTime start = LocalDateTime.of(localDate, localTime);
        System.out.println(start.toLocalDate() + " " + start.toLocalTime());


        LocalDateTime timeAfter37Min21Seconds = start.plusSeconds(21).plusMinutes(37);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(timeAfter37Min21Seconds.format(formatter));

        LocalDateTime airportArriving = timeAfter37Min21Seconds.plusHours(1).plusMinutes(30);
        System.out.println(airportArriving.format(formatter));

        LocalTime firstFlightTime = LocalTime.parse("11:04:00");
        LocalDateTime flightTime = LocalDateTime.of(localDate, firstFlightTime);
        Boolean missTheFlight = airportArriving.toLocalTime().isAfter(flightTime.toLocalTime());

        if (missTheFlight) {
            System.out.println("He missed his flight");
        }

        LocalTime nextFlightTime = LocalTime.parse("18:45:00");
        LocalDateTime nextFlight = LocalDateTime.of(localDate, nextFlightTime);
        Duration duration = Duration.between(airportArriving, nextFlight);
        System.out.println(duration.toHours() + ":" + duration.minusHours(duration.toHours()).toMinutes());


        LocalDateTime after11HouresAnd50Min = nextFlight.plusHours(11).plusMinutes(50);
        System.out.println(after11HouresAnd50Min);
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime inlondon = after11HouresAnd50Min.atZone(london);
        ZonedDateTime inTokyo = inlondon.withZoneSameInstant(tokyo);
        System.out.println(inlondon);
        System.out.println(inTokyo);

        LocalDateTime localDateTimeInTokyo = inTokyo.toLocalDateTime();
        LocalDateTime wakeUp = localDateTimeInTokyo.plusHours(11);
        System.out.println("WakeUp :"+wakeUp);


        LocalDateTime shootingTime = wakeUp.plusMinutes(47);
        System.out.println(" shooting starts in "+shootingTime);

        Duration preparTime = Duration.ofMinutes(47).minusSeconds(546);
        System.out.println(preparTime);

        LocalDateTime afterShotting = shootingTime.plusHours(7);
        LocalTime lunch = LocalTime.parse("13:00");
        LocalTime dinner = LocalTime.parse("20:00");

        System.out.println("Shooting is done"+afterShotting);

        Duration lanchTime = Duration.between(afterShotting.toLocalTime(), lunch);
        Duration dinnerTime = Duration.between(afterShotting.toLocalTime(), dinner);

        if (lanchTime.toMinutes() < dinnerTime.toMinutes()) {
            System.out.println("Mugatu has lunch");
        } else {
            System.out.println("Mugatu has dinner");
        }

        LocalDateTime flightToLondonBack = afterShotting.plusDays(3).plusHours(12).plusHours(11).plusMinutes(50);
        System.out.println("last day in Tokyo "+flightToLondonBack);
        ZonedDateTime lastDayTokyo = flightToLondonBack.atZone(tokyo);
        ZonedDateTime londonBack = lastDayTokyo.withZoneSameInstant(london);
        System.out.println(londonBack);


        LocalDateTime londonBackLocalTime = londonBack.toLocalDateTime();
        LocalDateTime afterFans = londonBackLocalTime.plusSeconds(173 * 12);
        System.out.println("after funs"+afterFans);

        LocalDateTime inHotel = afterFans.plusHours(1);
        System.out.println(inHotel);


        LocalDateTime inSauna = inHotel.plusMinutes(30);
//        Duration sauna1 = Duration.between(LocalTime.parse("09:00"), LocalTime.parse("14:00"));
//        Duration sauna2 = Duration.between(LocalTime.parse("16:00"), LocalTime.parse("20:00"));

        if (inSauna.toLocalTime().isBefore(LocalTime.parse("14:00")) || inSauna.toLocalTime().isAfter(LocalTime.parse("09:00"))) {
            System.out.println("he caan go to sauna");
        }
        if ((inSauna.toLocalTime().isBefore(LocalTime.parse("20:00")) && inSauna.toLocalTime().isAfter(LocalTime.parse("16:00")))) {
            System.out.println("he can go to sauna");
        } else {
            System.out.println("Inshalla trou7 3al chahanam");
        }


        Boolean isleabYear = inHotel.toLocalDate().isLeapYear();
        DayOfWeek getday = inHotel.getDayOfWeek();
        System.out.println(getday);
        if (getday.equals(DayOfWeek.valueOf("THURSDAY")) || getday.equals(DayOfWeek.valueOf("SUNDAY")) ||
                isleabYear && getday.equals(DayOfWeek.valueOf("SATURDAY"))) {
            System.out.println("lucky");
        }
        else {
            System.out.println("Unlucky");
        }

        LocalDateTime after1Week = inHotel.plusWeeks(1);
        System.out.println(after1Week);
        ZonedDateTime inLondonoAfterOneWeek = after1Week.atZone(london);
        ZonedDateTime inTokyoAfteoneWeek = inLondonoAfterOneWeek.withZoneSameInstant(tokyo);
        System.out.println(inTokyoAfteoneWeek);
        Duration timeTokyo = Duration.between(inTokyoAfteoneWeek.toLocalTime(),LocalTime.parse("18:30") );





    }


}