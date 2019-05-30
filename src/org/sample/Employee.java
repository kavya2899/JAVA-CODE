package org.sample;

public class Employee {
int empId;
String empName;
Employee(int id,String name){
	this.empId=id;
	this.empName=name;
	
	
}
void info() {
	System.out.println("id:"+empId+"name: "+empName);
}
	public static void main(String[] args) {
		Employee obj1=new Employee(10245,"kavya");
		Employee obj2=new Employee(10246,"priya");
		obj1.info();
		obj2.info();
		
		
		// TODO Auto-generated method stub

	}

}
