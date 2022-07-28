class bubblesort{
 



 public static void main(String[] args) {
 	int a[]={3,2,62,6,11,0,99,55,1,5,6,2,7,8};
   System.out.print("Unsorted : ");
    
    for(Integer aa:a){
        System.out.print(aa+" ");
    }
 	for(int i=1;i<a.length-1;i++){
 		for(int j=0;j<a.length-1;j++){
 			if(a[j]>a[j+1]){
 				int t=a[j];
 				a[j]=a[j+1];
 				a[j+1]=t;
 			}
 		}
 	}	
       System.out.println();

   System.out.print("Sorted : ");

 	for(Integer aa:a){
 		System.out.print(aa+" ");
 	}

 }
}