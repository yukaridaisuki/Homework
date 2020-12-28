package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 要求用户输入若干员工信息，格式为：
 * name,age,gender,salary;name,age,gender,salary;....
 * 例如:
 * 张三,25,男,5000;李四,26,女,6000;...
 * 然后将每个员工信息解析成Person对象。并存入到一个数组中。
 * 然后循环数组，输出每一个员工信息(输出使用toString返回的字符串)
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工信息：");
        String input = sc.nextLine();
        String[] per = input.split(";");
        for (int i = 0; i < per.length; i++) {
            String temp = per[i];
            String[] t  = temp.split(",");
            Person p = new Person(t[0],Integer.parseInt(t[1]),t[2],Integer.parseInt(t[3]));
            person.add(p);
        }
        for (int i = 0; i < person.size(); i++) {
            Person tp = person.get(i);
            System.out.println("姓名：" + tp.getName() + "\t" + "岁数：" + tp.getAge() + "\t" +
                    "性别:" + tp.getGender() + "\t" + "工资:" + tp.getSalary());
        }

    }
}
