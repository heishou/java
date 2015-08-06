package com.heishou;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnotation {

	/**解析注解
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		//类加载器
        Class<?> class1=Class.forName("com.heishou.Child");
        //获取到类上面是否包含注解
        boolean boo=class1.isAnnotationPresent(MyAnnotation.class);
        //是否存在
        if (boo) {
			MyAnnotation myAnnotation=class1.getAnnotation(MyAnnotation.class);
            System.out.println(myAnnotation.age()+":"+myAnnotation.author()+":"+myAnnotation.desc());
			//如果只有一个成员变量
			//System.out.println(myAnnotation.value()); 
		}
        //方法上的注解
        Method[] method=class1.getDeclaredMethods();
        for (Method method2 : method) {
			if (method2.isAnnotationPresent(MyAnnotation.class)) {
				//获取注解实例
				MyAnnotation myAnnotation=method2.getAnnotation(MyAnnotation.class);
				System.out.println(myAnnotation.age()+":"+myAnnotation.author()+":"+myAnnotation.desc());
			}
		}
        //第二种
        for (Method method2 : method) {
			//获取所有的注解
        	Annotation[] annotation=method2.getAnnotations();
        	for (Annotation annotation2 : annotation) {
				if (annotation2 instanceof MyAnnotation) {
					MyAnnotation myAnnotation=(MyAnnotation)annotation2;
					System.out.println(myAnnotation.age()+":"+myAnnotation.author()+":"+myAnnotation.desc());
				}
			}
		}
	}

}
