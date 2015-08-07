package com.heishou;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ArryList {

	/**ArrayList实现类
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("阿是");
		list.add("撒娇了世界");
		list.add("哦漆皮");
		list.add("你地方");
		list.add(0, "第一");
        System.out.println(list.toString());
        list.remove(3);
        System.out.println(list.toString());
        list.remove("哦漆皮");
        System.out.println(list.toString());
        System.out.println("***********");
        List list2=new ArrayList();
        list2.addAll(list);
        System.out.println(list2.toString());
        System.out.println("是否存在第一："+list.contains("第一"));
        System.out.println("你地方所在的索引："+list.indexOf("你地方"));
        System.out.println(list.hashCode());
        System.out.println(list.equals(list2));
        Iterator iterator=list.iterator();
        while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
