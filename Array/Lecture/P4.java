import java.io.*;
class Program4{

	public static void main(String[] args) throws IOException{	
                 
		//int Sum=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Arrays: ");
                int arr[]=new int[5];
		int Sum=0;
                 
		for(int i=0;i<5;i++){

                arr[i]=Integer.parseInt(br.readLine());
                }

                for(int j=0;j<5;j++){

                        Sum=Sum + arr[j];
                }
		System.out.println("Sum = "+ Sum);


	}
}
