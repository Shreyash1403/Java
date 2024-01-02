//import java.io.*;
import java.util.*;
class PlayerDemo{
     public static void main(String[] args){
    //  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
	     Scanner sc=new Scanner(System.in);
      System.out.println("Enter player info");
      String Info=sc.nextLine();

      StringTokenizer st = new StringTokenizer(Info," ");
      //st.countTokens();
      System.out.println(st.countTokens()); 

      String token1=st.nextToken();
      String token2=st.nextToken();
      String token3=st.nextToken();
      
     /* while(st.has moreTokens()){
	      System.out.println(st.nextToken());
      }*/
      String name=token1;
      int jerNo=Integer.parseInt(token2);
      float avg=Float.parseFloat(token3);
      
      System.out.println(name);
      System.out.println(jerNo);
      System.out.println(avg);
      
     }
}
