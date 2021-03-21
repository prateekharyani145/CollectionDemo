package _11Map;
import java.util.HashMap;
public class MapDemo {
	public static void main(String[] args) {
		 HashMap<Integer, String> mp = new HashMap<Integer, String>();	
		 mp.put(1, "Lakshya");
		 mp.put(2, "Saluja");
		 mp.put(3, "Prateek");
		 mp.put(4, "Haryani");
		 mp.put(null,null);
		 System.out.println(mp);
// {null=null, 1=Prateek, 2=Haryani, 3=Lakshya, 4=Saluja}
		 mp.remove(1);
		 System.out.println(mp);
		 //{null=null, 2=Saluja, 3=Prateek, 4=Haryani}
		 System.out.println(mp.containsKey(4));
		//true
		 System.out.println(mp.isEmpty());
		 //false
		 System.out.println(mp.size());
		 //4
		 System.out.println(mp.keySet());
		 //[null, 2, 3, 4]
		 System.out.println(mp.get(2));
		 //Saluja
		 System.out.println(mp.values());
		 //[null, Saluja, Prateek, Haryani]
		 System.out.println(mp.entrySet());
		 //[null=null, 2=Saluja, 3=Prateek, 4=Haryani]
		 mp.clear();
		 System.out.println(mp);
		 //{}
		 
		 
		 
		 
		 
	}

}
