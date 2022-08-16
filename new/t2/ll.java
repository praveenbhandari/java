class ll{
    node head,tail;
     class node{
        int data;
        node next;
        node(int d){
            this.data=data;
            // next=head;
        }
    }

     void insert(int data){
        node n=new node(data);
        if(head == null){
            head=n;
            // head.next=head;
        }
        else{
            head.next=n;
            
        }
    }

     void disp(){
        node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }




    public static void main(String args[]){
ll l=new ll();
l.insert(11);l.insert(12);
l.insert(15);l.insert(14);
l.disp();
    }
}