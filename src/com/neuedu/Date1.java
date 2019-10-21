package com.neuedu;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str=df.format(new Date());
        System.out.println(str);





    }
}
