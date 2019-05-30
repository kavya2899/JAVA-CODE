package org.sample;

public class HierarchicalIn {
	public void prolan() {
		System.out.println("c");
	}
}
class HI2 extends HierarchicalIn{
	public void prolan2() {
		System.out.println("python");
}
}
class HI3 extends HierarchicalIn{
	public void prolan3() {
		System.out.println("java");
	}
}
class HI4 extends HierarchicalIn{
	public void prolan4() {
		System.out.println("oracle");
	}

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HI2 s1 =new HI2();
 HI3 s2 = new HI3();
HI4 s3 =new HI4();
s1.prolan2();
s2.prolan3();
s3.prolan4();



	}

}
