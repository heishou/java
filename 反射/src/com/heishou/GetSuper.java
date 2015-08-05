package com.heishou;

import java.lang.reflect.Field;

public class GetSuper {

	/**获取父类
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws NoSuchFieldException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchFieldException {
		// TODO Auto-generated method stub
		Class<?> person=Class.forName("com.heishou.Person");
		Class<?> su=person.getSuperclass();
		for (Field field : su.getDeclaredFields()) {
			System.out.println(field);
		}
	}

}
