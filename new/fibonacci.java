class fibonacci{
	int series(int n){
		if(n <= 1){return n;}

		return series(n-1)+series(n-2);


	}

	public static void main(String[] args) {
		fibonacci f= new fibonacci();

		System.out.println(f.series(9));
	}
}