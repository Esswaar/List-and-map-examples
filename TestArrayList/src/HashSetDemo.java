import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		set.add("eswar");
		//set.add("eswar");
		set.add("reddy");
		//set.add("eswar");
		System.out.println(set);
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

}
