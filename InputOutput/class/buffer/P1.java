import java.io.*;

class InputDemo{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter ur name");
		String name=br.readLine();
		//char ch=(char)br.read();
		System.out.println(name);

		System.out.println("Enter ut Age");
		int age=Integer.parseInt(br.readLine());
		System.out.println(age);

	}
}

