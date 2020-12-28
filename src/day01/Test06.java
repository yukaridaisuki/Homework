package day01;

import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 * @author Bonnie
 *
 */
public class Test06 {
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








