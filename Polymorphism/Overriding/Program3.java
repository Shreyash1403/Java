class Parent{
	int z=30;
	Parent(){
		System.out.println("In Parent Constructor");
	}
/*	void fun(int x){
	System.out.println("In Parent");
}*/
void fun(){
        System.out.println("In Parent 1");
} 
}

class Child extends Parent{
	Child(int y){
		System.out.println(y);
		System.out.println(this.z);
		System.out.println("In Child Constructor");
	}
	void fun(int x){
		System.out.println("In Child");
		System.out.println(x);
	}
}

class Client{
	public static void main(String[] args){
		Parent obj = new Child(20);
		obj.fun(10);
		obj.fun();
	}
}
