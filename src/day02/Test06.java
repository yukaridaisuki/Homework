package day02;

import java.util.Scanner;

/**
 * 测试正则表达式，并尝试编写规则: 电话号码可能有3-4位区号，
 * 7-8位号码:0415-5561111
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        String Reg = "\\d{3,4}-\\d{7,8}";
        System.out.println("请输入电话号码：");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        if(num.matches(Reg)){
            System.out.println(num);
        }else{
            System.out.println("输入错误");
        }
    }
}
