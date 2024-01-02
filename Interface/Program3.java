interface Demo{
	default void fun(){
		System.out.println("In fun");
	}

	static void gun(){
		System.out.println("In fun-fun");
	}
}

class DemoChild implements Demo{
	public void gun(){
		System.out.println("In gun");
	}
	
}

class Client{
	public static void main(String[] args){
		DemoChild obj = new DemoChild();
	//	obj.fun();
		//Demo.gun();
		obj.gun();
	}
}
