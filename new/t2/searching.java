class searching{
    static int binary_search(int arr[],int start,int end,int k){
        int  mid=(start+end)/2;
        if(arr[mid] == k){
            return mid;
        }
        else if(k<arr[mid]){
            return binary_search(arr,start,mid-1,k);
        }
        else if(k != arr[mid]){
            return -1;

        }
        else{
              return binary_search(arr,mid+1,end,k);
        }
        
        // return binary_search(arr,mid+1,end,k);
        // return -1;
    }

    static void dis(int arr[]){
        for(int aa:arr){

            System.out.println(aa);

        }
    }
    static void bubble_sort(int arr[]){
       for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
       }
        dis(arr);
    }

    static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;

                    
                }

            }
        }
        dis(arr);
    }

    static void insertion_sort(int arr[]){
        // int curr=0;
        for(int i=0;i<arr.length-1;i++){
            // for(int j=0;j<i;j++){
            //     if(arr[i]>arr[]){}
            // }
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        dis(arr);
        
    }


    




    public static void main(String arg[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        int b[]={34,5,2,6,8,12,778,18,2,0};
    // bubble_sort(b);
    // selection_sort(b);
    insertion_sort(b);
// System.out.println("..."+binary_search(a,0,a.length,11));


    }


  
}