import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Eswar");
		ll.add("naveen");
		ll.add("siva");
		ll.add("reddy");
		ll.add("mahesh");
		System.out.println("print linked list :"+ll);
		ll.addFirst("pawan");
		ll.addLast("chiru");
		/*System.out.println("print linked list :"+ll);
		
		ll.remove(2);
		System.out.println("print linked list :"+ll);*/
		//iterating linked list
		//using for loop
		for (int i = 0; i < ll.size(); i++) {
			System.out.print(ll.get(i)+"\t");
		}
		//using advance for loop 
		System.out.print("\n");
		for(String i : ll) {
			System.out.print(i+"\t");
			
		}
		//usign iterator object
		System.out.print("\n");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.print(str+"\t");
		}
		//while loop
		System.out.print("\n");
		int num =0;
		while(ll.size() > num) {
			System.out.print(ll.get(num)+"\t");
			num++;
		}
	}

}
