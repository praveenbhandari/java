class ss{
    static void display(int arr[]){
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                // System.out.print(arr[j]+" ");
            if(arr[i]>=arr[j]){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
            }
        }
        
        System.out.println();
        display(arr);
    }

    static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
        int min=0;
            for(int j=1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    min=j;
                }
            }
        int t=arr[i];
        arr[i]=arr[min];
        arr[min]=t;
        }


        System.out.println();
        display(arr);
    }

// NN
    // static void swap

    static void quick_sort(int arr[]){
        int piv=arr[0];
        int l=0;int r=arr.length-1;
        

        for(int i=0;i<arr.length;i++){
            if(arr[piv]<arr[i]){
                int t=arr[piv];
                arr[piv]=arr[i];
                arr[i]=t;
            }
        }




       
        
        System.out.println();
        display(arr);
    }

    static void conquer(int arr[],int left[],int right[]){
        int i=0,j=0,k=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
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


    static void merge_sort(int arr[]){
        int mid=arr.length/2;
        int left[]=new int[mid];
        int right[]=new int[arr.length-mid];
        if(arr.length < 2){return;}
        for(int i=0;i<mid;i++){
            left[i]=arr[i];
        }
        for(int i=mid;i<arr.length;i++){
            right[i-mid]=arr[i];
        }


        merge_sort(left);
        merge_sort(right);
        conquer(arr,left,right);









    }


    static void inserttion_sort(int arr[]){

        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            for(int j=0;j>=0 && arr[i]<arr[j];j--){
                arr[j]=arr[j+1];

            }
            // arr[i-1]=arr[i];
        }






        // for(int i=1;i<arr.length;i++){
        //     int c=arr[i];
        //     int j=i-1;
        //     while(j>=0 && arr[j]>c){
        //         arr[j+1]=arr[j];
        //         j--;
        //     }
        //     arr[j+1]=c;

        //     // for(int j=0;j>=0 && arr[i]<arr[j];j--){
        //     //     arr[j+1]=arr[j];
        //     //     // arr[j+1]=arr[i];

        //     // }
            
        // }

        // for(int i=1;i<arr.length;i++){
        //     for(int j=arr.length;j<=0;j--){
        //         if(arr[j]>=arr[i]){
        //             arr[j+1]=arr[i];
        //         }
                
        //             arr[j+1]=arr[i];
        //     }
        //     // arr[i]=arr[i+1];
        // }


       
    }



    static void qq(int arr[],int left[],int right[]){
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
        while(j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }

    }

static void merge(int arr[]){
    int mid=arr.length/2;
    int left[]=new int[mid];
    int right[] = new int[arr.length-mid];
if(arr.length <2){return;}
    for(int i=0;i<mid;i++){
        left[i]=arr[i];
    }

    for(int i=mid;i<arr.length;i++){
        right[i-mid]=arr[i];
    }
    merge(left);
    merge(right);
    qq(arr,left,right);


}



    public static void main(String arg[]){
        // int a[]={3,2,62,6,11,0,0,99,55,1,5,6,2,7,8};
        int a[]={2,4,77,3,55,1,99,4,3,100};
        
        // System.out.print("arr : ");
        display(a);
        
        // bubble_sort(a);
        //  display(a);
        // selection_sort(a);
        // quick_sort(a);

        System.out.println();
        merge(a);
        display(a);

        // inserttion_sort(a);
        // System.out.println("inser");
        // display(a);


                



    }
}