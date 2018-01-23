
interface Labtop {
void monitor();
void keyboard();
}
class Hp implements Labtop
{
	public void monitor(){System.out.println("displays");}
	public void keyboard(){System.out.println("typing");}
	public static void main(String[]args){
		Hp t=new Hp();
		t.keyboard();
		t.monitor();
		
		
		
	}
	
}
