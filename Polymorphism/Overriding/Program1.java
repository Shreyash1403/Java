class Parent{
	void property(){
		System.out.println("Gold,Car");
	}

	void marry(){
		System.out.println("Alia");
	}
}

class Child extends Parent{
	void property(){
		System.out.println("Gold,Car");
	}

	void marry(){
		System.out.println("Shila");
	}
}

class Kaka{
	public static void main(String[] args){
	Parent obj = new Parent();
	obj.property();
	obj.marry();

	Parent obj1 = new Child();
	obj1.property();
	obj1.marry();
	}
}
