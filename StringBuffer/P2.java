class ReverseDemo{

	public static void main(String[] args){
	
		String str="Core2Web";
		StringBuffer sb=new StringBuffer(str);
		str=sb.reverse().toString();
		System.out.println(str);
	}
}
