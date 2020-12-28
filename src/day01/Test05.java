package day01;

import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		//生成随机验证码
		StringBuilder str = random();
		System.out.println("验证码" + str);
		Scanner sc = new Scanner(System.in);
		//获取用户输入验证码
		System.out.println("请输入验证码：");
		String str2 = sc.nextLine();
		//将用户输入和正确答案均转换成小写
		String answer = str2.toLowerCase();
		//将生成的验证码转换成string类型
		String str1 = str.substring(0);
		String key = str1.toLowerCase();
		//判断用户输入与系统生成是否相同。
		if(key.equals(answer)){
			System.out.println("正确");
		}else{
			System.out.println("错误");
		}
	}

	private static StringBuilder random() {
		StringBuilder stb = new StringBuilder();
		for (int i = 0; i < 5; i++) {
			switch ((int)(Math.random()*2)){
				case 0:
					stb.append((char)((int)(Math.random()*26 + 'a')));
					break;
				case 1:
					stb.append((char)((int)(Math.random()*26 + 'A')));
					break;
			}
		}
		return stb;
	}

}
