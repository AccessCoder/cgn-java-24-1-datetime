package de.neuefische;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {

        //LocalDate -> Nur Datum
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: " + localDate);

        //LocalDateTime -> Datum & (Uhr)Zeit
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);


        //ZonedDateTime -> Datum & (Uhr)Zeit & Zeitzone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("ZonedDateTime: " + zonedDateTime);

        //Instant = Zulu Zeitpunkt
        Instant instant = Instant.now();
        System.out.println("Instant: " + instant);

        //Umwandlung Instant in LocalDateTime
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime convertedLocalDateTime = instant.atZone(zoneId).toLocalDateTime();
        System.out.println("Converted Instant to LocalDateTime: " + convertedLocalDateTime);

        //Umwandlung LocalDateTime in Instant
        Instant convertedInstant = localDateTime.atZone(zoneId).toInstant();
        System.out.println("Converted LocalDateTime to Instant: " + convertedInstant);

        //Format der Zeitangabe anpassen
        //d = Tag / M = Monat / y = Jahr / H = Stunde / m = Minute / s = Sekunde / n = Nano
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        String formattedDate = LocalDateTime.now().format(formatter);
        System.out.println("Umgewandelt mit Formatter: " + formattedDate);

        //String in LocalDate umwandeln (Parsen)
        LocalDate parsedDate = LocalDate.parse("12.08.2024", formatter);
        System.out.println("Parse String to LocalDate: " + parsedDate);

        //Errechnen der Diff. zwischen zwei Zeitpunkten
        LocalDateTime start = LocalDateTime.of(2024,2,12,9,0,0);
        LocalDateTime finish = LocalDateTime.of(2024,2,12,11,0,0);

//        long hoursBetween = ChronoUnit.HOURS.between(start, finish);
    }
}