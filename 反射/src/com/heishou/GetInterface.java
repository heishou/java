package com.heishou;

import java.lang.reflect.Field;
/**
 * 获取接口
 * @author heishou
 *
 */
public class GetInterface {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> person=Class.forName("com.heishou.Person");
		Class<?>[] ifs=person.getInterfaces();
		for (Class<?> class1 : ifs) {
			for (Field  field: class1.getFields()) {
				System.out.println(field);
			}
		}
	}
	
}
