package day03;

import java.util.ArrayList;

/**
 * 创建一个集合，存放字符串"one","two"，"three"
 * 然后输出该集合的元素个数。
 * 然后输出该集合是否包含字符串"four"
 * 然后输出集合是否不含有任何元素
 * 然后清空集合
 * 然后输出该集合的元素个数
 * 然后输出集合是否不含有任何元素
 * @author Bonnie
 *
 */
public class Test06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        String test = "four";
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            if(test.equals(list.get(i))){
                System.out.println("包含four");
            }else if(i == (list.size() - 1)){
                System.out.println("不包含four");
            }
        }
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
