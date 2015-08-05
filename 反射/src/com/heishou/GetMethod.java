package com.heishou;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethod {

	/**获取对象的方法
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		Class<?> person=Class.forName("com.heishou.Person");
		Method[] method=person.getDeclaredMethods();
//		System.out.println(method.length);
		Method method2=person.getMethod("setName",String.class);
		method2.invoke(person.newInstance(),"asasd");
	}

}
