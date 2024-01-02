import java.io.*;

class Demo{
public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	 System.out.println("Enter ur Building Name" );
	 String str1 = br.readLine();

	 System.out.println("Enter ur Wing");
	 char ch = (char) br.read();
	 br.skip(1);

	 System.out.println("Enter Flat No.");
	 int No = Integer.parseInt(br.readLine());

	 System.out.println(str1);
	 System.out.println(ch);
	 System.out.println(No);


}
}
