package com.heishou;

class Person extends SuperClass implements Ihello{
    public Person(){
    	
    }
    public Person(String name,int age){
    	this.age=age;
    	this.name=name;
    }
    public Person(String name){
    	this.name=name;
    }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + this.name + "  " + this.age + "]";
	}

	private String name;
	private int age;
	@Override
	public void sayhello() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void saygepi(int age) {
		// TODO Auto-generated method stub
		
	}
}
