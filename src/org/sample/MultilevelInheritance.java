package org.sample;

public class MultilevelInheritance {
public void employee1() {
	System.out.println("employee name");
}
}
class MI2 extends MultilevelInheritance{
	public void employee2() {
		System.out.println("employee salary");
	}
}
class MI3 extends MI2{
	public void employee3() {
		System.out.println("employee id");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MI3 sk=new MI3();
sk.employee1();
sk.employee2();
sk.employee3();
	}

}
