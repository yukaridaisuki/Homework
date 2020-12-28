package day02;

import java.util.Scanner;

/**
 * 要求用户输入一个字符串，然后若该字符串是一个整数，则转换为整数后输出乘以10后的结果
 * 若是小数，则转换为一个小数后输出乘以5后的结果，若不是数字则输出"不是数字"
 * 需要使用正则表达式进行判断。
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        //整数和小数的正则表达式
        String intReg = "\\d+";
        String douReg = "\\d+\\.\\d+";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一组数字：");
        String str = sc.nextLine();
        if(str.matches(intReg)){
            int num = Integer.parseInt(str) * 10;
            System.out.println("整数为：" + num);
        }else if(str.matches(douReg)){
            Double num = Double.parseDouble(str) * 5;
            System.out.println("小数为：" + num);
        }
    }
}
