class Outer{
	void m1(){
		System.out.println("In Outer M1");
	}
}

class Client{
	public static void main(String[] args){
		Outer obj = new Outer(){
			void m1(){
			System.out.println("In Anaymous");
			}
		};
		obj.m1();
	}
}
