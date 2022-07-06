// incomplete
class binary_search{
	int search(int arr1[],int start,int end,int x){
		// if(arr1.length()==0){
		// 	return ;
		// }
if(start>=end){
		int mid=end/2;
		if(x == arr1[mid]){
			return x;
		}	
		if(x > arr1[mid]){
			// int n_mid=arr[mid+1]/
			return search(arr1,mid+1,arr1.length-1,x);
		}
		return search(arr1,0,mid-1,x);
}
return -1;

	} 


	public static void main(String arg[]){
binary_search bs=new binary_search();
int aqr[]={1,5,6,8,9,11,14,17,21,44,66,88,89,90};
int n=aqr.length;
System.out.println(bs.search(aqr,0,n-1,11));

	}
}