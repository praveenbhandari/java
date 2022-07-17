class palindrome_recurssion{
	boolean palindrome(String str){
		if(str.length()==0 || str.length()==1){
			return true;
		}
		System.out.println(str.length());
		System.out.println(str.length()-1);
		if(str.charAt(0)==str.charAt(str.length()-1)){
			System.out.println(str.substring(1,str.length()-1));
			return palindrome(str.substring(1,str.length()-1));
		}

		return false;
	}




public static void main(String arg[]){
	palindrome_recurssion p=new palindrome_recurssion();
	System.out.println(p.palindrome("abcdefghijklmnopqrstuvwxyzyxwvutsrqponmlkjihgfedcba"));
	// System.out.println(p.palindrome("kayak"));	
	// System.out.println(p.palindrome("praveen"));
	// System.out.println(p.palindrome("mom"));
}
}