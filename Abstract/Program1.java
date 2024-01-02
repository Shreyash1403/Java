abstract class University{
	void examTime(){
		System.out.println("Same for all colleges");
	}

	abstract void clgEvent();
}

class College extends University{
	void clgEvent(){
		System.out.println("Ensemble,Sports,Farewell");
	}
}

class Client{
	public static void main(String[] args){
		University un = new College();
		un.examTime();
		un.clgEvent();
	}
}
