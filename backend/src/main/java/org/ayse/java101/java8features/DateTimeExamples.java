package org.ayse.java101.java8features;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimeExamples {

  public static void main(String[] args) {
    //             //
    // LOCAL DATE  //
    //             //
    System.out.println("// LOCAL DATE  //");

    //Current Date
    LocalDate today = LocalDate.now();
    System.out.println("Current Date=" + today);

    //Creating LocalDate by providing input arguments
    LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
    System.out.println("Specific Date=" + firstDay_2014);

    //Try creating date by providing invalid inputs
    //LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
    //Exception in thread "main" java.time.DateTimeException:
    //Invalid date 'February 29' as '2014' is not a leap year

    //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
    LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
    System.out.println("Current Date in IST=" + todayKolkata);

    //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
    //LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));

    //Getting date from the base date i.e 01/01/1970
    LocalDate dateFromBase = LocalDate.ofEpochDay(365);
    System.out.println("365th day from base date= " + dateFromBase);

    LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
    System.out.println("100th day of 2014=" + hundredDay2014);

    //            //
    // LOCAL TIME //
    //            //
    System.out.println("// LOCAL TIME //");

    //Current Time
    LocalTime time = LocalTime.now();
    System.out.println("Current Time=" + time);

    //Creating LocalTime by providing input arguments
    LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
    System.out.println("Specific Time of Day=" + specificTime);

    //Try creating time by providing invalid inputs
    //LocalTime invalidTime = LocalTime.of(25,20);
    //Exception in thread "main" java.time.DateTimeException:
    //Invalid value for HourOfDay (valid values 0 - 23): 25

    //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
    LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
    System.out.println("Current Time in IST=" + timeKolkata);

    //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
    //LocalTime todayIST = LocalTime.now(ZoneId.of("IST"));

    //Getting date from the base date i.e 01/01/1970
    LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
    System.out.println("10000th second time= " + specificSecondTime);

    //                 //
    // LOCAL DATE TIME //
    //                 //
    System.out.println("// LOCAL DATE TIME //");
    //Current Date
    LocalDateTime todayltd = LocalDateTime.now();
    System.out.println("Current DateTime=" + todayltd);

    //Current Date using LocalDate and LocalTime
    todayltd = LocalDateTime.of(LocalDate.now(), LocalTime.now());
    System.out.println("Current DateTime=" + todayltd);

    //Creating LocalDateTime by providing input arguments
    LocalDateTime specificDate = LocalDateTime.of(2014, Month.JANUARY, 1, 10, 10, 30);
    System.out.println("Specific Date=" + specificDate);

    //Try creating date by providing invalid inputs
    //LocalDateTime feb29_2014 = LocalDateTime.of(2014, Month.FEBRUARY, 28, 25,1,1);
    //Exception in thread "main" java.time.DateTimeException:
    //Invalid value for HourOfDay (valid values 0 - 23): 25

    //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
    LocalDateTime todayKolkataLtd = LocalDateTime.now(ZoneId.of("Asia/Kolkata"));
    System.out.println("Current Date in IST=" + todayKolkataLtd);

    //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
    //LocalDateTime todayIST = LocalDateTime.now(ZoneId.of("IST"));

    //Getting date from the base date i.e 01/01/1970
    LocalDateTime dateFromBaseLtd = LocalDateTime.ofEpochSecond(10000, 0, ZoneOffset.UTC);
    System.out.println("10000th second time from 01/01/1970= " + dateFromBaseLtd);

    //         //
    // INSTANT //
    //         //

    //Current timestamp
    Instant timestamp = Instant.now();
    System.out.println("Current Timestamp = " + timestamp);

    //Instant from timestamp
    Instant specificTimeInstant = Instant.ofEpochMilli(timestamp.toEpochMilli());
    System.out.println("Specific Time = " + specificTimeInstant);

    //Duration example
    Duration thirtyDay = Duration.ofDays(30);
    System.out.println(thirtyDay);

    DateTimeExamples.dateTimeUtilities();
    DateTimeExamples.dateTimeFormatting();
    DateTimeExamples.dateAPILegacySupport();
  }

  public static void dateTimeUtilities() {
    System.out.println("// DATE TIME UTILITIES //");
    LocalDate today = LocalDate.now();

    //Get the Year, check if it's leap year
    System.out.println("Year " + today.getYear() + " is Leap Year? " + today.isLeapYear());

    //Compare two LocalDate for before and after
    System.out.println("Today is before 01/01/2015? " + today.isBefore(LocalDate.of(2015, 1, 1)));

    //Create LocalDateTime from LocalDate
    System.out.println("Current Time=" + today.atTime(LocalTime.now()));

    //plus and minus operations
    System.out.println("10 days after today will be " + today.plusDays(10));
    System.out.println("3 weeks after today will be " + today.plusWeeks(3));
    System.out.println("20 months after today will be " + today.plusMonths(20));

    System.out.println("10 days before today will be " + today.minusDays(10));
    System.out.println("3 weeks before today will be " + today.minusWeeks(3));
    System.out.println("20 months before today will be " + today.minusMonths(20));

    //Temporal adjusters for adjusting the dates
    System.out.println(
        "First date of this month= " + today.with(TemporalAdjusters.firstDayOfMonth()));
    LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
    System.out.println("Last date of this year= " + lastDayOfYear);

    Period period = today.until(lastDayOfYear);
    System.out.println("Period Format= " + period);
    System.out.println("Months remaining in the year= " + period.getMonths());
  }

  public static void dateTimeFormatting() {
    System.out.println("// DATE TIME FORMATTING //");
    //Format examples
    LocalDate date = LocalDate.now();
    //default format
    System.out.println("Default format of LocalDate=" + date);
    //specific format
    System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
    System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));

    LocalDateTime dateTime = LocalDateTime.now();
    //default format
    System.out.println("Default format of LocalDateTime=" + dateTime);
    //specific format
    System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
    System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));

    Instant timestamp = Instant.now();
    //default format
    System.out.println("Default format of Instant=" + timestamp);
  }

  public static void dateAPILegacySupport() {
    System.out.println("// DATE API LEGACY SUPPORT //");

    //Date to Instant
    Instant timestamp = new Date().toInstant();
    //Now we can convert Instant to LocalDateTime or other similar classes
    LocalDateTime date = LocalDateTime.ofInstant(timestamp,
        ZoneId.of(ZoneId.SHORT_IDS.get("PST")));
    System.out.println("Date = " + date);

    //Calendar to Instant
    Instant time = Calendar.getInstance().toInstant();
    System.out.println(time);
    //TimeZone to ZoneId
    ZoneId defaultZone = TimeZone.getDefault().toZoneId();
    System.out.println(defaultZone);

    //ZonedDateTime from specific Calendar
    ZonedDateTime gregorianCalendarDateTime = new GregorianCalendar().toZonedDateTime();
    System.out.println(gregorianCalendarDateTime);

    //Date API to Legacy classes
    Date dt = Date.from(Instant.now());
    System.out.println(dt);

    TimeZone tz = TimeZone.getTimeZone(defaultZone);
    System.out.println(tz);

    GregorianCalendar gc = GregorianCalendar.from(gregorianCalendarDateTime);
    System.out.println(gc);
  }
}
