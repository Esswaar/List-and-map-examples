import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	@SuppressWarnings("unchecked")
	public static<E> void main(String[] args) {
		// TODO Auto-generated method stub
		//Arraylist is a dynamic array//array is a static array(fixed size)
		//Arraylist can contain duplicates
		//maintains insertion order
		//synchronized
		//allows random acces to fetch the element because of it stores the values basis of indexes
		ArrayList ar = new ArrayList();
		ar.add(100);//index 0
		ar.add(200);//1
		ar.add(300);//2
		ar.add(2012);//3
		ar.add(2010);//4
		System.out.println("arraylist size is "+ar.size());//to print arraylist size(index+1)
		for (int i = 0; i < ar.size(); i++) {
			System.out.println("print arraylist:"+ar.get(i));//to iterate arraylist
					
		}
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
//		ar1.addAll(ar);
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println("print arraylist 1 :"+ar1.get(i));//to iterate arraylist
					
		}
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("eswar");
		ar3.add("200");
		
		for (int i = 0; i < ar3.size(); i++) {
			System.out.println("print arraylist 2:"+ar3.get(i));//to iterate arraylist
					
		}
		
		Employee employee1 = new Employee(101, "eswar", 40000);
		Employee employee2 = new Employee(102, "siva", 60000); 
		Employee employee3 = new Employee(103, "munna", 30000);
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(employee1);
		ar4.add(employee2);
		ar4.add(employee3);
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			
			System.out.println("Print employee Names:" + emp.getName());
		}
		
		ar1.retainAll(ar);
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println("common variables:"+ar1.get(i));//to iterate arraylist
					
		}
		ArrayList<E> ar6 = new ArrayList<E>();
		ar6.add((E) "200");
		System.out.println(ar6.get(0));
	
		
		
		

	}

}
