class countDigit{
	public static void main(String[] args){
		int N=987654321;
		int count=0;
		while(N!=0){
			/*count++;*/
			N=N/7;
			count++;
		} System.out.println(count);
	}
}
