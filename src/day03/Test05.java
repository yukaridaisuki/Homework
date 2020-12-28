package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身份证号码：");
        String  input = sc.nextLine();
        int Day = 24 * 3600 * 1000;
        //创建身份证的正则表达式
        String Reg = "\\d{17}\\w{1}";
        //判断输入的身份证号码是否满足正则表达式
        if(input.matches(Reg)){
            //时间格式化
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            //创建StringbBuilder类型的字符串，用于后续提取身份证号码中的出生年月信息，和调用insert函数使生日时间格式化。
            StringBuilder sb = new StringBuilder(input.substring(6,14));
            sb = sb.insert(4,'-');
            sb = sb.insert(7,'-');
            //将生日转换成String类型，测试格式化后的生日
            String birthday = sb.toString();
            System.out.println("出生日期：" + birthday);
            //创建日历
            Calendar calendar = Calendar.getInstance();
            //创建日期，通过format读取符合格式的日期并返回date类型的值。
            Date date = format.parse(birthday);
            //重新设置日历，此时日历时间为该人出生日期
            calendar.setTime(date);
            //出生该周的星期三 -> 修改日历
            //System.out.println("目前日期" + calendar.getTime());
            calendar.set(Calendar.DAY_OF_WEEK,4);
            Date date1 = calendar.getTime();
            System.out.println("当周的周三为：" + format.format(date1));
            //20岁生日
            date.setTime(date.getTime() + (365 * 20 + 5l) * Day);
            System.out.println("二十岁生日：" + format.format(date));
        }
    }

}
