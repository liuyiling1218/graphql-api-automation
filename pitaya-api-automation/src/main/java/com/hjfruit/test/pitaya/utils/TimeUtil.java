package com.hjfruit.test.pitaya.utils;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * @description {}
 * @Author 吴随伟
 * @date 2021/12/23
 */
public class TimeUtil {
    private static TimeZone timeZone = TimeZone.getTimeZone("GMT+8:00");

    /**
     * 获取某一个时间戳当天的开始时间戳
     *
     * @param timeStamp
     * @return
     */
    public static Long getDailyStartTime(Long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        calendar.setTimeZone(timeZone);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTimeInMillis();
    }

    /**
     * 获取某一个时间戳当天的结束时间戳
     *
     * @param timeStamp
     * @return
     */
    public static Long getDailyEndTime(Long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        calendar.setTimeZone(timeZone);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 999);
        return calendar.getTimeInMillis();
    }
}
