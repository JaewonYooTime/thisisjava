package ch07.test.t06;

public class Child extends Parent {
	public int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);
		this.name = name;
		this.studentNo = studentNo;
	}
}
