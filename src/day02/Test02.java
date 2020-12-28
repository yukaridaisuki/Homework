package day02;

import java.util.Arrays;

/**
 * 将字符串123,456,789,012根据","拆分，并输出拆分后的每一项
 * @author Bonnie
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String reg = "[\\d]{3},[\\d]{3},[\\d]{3},[\\d]{3}";
        String str = "123,456,789,012";
        String[] s = str.split(",");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }

}
