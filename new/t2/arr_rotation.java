class arr_rotation{

    static void rotate(int arr[],int k){
        int a[]=new int[arr.length];
        // int c=0;
        for(int i=0;i<arr.length;i++){
            if(i>=k){
                a[i-k]=arr[i];
            }else{
                a[arr.length-k+i]=arr[i];
            }
        }
        for(int aa:a){
            System.out.println(aa);
        }
    }

    public static void main(String arg[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        rotate(arr,3);


    }
}