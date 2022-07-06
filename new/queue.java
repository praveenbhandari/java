class queue{
	int start=0;
	int end=0;
	int data[] =new int[10];
	void enqueue(int dataa){
		// System.out.println(start);
		// System.out.println(end);
		data[start]=dataa;
		start++;
	}
	void dequeue(){
		// System.out.println(start);
		// System.out.println(end);
		data[end]=0;
		end++;
	}
	void print(){
		for(int i=end;i<start;i++){
			System.out.println(data[i]);
		}
	}


	public static void main(String arg[]){
		queue q=new queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.dequeue();
		q.enqueue(5);
		q.enqueue(6);
		q.dequeue();
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		q.enqueue(10);
		q.print();
	}
}