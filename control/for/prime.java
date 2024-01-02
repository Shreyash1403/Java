class PrimeNumber{
	public static void main(String[] args){
		int N=0;
		int count=0;
		for(int i=1; i<=N; i++){
			if(N%i==0){
				count++;
			}
		}
		System.out.println(count);
		if(count==2){
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}
}

