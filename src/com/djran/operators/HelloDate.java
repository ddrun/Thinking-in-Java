package com.djran.operators;

import com.djran.commonUtils.DateUtils;
import java.util.Date;
/**
 * Created by d.djran@gmail.com on 2016-12-29.
 * 打印规定格式的字符串日期
 */
public class HelloDate {
    public static void main(String []args){
        System.out.println("The time is "+new Date());
        String dateStr= DateUtils.getStringDate(new Date());
        System.out.println("The time is "+dateStr);
    }
}
