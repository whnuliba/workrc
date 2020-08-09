package com.workrc.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {
    public static final String FORMAT_S1="yyyy-MM-dd hh:mm:ss";
    public  static String getFormatDate(Date date, String format){
        if(null == format || "".equals(format.trim()))
            format=FORMAT_S1;
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(date);
    }
}
