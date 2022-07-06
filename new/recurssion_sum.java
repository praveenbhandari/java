class recurssion_sum{

	int summ(int val){
		if(val==0){
			return 0;
		}
		// val--;
		// System.out.println(val);
		return val+summ(val-1);	
	}


	





	public static void main(String arg[]){
		recurssion_sum r=new recurssion_sum();
		System.out.println(r.summ(4));

	}

}