import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
public class itera {
	public static void main(String[] args) {
		ArrayList k= new ArrayList();
		k.add("abc");
		k.add("xyz");
		k.add("opi");
		
		Iterator itr = k.iterator();
		
		while(itr.hasNext()){
	String	o	=(String)itr.next();
	System.out.println(o);
	
	if( o instanceof String){
		System.out.println("True");
	}
	else{
		
		System.out.println("Faalse");
	}
		}
	}
}
