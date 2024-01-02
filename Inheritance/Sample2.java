class Parent{

	static int x=10;
        Parent(){
	System.out.println("In Parent");
	}
      	static{
	        
		System.out.println("In Static Parent");
	}

	static void access(){
	
		System.out.println("Money,Car,Gold");
	}
}

class Child extends Parent{

	Child(){
		System.out.println("In Child");
	}
	static{
		System.out.println(x);
		System.out.println("In Static Child");
		access();
	}
}

class Client{
	
	public static void main(String[] args){
	
		System.out.println("In Main");
		Parent obj = new Child();
}
}


