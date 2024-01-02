class Armstrong{
	public static void main(String[]  args){
		int N=153;
		int temp1=N;
		int temp2=N;
                int count=0;
		int mult=1;
		int sum=0;

		/*while(temp1!=0){
			count++;
			temp1=temp1/10;
		}
		{	System.out.println(count);
		}

        
                /*while(temp2!=0){
			int rem=temp2%10;

			for(int i=1; i<=count; i++){
		           mult=mult*rem;
			}
			sum=sum+mult;
			temp2=temp2/10;
		}*/
	
                  if(N==sum){
	               System.out.println("Armstrong");
                       } else{
	               System.out.println("Not");
		       }
	}
	}

