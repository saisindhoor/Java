//calling Class B from Class A using object
public class A {

	
	public static void main(String[] args) {
		
B k=new B();
k.s();
	}

}
class B{
	
void s(){
	
	System.out.println("inside method s of class B");
}	
	
}