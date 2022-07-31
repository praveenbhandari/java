class insertionsort{
	static void disp(int a[]){
		for(int i:a){
			System.out.print(i+" ");
		}
	}
static void insertions(int[] a){
	// int piv=a[a.length-1];
 		for(int i=1;i<a.length;i++){
 			int curr = a[i];
			int j=i-1;
			while(j >= 0 && a[j] > curr ){
				// System.out.println(a[j]+" "+a[j+1]);
			// System.out.println(" .........");
					System.out.print(j);
				a[j+1]=a[j];
					
				// disp(a);
				j--;
				System.out.println(" "+j);
			}
			a[j+1]=curr;
 			// if(piv < curr){
			// 	a[]


			// }
 		}

		
}
	public static void main(String[] args) {
 		int a[]={3,2,62,6,11,0,99,55,1,5,6,2,7,8};
		insertions(a);
		System.out.print("final ");
		disp(a);
	}
}









// import java.util.*;
 
// class Sorting {
//    public static void printArray(int arr[]) {
//        for(int i=0; i<arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
 
//    public static void main(String args[]) {
//        int arr[] = {7, 8, 1, 3, 2};
 
//        //insertion sort
//        for(int i=1; i<arr.length; i++) {
//            int current = arr[i];
//            int j = i - 1;
//                while(j >= 0 && arr[j] > current) {
//                    //Keep swapping
//                    arr[j+1] = arr[j];
//                    j--;
//                }
//            arr[j+1] = current;
//        }
//        printArray(arr);
//    }
// }
