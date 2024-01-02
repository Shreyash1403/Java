class PerfectNumber{
	public static void main(String[] args){
		int N=45;
		int sum=0;
		for(int i=1; i<N; i++){
			if(N%i==0){
			sum=sum+i;
		}
		}
		System.out.println(sum);
	
		if(sum==N){
			System.out.println("Perfect");
		} else{
			System.out.println("Not");
		}
	}
}

		
	

