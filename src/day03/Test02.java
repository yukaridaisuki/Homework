package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 * @author Bonnie
 *
 */
public class Test02 {
    public void time(){
        Date d = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println("\"yyyy-MM-dd HH:mm:ss\"格式输出:\t" + sdf.format(d));

    }
}
