package com.heishou;

/**
 * jdk自带注解
 * @SuppressWarnings("deprecation")无视过时
 * @author heishou
 *
 */
public class JDK{
	@SuppressWarnings("deprecation")
	public void sing() {
        Person person=new Child();
        person.sing();
	}
}
