package ch12.sec08;

import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DATE);
        System.out.println(year + "년 " + month + "월 " + day + "일");

//        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
//        int AmPm = cal.get(Calendar.AM_PM);
//        System.out.println(dayOfWeek);
//        System.out.println(AmPm);

        String AmPmString = "오전";
        if(cal.get(Calendar.AM_PM)==Calendar.PM) {
            AmPmString = "오후";
        }
//        System.out.println(AmPmString);

        String dayOfWeekString = "";
        switch (Calendar.DAY_OF_WEEK) {
            case Calendar.SUNDAY:
                dayOfWeekString="일요일";
                break;
            case Calendar.MONDAY:
                dayOfWeekString="월요일";
                break;
            case Calendar.TUESDAY:
                dayOfWeekString="화요일";
                break;
            case Calendar.WEDNESDAY:
                dayOfWeekString="수요일";
                break;
            case Calendar.THURSDAY:
                dayOfWeekString="목요일";
                break;
            case Calendar.FRIDAY:
                dayOfWeekString="금요일";
                break;
            case Calendar.SATURDAY:
                dayOfWeekString="토요일";
                break;
        }

        System.out.println(dayOfWeekString+" "+AmPmString);

        int hour=cal.get(Calendar.HOUR);
        int minute=cal.get(Calendar.MINUTE);
        int second=cal.get(Calendar.SECOND);

        System.out.println(hour+"시 "+minute+"분 "+second+"초" );
    }
}