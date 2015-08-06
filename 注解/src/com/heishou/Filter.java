package com.heishou;

@Table("testtable")
public class Filter {
	@Column("id")
	private int id;
	@Column("name")
	private String name;
	@Column("nikename")
	private String nikename;
	@Column("age")
	private int age;
	@Column("city")
	private String city;
	@Column("email")
	private String email;
	@Column("touch")
	private String touch;

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTouch() {
		return touch;
	}

	public void setTouch(String touch) {
		this.touch = touch;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNikename() {
		return nikename;
	}

	public void setNikename(String nikename) {
		this.nikename = nikename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
