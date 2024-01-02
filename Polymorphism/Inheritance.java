class Match{

	void matchType(){
		System.out.println("T20/OneDay/Test");
	}
}

class IPLMatch extends Match{

        void matchType(){
                System.out.println("T20");
        }
}

class TestWorldCup extends Match{
 		
        void matchType(){
                System.out.println("Test");
        }

}

class Client{
	
	public static void main(String[] args){
	Match info = new IPLMatch();
	info.matchType();

	Match info2 = new TestWorldCup();
	info2.matchType();
	}
}
