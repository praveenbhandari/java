class decimal_to_binary_recurssion{
	String binaryy(int num,String result){
		if(num ==0){
			return result;
		}
		// if(binary){}
		result = num%2+result;
		return binaryy(num/2,result);
	}


	public static void main(String args[]){
		decimal_to_binary_recurssion db=new decimal_to_binary_recurssion();
		System.out.println(db.binaryy(233,""));
	}
}