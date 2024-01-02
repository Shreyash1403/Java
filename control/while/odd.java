class oddDigit{
	public static void main(String[] args){
                   int N=987856371;
		   int count=0;
		   while(N!=0){
			   int rem=N%10;
			   if(rem%2==1){
			      count++;
			   }
			   N=N/10;

		   }
		   System.out.println(count);
	}
}
