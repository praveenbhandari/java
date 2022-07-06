class linked_list{
	 node head;
	static class node{
		int data;
		node next;
		node(int d){
			data=d;
			next=null;
			System.out.println("d : "+d+"\n");
			System.out.println("next : "+next+"\n");
		}


	}







public static void main(String args[]){
linked_list ll=new linked_list();
ll.head=new node(1);
node sec=new node(2);
node third =new node(3);

ll.head.next=sec;
sec.next=third;
System.out.println("ll.head : "+ll.head+"\n");
System.out.println("ll.head.next : "+ll.head.next+"\n");

// System.out.println("third : "+sec+"\n");
System.out.println("sec : "+sec.next+"\n");
// System.out.println("sec : "+third+"\n");
System.out.println("third : "+third.next+"\n");

// System.out.println("d : "+sec.next+"\n");
// System.out.println("next : "+next+"\n");

// System.out.println("d : "+d+"\n");
// System.out.println("next : "+next+"\n");


node h=ll.head;
while(h!= null){
	System.out.println(h.next+" -> "+h.data+"\n");
	h= h.next;
}

}

}