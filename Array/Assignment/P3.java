import java.io.*;
class OddProd{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of Array: ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		int prod=1;

		System.out.println("Enter elements: ");
		for(int i=0;i<arr.length;i++){
		
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2==1){
			
				prod=prod*arr[i];
			}
		}
		System.out.println(prod);
	}
}
