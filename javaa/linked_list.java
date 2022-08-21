class linked_list{

    static node head;
    static class node{
        node next;
        int data;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
   
   static void insert(int data){
    node n=new node(data);
    if(head == null){
        head=n;
        return;
    }
    n.next=head;
    head=n;
    // show();
   }

    static void deletefirst(){
        if(head == null ) return;
        head=head.next;
    }
    static void delete_last(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head=null;
            return;
        }
        node sec=head;
        node last=head.next;
        while(last.next != null){
            last=last.next;
            sec=sec.next;
        }
        sec.next=null;
    }



    static void show(){
        node n=head;
        while(n != null){
            System.out.print("->"+n.data);
            n =n.next;
        }
 }   
   
    public static void main(String args[]){
        insert(10);insert(50);insert(17);insert(56);insert(120);
         System.out.println(head.next);
        // show();
        // System.out.println(head.next);
        delete_last();
        show();
        
    }
}