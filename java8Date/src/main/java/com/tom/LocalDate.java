package com.tom;

import org.joda.time.DateTime;

import java.time.*;
import java.util.Date;

/**
 * @Author tom
 * @Date 2018/3/8 16:51
 */

public class LocalDate {

  public static void main(String[] args) {
    DateTime today=DateTime.now();
    DateTime tomorrow=today.plusDays(1);
    DateTime oneHourAfter=today.plusHours(1);
    System.out.println(today.toString());
    System.out.println(tomorrow.toString());
    System.out.println(oneHourAfter.toString());
    DateTime day=new DateTime(2018,03,8,16,59,49);
    System.out.println(day.getYear());
    /*
    *  一个月的第几天
    * */
    System.out.println(day.getDayOfMonth());
    System.out.println(day.getDayOfWeek());
    System.out.println(day.dayOfYear().getAsString());
    /*
    * LocalDate／LocalTime／LocalDateTime
    * */
    /*
    *
     •Duration：用于计算两个“时间”间隔，Duration.between…
   •Period：用于计算两个“日期”间隔，Period.between…
    * */
    //Duration.between();
    System.out.println("8888888888888888888");
    java.time.LocalDate localDate= java.time.LocalDate.now();
    java.time.LocalDate localDate1= java.time.LocalDate.MAX;
   Period period= Period.between(localDate,localDate1);
    System.out.println(period.getMonths());

    /*
    * Clock 时钟操作
    * Clock类提供了访问当前日期和时间的方法，Clock是时区敏感的，可以用来取代System.currentTimeMillis() 来获取当前的微秒数。某一个特定的时间点也可以使用Instant类来表示，Instant类也可以用来创建老的java.util.Date对象。
    * */

    Clock clock=Clock.systemDefaultZone();
    long mills=clock.millis();
    Instant instant=clock.instant();
    Date date=Date.from(instant);
    /*
    *
      i.getAvailableZoneIds() : 可以获取所有时区时区
    •
    i.of(id) : 用指定的时区信息获取 ZoneId 对象
    * */
    ZonedDateTime T=ZonedDateTime.now();
    System.out.println(T.toLocalDateTime());
    System.out.println(T.getZone());
    System.out.println(T.getZone());

  }
}
