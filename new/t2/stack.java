class stack{
static int a[]=new int[9999999999];
static int c_index=0;
    static void insert(int data){
        a[c_index++]=data;
        // int as[]=new int[a.length+1];
        // insert(data);
    }
    static void pop(){
        a[c_index--]=0;
    }


    public static void main(String args[]){
insert(10);
insert(20);
pop();
insert(1);
insert(12);
insert(01);
pop();

for(int i=0;i<c_index;i++){
    System.out.println(a[i]);
}


    }
}
