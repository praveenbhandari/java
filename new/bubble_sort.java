// NN
class bubble_sort{
	void sort(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j] > arr[j+1]){
					int t=arr[i+1];
					arr[i+1]=arr[i];
					t=arr[i];
				}
			}
		}
	}
	void print(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}





	public static void main(String[] args) {
		int ars[]={33,2,32,53,6,2,7,7,99,1,0};
		bubble_sort b=new bubble_sort();
		b.sort(ars);
		b.print(ars);
	}
}