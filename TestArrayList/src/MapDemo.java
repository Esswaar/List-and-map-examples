import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hashmap is basis on key and value storing type
		//it is extends abstractmap and implements map interface
		//it contains only unique values 
		//it does not maintain order to store
		//hashmap is not synchronised --- not thread safe
		Map<String, String> map = new HashMap<String,String>();
		map.put("name2", "reddy");
		map.put("name", "Eswar2");
		map.put("dept","admin");
		System.out.println(map.get("name"));
		for(Entry<String, String> m : map.entrySet()) {
			System.out.println("hashmap is "+m.getValue());
		}
		map.remove("dept");
		for(Entry<String, String> m : map.entrySet()) {
			System.out.println("hashmap is "+m.getValue());
		}
		System.out.println(map);
		
		Map<Integer, Employee> map2 = new HashMap<Integer,Employee>();
		Employee employee1 = new Employee(101, "eswar", 40000);
		Employee employee2 = new Employee(102, "siva", 60000); 
		Employee employee3 = new Employee(103, "munna", 30000);
		map2.put(1, employee1);
		map2.put(2, employee2);
		map2.put(3, employee3);
		for(Entry<Integer,Employee> entry : map2.entrySet()) {
			int i = entry.getKey();
			Employee e = entry.getValue();
			System.out.println(i+"info");
			System.out.println(e.getName()+e.getEmpId()+e.getSalary());
		}
 		}

}
