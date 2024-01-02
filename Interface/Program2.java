interface Demo{
	default void fun(){
		System.out.println("In fun method");	
	}
}

interface Demo2{
	void gun();
}

class DemoChild implements Demo,Demo2{
     /*	public void fun(){
		System.out.println("In fun");
	}
      */
	public void gun(){
		System.out.println("In gun");
	}
}

class Client{
	public static void main(String[] args){
		Demo obj = new DemoChild();
		obj.fun();

		Demo2 obj1 = new DemoChild();
		obj1.gun();
	}
}
