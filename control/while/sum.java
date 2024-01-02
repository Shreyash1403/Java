class toSum{
	public static void main(String[] args){
		int N=10;
		int sum=0;
		int product=1;
		int i=1;
		while(i<=N){
			if(i%2==0){
				sum=sum+i;
			/*	System.out.println(sum);*/
			}else if(i%2==1){
				product=i*product;
			/*	System.out.println(product);*/
			}
		          i++;
		}
		System.out.println(sum);
		System.out.println(product);
	}
}
