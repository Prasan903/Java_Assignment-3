//ID : 21CE121
//Name : Savaliya Prasan Ashvinbhai
/*Aim : WAP that illustrate the interface inheritance. Interface
        P is extended by P1 and P2 interfaces.
        Interface P12 extends both P1 and P2.
        Each interface declares one method and one constant.
        Create one class that implements P12.
        By using the object of the class invokes each of its method and displays constant.*/
interface P
{
	int varP=10;
	void methodP();
}
interface P1 extends P
{
	int varP1=20;
	void methodP1();
}
interface P2 extends P
{
	int varP2=30;
	void methodP2();
}
interface P12 extends P1,P2
{
	int varP12=40;
	void methodP12();
}
class InterfaceInheritance implements P12
{
	public void methodP()
{
	System.out.println("Method of interface P called...");
}
	public void methodP1()
{
	System.out.println("Method of interface P1 called...");
}
	public void methodP2()
{
	System.out.println("Method of interface P2 called...");
}
	public void methodP12()
{
	System.out.println("Method of interface P12 called...");
}
	
}
public class Prac_3
{
	public static void main(String[] args)
	{
	    InterfaceInheritance I=new InterfaceInheritance();
	    I.methodP();
        System.out.println("interface P constant: "+I.varP+"\n");
        I.methodP1();
        System.out.println("interface P constant: "+I.varP1+"\n");
        I.methodP2();
        System.out.println("interface P constant: "+I.varP2+"\n");
        I.methodP12();
        System.out.println("interface P constant: "+I.varP12+"\n");
        System.out.println("Prepared by Prasan_21CE121");
	}
}
