package com.heishou;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class GetConstructors {

	/**调用构造函数
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws IllegalArgumentException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		Class<?> person=Class.forName("com.heishou.Person");
		Constructor[] constructor=person.getDeclaredConstructors();
		System.out.println(constructor.length);
		for (Constructor constructor2 : constructor) {
			System.out.println(constructor2);
		}
		System.out.println(constructor[0].getParameterTypes().toString());
		System.out.println(constructor[0].getModifiers());
        System.out.println(Modifier.toString(constructor[0].getModifiers()));
        Class<?>[] gp=constructor[0].getParameterTypes();
        for (Class<?> class1 : gp) {
			System.out.println(class1.getName());
		}
//		Person p1=(Person)constructor[0].newInstance();
//		Person p2=(Person)constructor[1].newInstance("黑手",100);
//		Person p3=(Person)constructor[2].newInstance("传闻中滴黑手");
//		System.out.println(p1);
//		System.out.println(p2);
//		System.out.println(p3);
	}

}
