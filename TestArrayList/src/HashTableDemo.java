import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Similar to hashmap
		//based on key value storing
		//it is synchronised
		//key stored in the form of object, object has a hashcode ,using of this hashcode we can access the value w.r.to key.
		//it contain unique elements
		//no null key values
		Hashtable<Integer, String> ht =  new Hashtable<Integer,String>();
		ht.put(1, "Eswar");
		ht.put(2, "Eswar2");
		ht.put(3, "Eswar3");
		@SuppressWarnings("unchecked")
		Hashtable<Integer, String> ht1 =(Hashtable<Integer, String>)ht.clone();
		System.out.println("ht "+ht);
		System.out.println("ht1 "+ht1) ;
		Enumeration e = ht.elements();
		System.out.println("print values");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		if(ht.contains("Eswar")) {
			System.out.println("value is found");
		}
		else {
			System.out.println("not found");
		}
		//entry set will give the hashtable values
		Set set= ht.entrySet();
		System.out.println(set);
		
		

	}

}
