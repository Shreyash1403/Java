import java.io.*;
class Vowels{

	public static void main(String[] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 7 Characters: ");
		char carr[]=new char[7];
	//	char ch=(char)br.read();
		for(int i=0;i<carr.length;i++){
		
			carr[i]=(char)br.read();
			br.skip(1);
		}
		//System.out.print("Output:");

		for(int i=0;i<carr.length;i++){
		
			if(carr[i]=='a'||carr[i]=='e'||carr[i]=='i'||carr[i]=='o'||carr[i]=='u'){
			
				System.out.print(carr[i]+" ");
			}
		}

	}
}
