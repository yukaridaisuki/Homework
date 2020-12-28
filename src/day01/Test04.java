package day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 * @author Bonnie
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入email地址：");
		StringBuilder stb = new StringBuilder(sc.nextLine());
		if(stb.indexOf("@") < 5){
			System.out.println("用户名不存在。");
		}else{
			System.out.println("用户名为：" + stb.substring(0,stb.indexOf("@")));
		}

	}
}
