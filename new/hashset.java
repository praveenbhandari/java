import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
class hashset{

	public static void main(String[] args) {
	HashSet<Integer> i=new HashSet<>();
	i.add(2);i.add(1);i.add(4);i.add(2);i.add(5);i.add(7);i.add(9);i.add(4);
	Iterator itr= i.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}

	HashMap<Integer,String> hm=new HashMap<>();
	hm.put(9,"nine");
	hm.put(2,"two");
	hm.put(4,"four");
	hm.put(11,"eleven");
	hm.put(6,"six");
	hm.put(4,"five");
	hm.put(8,"eight");
	hm.put(7,"sdeven");


	Iterator<Integer> ia=hm.keySet().iterator();

	while(ia.hasNext()){
		Integer a= itr.next();
		System.out.println(itr.get(a));

	}


	}
}