package com.djran.commonUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by d.djran@gmail.com on 2016-12-29.
 */
public class DateUtils {
    public  static String getStringDate(Date date){
        SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString=formatter.format(date);
        return  dateString;
    }
}
