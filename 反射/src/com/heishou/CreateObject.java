package com.heishou;

public class CreateObject {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
        Class<?> perClass=Class.forName("com.heishou.Person");
        System.out.println(((Person)perClass.newInstance()).getAge());
	}

}
