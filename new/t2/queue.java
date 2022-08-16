class queue{
    static int a[]=new int[10];
    static int start=0;
static int end=0;
    static void insert(int data){
        a[end++]=data;
        // disp(a);
    }
     static void pop(){
        // int as[]=new int[end-start];
        // for(int i=0;i<as.length;i++){
        //     as[i]=a[start++];
        // }
        a[start++]=0;
        // System.out.println("..........///////////...............");
        // disp(as);
    }
    
static   void disp(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String arg[]){
        insert(10);
        insert(1);
        insert(3);
        insert(5);
        insert(2);
        pop();
        insert(120);
        insert(9);
        pop();

 for(int i=start;i<end;i++){
            System.out.println(a[i]);
        }


    }
}
