package day02;

import java.util.Scanner;

/**
 * 输入一个数学计算表达式，如:1+2
 * 然后输出计算后的结果:1+2=3
 * 这里计算表达式只计算一次即可，可以使用加减乘除任意一个,可以进行小数运算。
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数学表达式");
        String get = sc.nextLine();
        char s_flag = '0';
        int  flag = 0;
        double pre = 0;
        double aft = 0;
        for (int i = 0; i < get.length(); i++) {
            if(get.charAt(i) > '9' || get.charAt(i) < '0'){
                flag = i;
                s_flag = get.charAt(i);
                break;
            }
        }
        switch (s_flag){
            case '+':
            {

                pre = Double.parseDouble(get.substring(0,flag));
                aft = Double.parseDouble(get.substring(flag+1,get.length()));
                System.out.println(pre + "+" + aft + "=" + (pre + aft));
                break;
            }
            case '-':{
                pre = Double.parseDouble(get.substring(0,flag));
                aft = Double.parseDouble(get.substring(flag+1,get.length()));
                System.out.println(pre + "-" + aft + "=" + (pre - aft));
                break;
            }
            case '*':{
                pre = Double.parseDouble(get.substring(0,flag));
                aft = Double.parseDouble(get.substring(flag+1,get.length()));
                System.out.println(pre + "*" + aft + "=" + (pre * aft));
                break;
            }
            case '/':{
                pre = Double.parseDouble(get.substring(0,flag));
                aft = Double.parseDouble(get.substring(flag+1,get.length()));
                System.out.println(pre + "/" + aft + "=" + (pre / aft));
                break;
            }

        }
    }
}
