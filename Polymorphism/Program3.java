class Demo{
	
	void fun(String str){
	System.out.println("String");
	System.out.println(str);
	}

	void fun(StringBuffer str1){
	System.out.println("StringBuffer");
	System.out.println(str1);
	}
}

class Client{

	public static void main(String[] args){
	
	Demo obj = new Demo();
	obj.fun("Shreyash");
        obj.fun(new StringBuffer("SHREYASH"));
	}
}
