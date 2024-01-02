class Outer{
	class Inner{
	void m1(){
		System.out.println("Inner");
	}
	}
	void m2(){
		System.out.println("Outer");
	}
}

class Client{
	public static void main(String[] args){
		//Outer obj = new Outer();
		//obj.m2();
		
		//Outer.Inner obj2 = obj.new Inner();
		Outer.Inner obj2 = new Outer().new Inner();
		obj2.m1();
	}
}
