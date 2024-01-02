interface Demo{
	void fun();
	void gun();	
}

abstract class DemoChild implements Demo{

	public void gun(){
		System.out.println("In gun");
	}
}

class DemoChild2 extends DemoChild{
	public void fun(){
		System.out.println("In fun");
	}
	
}

class Client{
	public static void main(String[] args){
		
		Demo obj = new DemoChild2();
		obj.gun();
		obj.fun();
	}
}
