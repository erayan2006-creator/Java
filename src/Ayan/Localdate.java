package Ayan;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Localdate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("What date is it today? It's " + date);
        System.out.println("Year: " + date.getYear() + ". Month: " + date.getMonth() + ". Day: " + date.getDayOfMonth() + ". Day of the week: " + date.getDayOfWeek());

        ZoneId zoneNewYork = ZoneId.of("America/New_York"); // Тут можно подбирать любой город на свой вкус
        date = LocalDate.now(zoneNewYork);
        System.out.println("What date is it today in New York? It's " + date);

        date = LocalDate.of(2006, 7, 10);
        System.out.println("When is Ayan's birthday? It's " + date);
        // LocalDate.of(2006, 7, 10) = LocalDate.of(2006, Month.JULY, 10)
        // LocalDate.ofYearDay(2024, 256) = LocalDate.of(2024, 9, 12)
        // LocalDate.of(2006, 7, 10) = LocalDate.parse("2006-07-10")

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/*&MM:;dd"); // Вместо yyyy-MM-dd превращает в yyyy/*&MM:;dd
        date = LocalDate.parse("2006/*&07:;10", formatter);
        System.out.println("When is Ayan's birthday? It's " + date);
        // Метод isLeapYear() проверяет, является ли год високосным. Example: date.isLeapYear()
        // Метод getEra() проверяет, является ли год до нашей эры или после. Отрицательный год — это период до нашей эры: BCE. Положительный год — это наша эра: CE
        // Нужно обязательно создавать новый объект. LocalDate позволяет двигать дату вперёд и назад: plusYears(), plusMonths(), plusWeeks(), plusDays(), а также minusYears(), minusMonths(), minusWeeks(), minusDays(). Example: date.plusYears(4)
        // '==' = 'isEqual()' | '<' = 'isBefore()' | '>' = 'isAfter()'

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("What date is it today? It's " + dateTime); // (DATE)T(TIME)
        System.out.println("Year: " + dateTime.getYear() + ". Month: " + dateTime.getMonth() + ". Day: " + dateTime.getDayOfMonth() + ". Day of the week: " + dateTime.getDayOfWeek() + ". Time: " + dateTime.getHour() + ":" + dateTime.getMinute());

        LocalDateTime dt1 = LocalDateTime.of(2023, 3, 5, 13, 30);

        // LocalDateTime позволяет двигать время вперёд и назад: plusHours(), plusMinutes() и аналогичные minus-методы

    }
}