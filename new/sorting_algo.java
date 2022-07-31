class sorting_algo{
    static void display(int arr[]){
        for(int ass:arr){
        System.out.print(ass+" ");
        }
    }

    static void binary_search(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        display(arr);
    }

    static void selection_sort(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            int ind=0;
            for(int j=1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    ind=j;
                }
            }
            
        int t=arr[i];
        arr[i]=arr[ind];
        arr[ind]=t;
        }
        display(arr);
    }

    static void conquer(int arr[],int left[],int right[]){
        int



        
        display(arr);
    }

    static void merge_sort(int arr[]){
        int mid=arr.length/2;
        int left[]=new int[mid];
        int right[]=new int[arr.length-mid];
        if(arr.length<2){return;}
      for(int i=0;i<mid;i++){
        left[i]=arr[i];
      }
      for(int i=mid;i<arr.length;i++){
        right[i-mid]=arr[i];
      }
        merge_sort(left);
        merge_sort(right);
       conquer(arr,left,right);
        // display(arr);


    }







    public static void main(String arg[]){
        int a[]={3,2,62,6,11,0,99,55,1,5,6,2,7,8};
        System.out.print("bubble sort : ");
        binary_search(a);
        System.out.println();
             
        System.out.print("selection sort : ");
        selection_sort(a);     
         System.out.println("merge sort : ");
        merge_sort(a);     
           




    }
}































// class sorting_algo{
//     static void bubble_sort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//             if(arr[j]>arr[j+1]){
//                 int t=arr[j];
//                 arr[j]=arr[j+1];
//                 arr[j+1]=t;
//             }
//         }
//         }
//          display(arr);
//     }

// static void display(int[] a){
//     for(int ass:a){
//         System.out.print(ass+" ");
//     }
// }



//     public static void main(String arg[]){
//         int a[]={3,2,62,6,11,0,99,55,1,5,6,2,7,8};

//         bubble_sort(a);
       


//     }
// }