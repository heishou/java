package com.heishou;

import java.lang.reflect.Field;

/**
 * 修改属性值
 * @author heishou
 *
 */
public class HandleAtt {
    public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchFieldException, InstantiationException, IllegalAccessException {
    	Class<?> person=Class.forName("com.heishou.Person");
    	Field field=person.getDeclaredField("name");
    	field.setAccessible(true);
    	Object object=person.newInstance();
    	field.set(object, "黑手");
    	System.out.println(field.get(object));
    } 
}
