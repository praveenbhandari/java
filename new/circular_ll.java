class circular_ll{
	node head,tail;
	class node{
		int data;
		node next;
		node(int data){
			this.data=data;
			// node.next = null;
		}
	}
	void insert(int data){
		node n=new node(data);

		if(head == null){
			head = n;
			tail = n;
			tail.next = head;
		}	else{
			tail.next=n;
			tail=n;
			tail.next=head;

		}
	}



	void display(){
		node n=head;
		// do{}
		while(n.next!=head){
			System.out.println(n.data);
			n=n.next;
		}
	}









	public static void main(String[] args) {
		circular_ll cs= new circular_ll();
		cs.insert(20);
		cs.insert(30);
		cs.insert(40);
		cs.display();

		
	}
}