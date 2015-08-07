package com.heishou;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMap {

	/**hashmap取出数据是随机的,不支持线程同步(如果需要可以用 Collections的synchronizedMap方法使HashMap具有同步的能力).不确定 
	 * linkedhashmap取出按顺序
	 * hashtable 线程同步
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> map = new java.util.HashMap<String, String>();
		map.put("bsdasd", "asd");
		map.put("1111", "luguo");
		map.put("2", "haha");
		Map linkmap=new LinkedHashMap();
		System.out.println(map.toString());
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("luguo"));
		System.out.println(map.get(1));
		System.out.println(map.keySet());
		System.out.println(map.values());
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
            System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println(new TreeMap(map));
		
	}

}
