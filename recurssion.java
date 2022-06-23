class recurssion{
	 int recc(int n){
		if(n==0){
			return 1;
		}
		// else if(n==1){
		// 	return 1;
		// }
		else{
			return n*recc(n-1);
		}
	}

	public static void main(String arg[]){
		recurssion r=new recurssion();
		System.out.println(r.recc(5));
	}


}