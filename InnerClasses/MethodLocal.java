class Outer{
	void m1(){
		System.out.println("In Outer");

		class Inner{
			void m2(){
				System.out.println("In Inner");
				
			}
		}
		Inner obj2 = new Inner();
		obj2.m2();
	}
		void m3(){
			System.out.println("In m3");
		}
	
}

class Client{
	public static void main(String[] args){
	Outer obj = new Outer();
	obj.m1();

	//Outer.Inner obj2 = obj.new Inner();
	obj.m3();
}
}
