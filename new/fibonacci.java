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

// int series(int n){
void series(int n){
	int c=0,num1=0,num2=1;
	int sum=0;
	while(c<n){
		System.out.println(num1+" ");
		// System.out.println(num1+" + " num2+" = "+num3);
		int num3 = num1+num2;

		// System.out.print(num1+" + "+num2+" = "+num3+"\n");
		num1=num2;
		num2=num3;

		// System.out.print("num1 : "+num1+"num2 : "+num2+"\n");
		// sum=num1;
		c++;
	}

// return sum;
}


	public static void main(String[] args) {
		fibonacci f= new fibonacci();
f.series(10);
		// System.out.println(f.series(10));
	}

}