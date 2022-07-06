// incomplete
class binary_search{
	int search(int arr1[],int start,int end,int x){
	
		int mid=(start+end)/2;
		if(x == arr1[mid]){
			return mid;
		}
		if(x > arr1[mid]){
			// int n_mid=arr[mid+1]/
			return search(arr1,mid+1,end,x);
		} 
		if(x != arr1[mid]){
			return -1;
		}	
		return search(arr1,start,mid-1,x);
// }
// return -1;

	} 


	public static void main(String arg[]){
binary_search bs=new binary_search();
int aqr[]={1,5,6,8,9,11,14,17,21,44,66,88,89,90};
int n=aqr.length;
int k=80;
System.out.println("Found "+k+" at index "+bs.search(aqr,0,n-1,k));

	}
}