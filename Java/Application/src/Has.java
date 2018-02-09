
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


class Has {
	public static void main(String[] args) {
Map k= new HashMap();
k.put("abd","sai");
k.put("bbc", "sindhoor");
k.put("ccb", "palla");
Set keys=k.keySet();
Iterator itr = keys.iterator();

while(itr.hasNext()){
String o=(String)itr.next();

//if(o instanceof String){
	//String t= (String)o;
	System.out.println(o);
}
//}
		
		
		
	}

}
