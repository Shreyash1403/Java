import java.io.*;
class Solution3{
	public static void main(String[] args) throws IOException{
	            
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of rows");
		int row=Integer.parseInt(br.readLine());

		for(int i=1;i<=row;i++){
		
			int num=row-i+1;
			for(int j=row;j>=i;j--){
			
				System.out.print(num*i+" ");
				num--;
			}
			System.out.println();
		}
	}
}
