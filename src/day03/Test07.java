package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * 要求用户首先输入员工数量，然后输入相应员工信息，格式为：
 * name,age,gender,salary,hiredate
 * 例如:
 * 张三,25,男,5000,2006-02-15
 * 每一行为一个员工信息，然后将每个员工信息解析成Emp对象。并存入到一个集合中。
 * 在解析成Emp对象后要先查看当前集合是否包含该员工，若包含则提示该用于已存在，
 * 否则才存入集合。
 * 然后输出集合查看每个员工信息.
 * @author Bonnie
 *
 */
public class Test07 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工数量：");
        int num = sc.nextInt();
        System.out.println("请输入员工信息：");
        ArrayList<Emp> emp_list = new ArrayList<>();
        //num为准备输入的员工数量，即循环次数
        for (int i = 0; i < num; i++) {
            //获取输入的员工信息，并对其进行切片
            String str = sc.next();
            String[] employee = str.split(",");
            //用于标记重复员工
            boolean flag = true;
            //对集合进行遍历，判断是否存在重复输入员工信息的问题
            if(emp_list.size() > 0){
                for (int j = 0; j < emp_list.size(); j++) {
                    if(employee[0].equals(emp_list.get(j).getName())){
                        flag = false;
                    }
                }
            }
            //如果没重复，则建立新的emp对象，并将该员工信息存入此对象内
            if (flag){
                Date temp = sdf.parse(employee[4]);
                Emp emp = new Emp(employee[0],Integer.parseInt(employee[1]),employee[2],
                        Integer.parseInt(employee[3]),temp);
                emp_list.add(emp);
            }else{ //若重复输入则报错，并且可以重新输入
                System.out.println("该员工已存在！请重新输入！");
                i--;
            }
        }
        for (int i = 0; i < emp_list.size(); i++) {
            System.out.println(emp_list.get(i).toString());
        }

    }
}
