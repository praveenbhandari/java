class circular_ll{

    node head,tail;
    class node{
        node next;
        int data;
        node(int data){
            this.data=data;
        }
    }

    void insert(int data){
        node n=new node(data);
        if(head == null){
            head = n;
            tail=n;
            tail.next=head;
            // return;
            // nead
        }
        else{
            // n.next=head;
            tail.next=n;
            tail=n;
            tail.next=head;
        }
        
    }

    void dis(){
        node n=head;

        do{
            System.out.print(" "+ n.data);  
                n = n.next;  
            }while(n != head);  

        // while(n != head){
        //     System.out.print("->"+n.data);
        //     n=n.next;
        // }
    }


    public static void main(String arg[]){
circular_ll c=new circular_ll();
c.insert(20);c.insert(120);c.insert(220);
c.dis();
    }
}