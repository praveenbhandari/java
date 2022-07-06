class array_deletion{
	public static void main(String[] args) {
		int daa[] ={1,2,3,4,5,6,7,8,9};


		for(int i=0;i<daa.length;i++){
			if(daa[i] == 5){
				for(int j=i;j<daa.length-1;j++){
					daa[j] = daa[j+1];
				}
			}
		}

		for(int i=0;i<daa.length;i++){
			System.out.println(daa[i]);
		}

	}
}