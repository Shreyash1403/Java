import java.util.Scanner;

	class ScannerDemo{
		public static void main(String[] args){
			Scanner obj = new Scanner(System.in);

			System.out.println("Enter Ur Name");
			String name = obj.next();

			System.out.println("Enter ur Age");
			int age = obj.nextInt();

			System.out.println(name);
			System.out.println(age);
		}
	}
