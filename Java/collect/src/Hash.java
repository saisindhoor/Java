import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;


class Hash {
	public static void main(String[] args) {
HashMap k= new HashMap();
k.put("abd","sai");
k.put("2", "sindhoor");
k.put("3", "palla");
Set keys=k.keySet();
Iterator itr = keys.iterator();

while(itr.hasNext()){
Object o	=itr.next();

if(o instanceof String){
	String t= (String)o;
	System.out.println(t);
}}
		
		
		
	}

}
