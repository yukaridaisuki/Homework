package day03;

import day02.Test01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的生日（输入格式为\"yyyy-MM-dd\"）：");
        String birthday = sc.nextLine();
        Date birdate = sdf.parse(birthday);

        if(birthday.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")){
            Date now = new Date();
            long time = now.getTime() - birdate.getTime();
            long day  = time / 24 / 60 / 60 / 1000;
            long week = day / 7;
            System.out.println("出生到现在已经过了" + week +"周");
        }else{
            System.out.println("生日的输入格式错误");
        }
    }

}
