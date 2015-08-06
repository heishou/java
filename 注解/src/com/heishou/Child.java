package com.heishou;

public class Child implements Person {

	@Override
	@MyAnnotation(desc = "布吉岛", author = "还是布吉岛", age = 500)
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub

	}

}
