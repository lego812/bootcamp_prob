package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.SimpleFormatter;

public class DateExample {
    public static void main(String[] args) {
        Date now=new Date();
        System.out.println(now);
        String strNow1=now.toString();
        System.out.println(strNow1);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(now));
    }
}
