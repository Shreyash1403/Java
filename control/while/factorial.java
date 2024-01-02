class Factorial{
	public static void main(String[] args){
		int N=15;
		int i=1;
		int fact=1;
		while(i<=N){
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}
