import java.util.*;
class SampleDemo{

	public static void main(String[] args){

		int sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size: ");
                int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<size; i++){

			arr[i] = sc.nextInt();

			if(arr[i]%2==1){
			
				sum=sum+arr[i];
			}
		}
                  System.out.print("Sum:" + sum);     

		/*for(int i=0; i<arr.length; i++){
		
			System.out.print(arr[i] + " ");
		}
		*/

		//System.out.print(Arrays.toString(arr));
	}
}
