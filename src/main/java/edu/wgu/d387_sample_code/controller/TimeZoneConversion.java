package edu.wgu.d387_sample_code.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import java.time.*;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class TimeZoneConversion implements Runnable{
    public static String getTime() {

        // Create DateTimeObject
        ZonedDateTime time = ZonedDateTime.now();
        DateTimeFormatter theTimeFormat = DateTimeFormatter.ofPattern("HH:mm");

        // Different time zone conversion
        ZonedDateTime eT = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime mT = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime utc = time.withZoneSameInstant(ZoneId.of("UTC"));

        // return time string output
        String displayTime = eT.format(theTimeFormat) + " EST, " + mT.format(theTimeFormat) + " MTN, " + utc.format(theTimeFormat) + " UTC";
        return displayTime;
    }

    @Override
    public void run() {
        System.out.println(getTime());
    }
}
