package pattern;
import java.util.*;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="papaya";
		Map<Character,Integer> h=new HashMap();
		for(int i=0;i<a.length();i++) {
		char c=a.charAt(i);
		if(h.containsKey(c)) {
			h.put(c,h.get(c)+1);
		}
		else {
			h.put(c,1);
		}
		}
	 
		
		int min=Collections.min(h.values());
		if(min!=1) {

			System.out.println("All are repeating Characters");
		
		}
		else {
		for(Map.Entry<Character,Integer>e:h.entrySet()) {
			if(min==e.getValue()) {
				System.out.println(e.getKey());
				 
				break;
			}
			 
				 
			
			
		}
		
		

	}}

}
