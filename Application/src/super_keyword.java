
class super_keyword 
{
public static void main(String[] args)
{
y N= new y();		
N.k2();

		
}

}


class  x{
	
	void k1(){
		
		System.out.println("inside method K1 of class X");
	}
}

class y extends x
{
void k2()
{
	super.k1();
	System.out.println("insisde method k2 of class y");
}	
}