class merges_ort{
    static void disp(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    static void conquer(int arr[],int left[],int right[]){
        // int ss[]=new int[arr.length];
        // for(int i=0;i<left.length;i++){
        //     for(int j=0;i<right.length;j++){
        //         if(left[i]>right[j]){
        //             // arr[i]=
        //             ss[]
        //         }
            
        //     }    
        // }
        int i=0,j=0,k=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }

        while(i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }

        while(j<left.length){
            arr[k]=right[j];
            j++;
            k++;
        }



    }

    static void divide(int arr[]){
        int n=arr.length;
        int mid=n/2;
        int left[]=new int[mid];
        int right[]=new int[n-mid];
        if(n < 2){return;}
        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }

        for(int i=mid;i<n;i++){
            right[i-mid]=arr[i];
        }
        // System.out.println(left);
        // System.out.println(right);
        divide(left);
        divide(right);
        conquer(arr,left,right);
       



    }




    public static void main(String args[]){
        int arr[]={3,2,62,6,11,0,99,55,1,5,6,2,7,8};

        divide(arr);
         disp(arr);

    }
}