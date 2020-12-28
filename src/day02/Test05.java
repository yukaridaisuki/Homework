package day02;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 实现文件重命名。
 * 要求用户输入一个文件名称，例如:abc.jpg
 * 然后对该名字进行重新命名，输出的格式为:系统时间毫秒值.jpg
 * 例如:1465266796279.jpg
 * @author Bonnie
 *
 */
public class Test05 {
	public static void main(String[] args) {
		String reg = "[\\w]+\\.[a-z]+";
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件名称：");
		String str = sc.nextLine();
		//获取日历
		Calendar cal = Calendar.getInstance();
		long l = cal.getTimeInMillis();
		//将long类型的系统毫秒值转换为string类型
		String str_l = String.valueOf(l);
		//判断输入的文件名格式是否正确
		if(str.matches(reg)){
			//截取原字符串的文件名
			String str_re = str.substring(0,str.indexOf("."));
			//重命名
			str = str.replace(str_re,str_l);
			System.out.println(str);
		}else {
			System.out.println("输入格式错误");
		}
	}
}
