class string_reversal_recurssion{
	String inputt(String str){
		if(str.equals("")){
			return "";
		}
		return inputt(str.substring(1))+str.charAt(0);

	}


	public static void main(String args[]){
string_reversal_recurssion s=new string_reversal_recurssion();
System.out.println(s.inputt("test"));
	}
}