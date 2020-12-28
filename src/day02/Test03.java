package day02;

import java.util.Scanner;

/**
 * 输入一个IP地址，然后将4段数字分别输出
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入一个IP地址：");
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String[] strip = ip.split("\\.");
        for (int i = 0; i < strip.length; i++) {
            System.out.println(strip[i]);
        }
    }

}
