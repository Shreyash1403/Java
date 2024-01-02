class Solution5{
	public static void main(String[] args){
		int row=4;
		char ch='A';
		for(int i=1; i<=row; i++){
			char temp1=ch;
			for(int j=1; j<=(row-i+1); j++){
				System.out.print(temp1 +" ");
			
			temp1++;
			}
			ch++;
			System.out.println();
		}
	}
}
