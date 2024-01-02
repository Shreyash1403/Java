class IPL{

	void matchInfo(String team1, String team2){
		System.out.println(team1 + "VS" + team2);
	}

	void matchInfo(String team1,String team2,String venue){
		System.out.println("Venue:"+venue);
		System.out.println(team1 + "VS" + team2);
	}
}

class Client{
	public static void main(String[] args){
	IPL ipl2023 = new IPL();
	ipl2023.matchInfo("Csk","MI");
	ipl2023.matchInfo("CSK","MI","Wankhede");
	}
}
