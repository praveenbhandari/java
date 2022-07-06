class insertion{
	int insert(int arr[],int n,int cap,int key){
		if(n>=cap){
			return n;
		}
		for(int i=0;i<cap && arr[i]>key ;i++){
			arr[i+1]= arr[i];
		}
		arr[i]=key;
		return (n+1);



	}


	public static void main(String arg[]){
		insertion_sort i=new insertion_sort();
		int aqr[]={1,5,6,8};
		int cap=aqr.length;
		int n=5;
		System.out.println(insert(aqr,n,cap,4));


	}
}