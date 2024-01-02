/*
import java.util.*;

class Sample2Demo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Element to Search: ");
		int search = sc.nextInt();

		for(int i=0; i<=arr.length; i++){
		
			if(arr[i]==search){
			System.out.println("Index" + i);
			break;
		}
	}

	}

}
*/


import java.util.*;

class Sample2Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element to Search: ");
        int search = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Element found at index: " + i);
                break; // Exit the loop once the element is found
            }
        }

        // Close the scanner to release resources
        sc.close();
    }
}

