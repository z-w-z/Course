package com.course.demo.Util;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataHandleUtil {

    //日期转周几
    public static String DateToWeek(Date date){
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
        Calendar cal = Calendar.getInstance(); // 获得一个日历
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
        if (w < 0)
            return "0";
        return weekDays[w];
    }
}
