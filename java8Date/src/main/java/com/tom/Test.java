package com.tom;

import java.time.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * @Author tom
 * @Date 2018/3/8 17:35
 */

public class Test {
  public static void main(String[] args) {
/*
*  Date 转Locadate
* */
   Date date1=new Date();
   Instant instant=date1.toInstant();
   ZoneId zoneId1=ZoneId.systemDefault();
    LocalDate localDate=instant.atZone(zoneId1).toLocalDate();
    System.out.println("Date="+date1);
    System.out.println("LocalDate="+localDate);
    /*
    *  结果 Date=Thu Mar 08 17:47:04 CST 2018
      LocalDate=2018-03-08
    * */
    /*
    *  Locate 转date
    * */
    ZoneId zoneId=ZoneId.systemDefault();
    java.time.LocalDate date= LocalDate.now();
    ZonedDateTime zdt=date.atStartOfDay(zoneId);
    Date date2=Date.from(zdt.toInstant());
    System.out.println("LocalDate="+date);
    System.out.println("Date="+date2);

    /*
    *  结果 LocalDate=2018-03-08
Date=Thu Mar 08 00:00:00 CST 2018
    * */
  }
}
