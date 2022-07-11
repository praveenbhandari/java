class jump_search{
int search(int x,int arr[]){
int step=(int)Math.floor(Math.sqrt(arr.length)-1);
System.out.println(step);
int i=0;
// int 
// for(int i=0;i<arr.length;i=i+step){
while(i<arr.length){
	// int prev=i+step-1;

System.out.println(arr[i]);
if(arr[i]==x){
	System.out.println(arr[i]);

	return i;
}
if(arr[i]>x){

	System.out.println("Greater");
	System.out.println(arr[i]);
	for(int j=i;j>=i-step;j--){
		System.out.println("for for "+arr[j]);
		if(arr[j] == x){
			System.out.println("for if "+arr[j]);
			return j;
		}
		// else{
		// 	System.out.println("for else"+arr[j]);
		// 	return -1;
		// }
	}
	return -1;
}
// else{
// 	System.out.println("if else "+arr[i]);
// 	continue;
// 	// return -1;
// }

i +=step;
}


return -1;
}




	public static void main(String[] args) {
		jump_search js=new jump_search();
		int a[]={1,4,5,7,9,11,14,22,36,45,48,58,70,89,99};
		System.out.println("found at index : "+js.search(45,a));
	}
}