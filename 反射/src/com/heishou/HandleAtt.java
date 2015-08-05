package com.heishou;

import java.lang.reflect.Field;

/**
 * 修改属性值
 * @author heishou
 *
 */
public class HandleAtt {
    public static void main(String[] args) throws ClassNotFoundException, SecurityException, NoSuchFieldException {
    	Class<?> person=Class.forName("com.heishou.Person");
    	Field field=person.getDeclaredField("name");
    	
    } 
}
