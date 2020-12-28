package day01;
/**
 * 1:输出字符串"HelloWorld"的字符串长度
 * 2:输出"HelloWorld"中"o"的位置
 * 3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
 * 4:截取"HelloWorld"中的"Hello"并输出
 * 5:截取"HelloWorld"中的"World"并输出
 * 6:将字符串"  Hello   "中两边的空白去除后输出
 * 7:输出"HelloWorld"中第6个字符"W"
 * 8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
 * 9:将"HelloWorld"分别转换为全大写和全小写并输出。
 * @author Bonnie
 *
 */
public class Test01 {
	public static void test1(String str){
		//1:输出字符串"HelloWorld"的字符串长度
		System.out.println("print_length:" + str.length());
		//2:输出"HelloWorld"中"o"的位置
		System.out.println("输出\"HelloWorld\"中\"o\"的位置:");
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'o'){
				System.out.print("o:" + i + '\t');
			}
		}
		System.out.println();
		//3:输出"HelloWorld"中从下标5出开始第一次出现"o"的位置
		System.out.println("从下标5出开始:");
		for (int i = 5; i < str.length(); i++) {
			if(str.charAt(i) == 'o'){
				System.out.println("o " + i);
				break;
			}
		}
		//4:截取"HelloWorld"中的"Hello"并输出
		int start = str.indexOf("Hello");
		int over  = 5;
		System.out.println("4:" + str.substring(start,start+over));
		//5:截取"HelloWorld"中的"World"并输出
		int start2 = str.indexOf("World");
		System.out.println("5:" + str.substring(start2,start2+over));
		//6:将字符串"  Hello   "中两边的空白去除后输出
		String str2 = "  Hello   ";
		System.out.println("6:" + str2.trim());
		//7:输出"HelloWorld"中第6个字符"W"
		int start3 = str.indexOf("W");
		System.out.println("7:" + str.substring(start3,start3+1));
		//8:输出"HelloWorld"是否是以"h"开头和"ld"结尾的。
		System.out.println("startWith:" + str.startsWith("h"));
		System.out.println("endWith:" + str.endsWith("ld"));
		//9:将"HelloWorld"分别转换为全大写和全小写并输出。
		System.out.println("toUpperCase:" + str.toUpperCase());
		System.out.println("toLowerCase:" + str.toLowerCase());
	}
	public static void main(String[] args) {
		String str = "HelloWorld";
		test1(str);
		//以下自行调用test2,test3...等方法。
	}
	/**
	 * 以当前方法为例，下面继续编写test2,test3...等方法。
	 * 每个方法中实现类描述中的一个需求。
	 * 当前方法实现:1输出字符串"HelloWorld"的字符串长度
	 * 
	 * test2实现:2:输出"HelloWorld"中"o"的位置
	 * 以此类推。
	 * @param str
	 */
}
