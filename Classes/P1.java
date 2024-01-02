class C2W{

	int numOfCourses=8;
	private String favCourses="CPP";
	void display(){
	System.out.println(numOfCourses);
	System.out.println(favCourses);
	}
}

 class Student{
 
	 public static void main(String[] args){
	 
		 C2W obj=new C2W();
		 obj.display();
		 System.out.println(obj.numOfCourses);
		// System.out.println(favCourses);
	 }
 }
