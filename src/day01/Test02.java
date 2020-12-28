package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("大家好！");
		System.out.println("第一次修改：" + str.replace(0,str.length(),"大家好!我是程序员!"));
		System.out.println("第二次修改：" + str.replace(0,str.length(),"大家好!我是优秀的程序员!"));
		System.out.println("第三次修改：" + str.replace(0,str.length(),"大家好!我是牛牛的程序员!"));
		System.out.println("第四次修改：" + str.replace(0,str.length(),"我是牛牛的程序员!"));
	}
}
