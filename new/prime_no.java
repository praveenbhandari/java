import java.util.*;  
class prime_no{
	boolean i_prime(int num){
		if(num == 2){
			// System.out.println(num+" true");
			return true;
		}
		else if( num%2 == 0 || num%3==0){
// System.out.println(num+" false");
			
			return false;}
		// else if(num < 2 ){
// System.out.println(num+" false");
			
// 			return false;}
// 		else if( num%2 == 0){
// // System.out.println(num+" false");
			
// 			return false;}
		// System.out.println(Math.sqrt(num));
		for(int i=3;i<Math.sqrt(num);i++){
			if(num%i == 0){
				// break;
				return false;

			}
			// return
		}

		// System.out.println(num+" true");
			
		return true;
	}
	public static void main(String[] args) {
		prime_no p=new prime_no();
		// int pri[20];
		List<Integer> arr=new ArrayList<Integer>();
for(int i=0;i<50;i++){
	if(p.i_prime(i)){
		// pri
		arr.add(i);
	}
}
for(int i=0;i<arr.size();i++){
	// if(p.i_prime(i)){
	// 	// pri
	// 	arr.add(i);
	// }
	System.out.println(arr.get(i));
}
		System.out.println(p.i_prime(13));
		System.out.println(p.i_prime(15));
		System.out.println(p.i_prime(22));
		System.out.println(p.i_prime(23));
	}
}