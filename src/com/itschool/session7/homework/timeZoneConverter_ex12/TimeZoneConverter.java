package com.itschool.session7.homework.timeZoneConverter_ex12;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZoneConverter {
    public static void convertToTimeZone() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date and time (YYYY-MM-DD HH:MM:SS): ");
        String dateTimeInput = sc.nextLine();

        System.out.print("Enter timezone (e.g., EST, PST, UTC, etc.): ");
        String timeZoneInput = sc.nextLine().trim().toUpperCase();
        LocalDateTime localDateTime = LocalDateTime.parse(
                dateTimeInput,
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        );
        ZonedDateTime inputTime = localDateTime.atZone(getZoneId(timeZoneInput));

        System.out.print("Provide the desired time zone: ");
        String targetZone = sc.nextLine().trim().toUpperCase();
        ZoneId zoneId = getZoneId(targetZone);
        ZonedDateTime targetTime = inputTime.withZoneSameInstant(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Converted Time: " + targetTime.format(formatter));
        sc.close();
    }

    private static ZoneId getZoneId(String abbreviation) {
        return switch (abbreviation) {
            case "EST" -> ZoneId.of("America/New_York");
            case "PST" -> ZoneId.of("America/Los_Angeles");
            case "CST" -> ZoneId.of("America/Chicago");
            case "MST" -> ZoneId.of("America/Denver");
            case "GMT" -> ZoneId.of("GMT");
            case "UTC" -> ZoneId.of("UTC");
            case "IST" -> ZoneId.of("Asia/Kolkata");
            case "JST" -> ZoneId.of("Asia/Tokyo");
            case "BST" -> ZoneId.of("Europe/London");
            case "CET" -> ZoneId.of("Europe/Paris");
            default -> ZoneId.of(abbreviation);
        };
    }

        public static void main(String[] args) {
            convertToTimeZone();
    }
}
