class Nested5{
	public static void main(String[] args){
		char ch='Z';
		int num=26;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=4; j++){
				if(j%2==1){
					System.out.print(num-- +" ");
				} else{
					System.out.print(ch-- +" ");
				}
				}
				System.out.println();
		}
	}
}
