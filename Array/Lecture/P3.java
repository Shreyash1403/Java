import java.io.*;
class Program3{

	public static void main(String[] args) throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                
		System.out.println("Enter Arrays: ");
		int arr[]=new int[5];
/*		arr[0]=Integer.parseInt(br.readLine());
		arr[1]=Integer.parseInt(br.readLine());
		arr[2]=Integer.parseInt(br.readLine());
		arr[3]=Integer.parseInt(br.readLine());
                arr[4]=Integer.parseInt(br.readLine());
         */              
		for(int i=0;i<5;i++){
		
		arr[i]=Integer.parseInt(br.readLine());
		}

		for(int j=0;j<5;j++){
		
			System.out.println(arr[i]);
		}

	}

	
}
