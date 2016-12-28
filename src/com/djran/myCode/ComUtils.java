package com.djran.myCode;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComUtils {
	/**
	 * 获取两个时间段之间的毫秒数
	 * @param startTime
	 * @param endTime
	 * @return  毫秒
	 * @author djran
	 * @Date 2016年8月17日 上午11:51:04
	 */
	public static long getMillisecond(Date startTime,Date endTime){
		long millisecond=endTime.getTime()-startTime.getTime();
		return millisecond;
	}
	/**
	 * 字符串转换为日期
	 * @param str
	 * @return date 
	 * @author djran
	 * @Date 2016年8月17日 下午1:53:11
	 */
	public static Date stringToDate(String str){
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date=null;
		try {
			if(str==null ||str.trim().equals("")){
				date= new Date();
			}else {
				date= dateFormat.parse(str);
			}		
		} catch (Exception e) {
			System.out.println("字符串转换日期错误！");
			date= new Date();
			e.printStackTrace();
		}	
		return date;
	}
	/**
	 * 将日期转换为字符串，type为转换格式：yyyy-MM-dd hh:mm:ss\yyyy-MM-dd等
	 * @param date
	 * @param type
	 * @return  
	 * @author djran
	 * @Date 2016年8月17日 下午2:03:24
	 */
	public static String dateToString(Date date,String type){
		SimpleDateFormat dateFormat=new SimpleDateFormat(type);
		try {
			return dateFormat.format(date);
		} catch (Exception e) {
			System.out.println("日期转换字符串错误！");
			e.printStackTrace();
		}
		return null;
	}
	/**
	 * 获取某个日期的年、月、日
	 * @param date
	 * @return YEAR\MONTH\DAY 
	 * @author djran
	 * @Date 2016年8月17日 下午2:42:56
	 */
	public static final int getYear(Date date){
		Calendar calendar=Calendar.getInstance();
		if(date==null){
			return -1;
		}else{
			calendar.setTime(date);
			return calendar.get(calendar.YEAR);
		}

	}
	
	public static final int getMonth(Date date){
		Calendar calendar=Calendar.getInstance();
		if(date==null){
			return -1;
		}else{
			calendar.setTime(date);
			return calendar.get(calendar.MONTH)+1;
		}
	}
	
	public static final int getDay(Date date){
		Calendar calendar=Calendar.getInstance();
		if(date==null){
			return -1;
		}else{
			calendar.setTime(date);
			return calendar.get(calendar.DAY_OF_MONTH);
		}
	}
	/**
	 * 获取date日期的时间（24小时制）、（HOUR为12小时）
	 * @param date
	 * @return  
	 * @author djran
	 * @Date 2016年8月17日 下午4:54:26
	 */
	public static final int getHour(Date date){
		Calendar calendar=Calendar.getInstance();
		if(date==null){
			return -1;
		}else{
			calendar.setTime(date);
			return calendar.get(calendar.HOUR_OF_DAY);
		}
	}
	
	public static final int getMinute(Date date){
		Calendar calendar=Calendar.getInstance();
		if(date==null){
			return -1;
		}else{
			calendar.setTime(date);
			return calendar.get(calendar.MINUTE);
		}
	}
	
	public static final int getSecond(Date date){
		Calendar calendar=Calendar.getInstance();
		if(date==null){
			return -1;
		}else{
			calendar.setTime(date);
			return calendar.get(calendar.SECOND);
		}
	}
	/**
	 * 设置日期年月日，时分秒默认为当前
	 * @param year
	 * @param month
	 * @param date
	 * @return  
	 * @author djran
	 * @Date 2016年8月17日 下午3:06:59
	 */
	public static final Date setDate(int year,int month,int date){
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, month-1, date);
		return calendar.getTime();
	}
	
	public static final Date setDateTime(int year,int month,int date,int hour,int minute,int second){
		Calendar calendar=Calendar.getInstance();
		calendar.set(year, month-1, date,hour,minute,second);
		return calendar.getTime();
	}
	/**
	 * 修改当前日期年月日（在原来值上加上设定的int值），相同处理下可以对设定的任意日期修改年月日时分秒
	 * @param year
	 * @param month
	 * @param day
	 * @return  
	 * @author djran
	 * @Date 2016年8月17日 下午3:20:01
	 */
	public static final Date addDate(int year,int month,int day){
		Calendar calendar=Calendar.getInstance();
		calendar.add(calendar.YEAR, year);
		calendar.add(calendar.MONTH, month);
		calendar.add(calendar.DAY_OF_MONTH, day);
		return calendar.getTime();
	}
	/**
	 * 获取两个日期之间的天数
	 * @param startTime
	 * @param endTime
	 * @return  
	 * @author djran
	 * @Date 2016年8月17日 下午4:11:43
	 */
	public static final String getDayBetweenDate(String startTime,String endTime){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		long days=0;
		try {
			Date startDate=format.parse(startTime);
			Date endDate=format.parse(endTime);
			if(startDate.after(endDate)){
				Date temp;
				temp=startDate;
				startDate=endDate;
				endDate=temp;
			}
			days=(endDate.getTime()-startDate.getTime())/(24*60*60*1000);
			
		} catch (ParseException e) {
			return -1+"";
		}
		return days+"";
	}
	/**
	 * 将时分秒清0和设置为端点值，可依此获取某一整天、某一小时等
	 * @param date
	 * @return  
	 * @author djran
	 * @Date 2016年8月17日 下午4:42:51
	 */
	public static final Date getDateTimeStart(Date date){
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.HOUR, 0);
		calendar.set(calendar.MINUTE, 0);
		calendar.set(calendar.SECOND, 0);
		return calendar.getTime();
	}
	
	public static final Date getDateTimeEnd(Date date){
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.HOUR, 23);
		calendar.set(calendar.MINUTE, 59);
		calendar.set(calendar.SECOND, 59);
		return calendar.getTime();
	}
	/**
	 * 获得月初时间点
	 * @param date
	 * @return  
	 * @author djran
	 * @Date 2016年8月18日 上午9:14:34
	 */
	public static final Date getMonthBegin(Date date){
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.set(calendar.DAY_OF_MONTH, 1);
		calendar.set(calendar.HOUR, 0);
		calendar.set(calendar.MINUTE, 0);
		calendar.set(calendar.SECOND, 0);
		return calendar.getTime();		
	}
	
	/**
	 * 获取date一个小时之前的时间点
	 * @param date
	 * @return  
	 * @author djran
	 * @Date 2016年8月17日 下午5:25:09
	 */
	public static final Date getOneHourTime(Date date){
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.HOUR_OF_DAY, getHour(date)-1);
		return calendar.getTime();
	}
	/**
	 * 获取date半小时之前的时间点
	 * @param date
	 * @return  
	 * @author djran
	 * @Date 2016年8月17日 下午5:45:03
	 */
	public static final Date getHalfHourTime(Date date){		
		long millisecond=date.getTime();
		long milisecondNew=millisecond-30*60*1000;
		Date dateNew=new Date(milisecondNew);
		return dateNew;
	}
	
	public static final Boolean beforeorNot(Date date1,Date date2){
		long millisecond1=date1.getTime();
		long millisecond2=date2.getTime();
		if(millisecond1<millisecond2){
			return false;
		}else {
			return true;
		}
	}
	
	public static String[] getString(String str){
		String channelName = str.substring(1,str.length()-2);
		 channelName = str.replaceAll("\'", "");
		String channelNameArray[]=channelName.split(",");
		return channelNameArray;
	}
	public static String getIP(){
		String strIP="";
		try {
			InetAddress[] objAddr=InetAddress.getAllByName(InetAddress.getLocalHost().getHostName());
			for(int i=0;i<objAddr.length;i++){
				String ip=objAddr[i].getHostAddress();
				strIP=ip;
			}
		
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		return strIP;
	}
	public static Date getNewTimeByMinute(int hour){//延迟小时数
//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.HOUR_OF_DAY, hour);
		Date date=new Date();
		date = cal.getTime();
		return date;
	}
	
}
