package day03;

import java.awt.desktop.SystemSleepEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    //设置一天所含毫秒的静态常量
    static final int DAY = 3600 * 24 * 1000;

    public static void main(String[] args) throws ParseException {
        //设置日期存储格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //获取控制台输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生产日期（yyyy-MM-dd）：");
        String dasutime = sc.nextLine();
        int protime = sc.nextInt();
        //创建Calendar类，通过
        Calendar cal = Calendar.getInstance();
        Date date = sdf.parse(dasutime);
        //将时间设置到过保质期前两周
        date.setTime(date.getTime() - (DAY * 7 *2));
        cal.setTime(date);
        //System.out.println(cal.getTime());
        // int wen = 2;
        //String[] week = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};

        if(dasutime.matches("[\\d]{4}-[\\d]{2}-[\\d]{2}")){
            cal.set(Calendar.DAY_OF_WEEK,4);
            System.out.println(cal.getTime());
        }else{
            System.out.println("生产日期输入格式错误！");
        }
    }
	
}
