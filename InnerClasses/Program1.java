class Outer{
	int x=10;
	static int y=20;
	class Inner{
		int z=25;
		//System.out.println("m1");
		static final int b=30;
		//m2();
	
	}

	void m2(){
		System.out.println(x);
		System.out.println(y);
	}
}

class Client{
	public static void main(String[] args){
		Outer obj1 = new Outer();
		obj1.m2();
		
		Outer.Inner obj = new Outer().new Inner();
		System.out.println(obj.b);
		System.out.println(obj.z);
	}
}
