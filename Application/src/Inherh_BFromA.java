
 class Inherh_BFromA  {
public static void main(String[]args){
	
	b k= new b();
	k.m2();
	k.m1();
}
}
 
 //--------Class X------
class a
{
public	void m1()
{
		System.out.println("m1 of class A");
}
}
//---------Class y------
class b extends a
{
 public	void m2(){
		System.out.println("M2 of class B");
	}
	
}
	
