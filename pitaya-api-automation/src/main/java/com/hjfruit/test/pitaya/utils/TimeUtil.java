package com.hjfruit.test.pitaya.utils;

import java.time.*;

/**
 * @description {}
 * @Author 吴随伟
 * @date 2021/12/23
 */
public class TimeUtil {
    /**
     * 获取某一个日期的开始时间戳
     *
     * @param date
     * @return
     */
    public static Long getDateStartTimeStamp(String date) {
        return LocalDateTime.of(LocalDate.parse(date), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取某一个日期的结束时间戳
     *
     * @param date
     * @return
     */
    public static Long getDateEndTimeStamp(String date) {
        return LocalDateTime.of(LocalDate.parse(date), LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }


    /**
     * 获取某一个日期之前几天的结束时间戳
     *
     * @param date
     * @return
     */
    public static Long getDateMinusDayEndTimeStamp(String date, long minusDays) {
        return LocalDateTime.of(LocalDate.parse(date), LocalTime.MAX).minusDays(minusDays).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取某一个日期之前几天的结束时间戳
     *
     * @param date
     * @return
     */
    public static Long getDatePlusDayEndTimeStamp(String date, long plusDays) {
        return LocalDateTime.of(LocalDate.parse(date), LocalTime.MAX).plusDays(plusDays).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取当前时间之后几天的开始时间戳
     *
     * @return
     */
    public static Long getPlusDaysStartTimeStampOfCurrent(long plusDays) {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MIN).plusDays(plusDays).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取当前时间之后几天的开始时间戳
     *
     * @return
     */
    public static Long getPlusDaysEndTimeStampOfCurrent(long plusDays) {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MAX).plusDays(plusDays).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取当前时间之前几天的开始时间戳
     *
     * @return
     */
    public static Long getMinusDaysStartTimeStampOfCurrent(long minusDays) {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MIN).minusDays(minusDays).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取当前时间之前几天的结束时间戳
     *
     * @return
     */
    public static Long getMinusDaysEndTimeStampOfCurrent(long minusDays) {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MAX).minusDays(minusDays).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取当前时间戳
     *
     * @return
     */
    public static Long getCurrentTimeStamp() {
        return Instant.now().toEpochMilli();
    }

    /**
     * 获取当天开始时间戳
     *
     * @return
     */
    public static Long getDailyStartTimeStamp() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MIN).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 获取当天结束时间戳
     *
     * @return
     */
    public static Long getDailyEndTimeStamp() {
        return LocalDateTime.of(LocalDate.now(), LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }
}
