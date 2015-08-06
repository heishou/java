package com.heishou;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws NoSuchMethodException 
	 * @throws IllegalArgumentException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws SecurityException, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Filter filter=new Filter();
        filter.setId(1);
        
        
        Filter filter2=new Filter();
		filter2.setName("黑手");
        
		Filter filter3=new Filter();
		filter3.setEmail("xxxx@xx.com");
		
		query(filter);
		query(filter2);
		query(filter3);
		
	}
    
	/**
	 * 查询
	 * @param filter
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 */
	public static String query(Filter filter) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
		//获取到类加载器
		Class<?> class1=filter.getClass();
		//获取表名
		boolean b=class1.isAnnotationPresent(Table.class);
		if (!b) {
			return null;
		}
		//获取注解的表名
		String tablename=class1.getAnnotation(Table.class).value();
		//根据字段获取到列名
		Field[] fields=class1.getDeclaredFields();
		StringBuilder sb=new StringBuilder();
		for (Field field : fields) {
			if (!field.isAnnotationPresent(Column.class)) {
				continue;
			}
			//获取注解的字段名
			String column=field.getAnnotation(Column.class).value();
			//利用反射获取字段值
			Method method=class1.getMethod("get"+column.substring(0, 1).toUpperCase()+column.substring(1));
			Object value=method.invoke(filter);
			sb.append(" and "+column+"="+value);
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	
}
