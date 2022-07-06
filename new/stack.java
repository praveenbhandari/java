class stack{
	int top=0;
	int data[]=new int[11];
	
	void push(int val){
		if(top >= 10){
			System.out.println("Stack Overflow : "+val);
		}
		else{
		data[top]=val;
		top++;
			System.out.println("TOP : "+top);
		
	}
	}

	void pop(){
		if(top < 0){
			System.out.println("Stack Underflow");
		}
		else{
		data[top]=0;
		top--;
	}
	}

	void peek(int index){
		System.out.println(data[index]);
	}
void print(){
	for(int i=0;i<top;i++){
		System.out.println(data[i]);
	}
}
	public static void main(String str[]){
		stack s=new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.pop();
		s.pop();
		s.push(8);
		s.push(9);
		s.push(10);
		s.push(11);
		s.push(12);s.push(12);s.push(12);
		s.print();
		s.pop();
		s.pop();
		// s.push(5);

	}
}