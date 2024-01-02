class Parent{

    Parent(){
	System.out.println("In Parent");
    }

    void parentProperty(){
    
	    System.out.println("Flat,Car,Gold");
    }
}
 
class Child extends Parent{

	Child(){
	
		System.out.println("In Child");
	}
}

class Client{	
     public static void main(String[] args){	
	Child obj = new Child();
	obj.parentProperty();
}
}
