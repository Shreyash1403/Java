import java.io.*;
class Solution7{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rows");
		int row=Integer.parseInt(br.readLine());
		
		int num=(row*(row+1))/2;
                
		for(int i=1;i<=row;i++){
		
			for(int j=1;j<=i;j++){
			
				if((i%2==1 && row%2==1)|| (i%2==0 && row%2==0)){
			//	if(i%2==1){
					System.out.print((char)(64+num)+" ");
				} else{
				
					System.out.print(num+ " ");
				//	num--;
				}
				num--;
			}
			System.out.println();
		}
	}
}
