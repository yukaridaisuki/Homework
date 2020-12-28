package day03;

import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {

    Test01(){}

    public void time(){
        Date date = new Date();
        System.out.println("当前时间：" + date);
        date.setTime(date.getTime() + 24 * 3600 * 1000 * 3);
        System.out.println("3天后：" + date);
    }

}
