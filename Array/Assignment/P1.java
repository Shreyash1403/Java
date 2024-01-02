/*import java.io.*;
class Program1{

	 public static void main(String[] args)throws IOException{
	
		int sum=0; 
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		 System.out.println("Enter Size of Array: ");

		 int size = Integer.parseInt(br.readLine());

		 int arr[]=new int[size];

		 System.out.println("Enter array elements");

		 for(int i=0;i<size;i++){
		 
			  arr[i]= Integer.parseInt(br.readLine());

			 if(arr[i]%2==1){
			 
				 sum=sum+arr[i];
			 }
		 }
		 System.out.println(sum);
	 }
}*/








import java.io.*;

class Demo{

	public static void main(String[] args)throws IOException{
	
		int sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array size: ");
		int size = Integer.parseInt(br.readLine());
		int arr[]= new int[size];

                System.out.println("Enter array Elements");

		for(int i=0; i<size;i++){
		      
			arr[i]=Integer.parseInt(br.readLine());
			if(arr[i]%2==0){
			
			  sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}





























