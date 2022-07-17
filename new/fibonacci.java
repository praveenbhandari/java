// class fibonacci{
// 	int series(int n){
// 		if(n <= 1){return n;}
// 		return series(n-1)+series(n-2);
// 	}

// 	public static void main(String[] args) {
// 		fibonacci f= new fibonacci();

// 		System.out.println(f.series(9));
// 	}
// }





class fibonacci{

int series(int n){
	int c=0,num1=0,num2=1;
	int sum=0;
	while(c<n){
		int num3 = num1+num2;
		num1=num2;
		num2=num3;
		sum=num3;
		c++;
	}

return sum;
}


	public static void main(String[] args) {
		fibonacci f= new fibonacci();

		System.out.println(f.series(9));
	}

}