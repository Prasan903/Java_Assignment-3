//ID : 21CE121
//Name : Savaliya Prasan Ashvinbhai
//Aim : Develop a Program that illustrate method overriding concept.
class cricket
{
	void print()
    {
	System.out.println("match");
    }
}
class ipl extends cricket
{
    void print()
    { 
	    System.out.println("t20");
    }
}
class odi extends cricket
{
    void print()
    {
        System.out.println("oneday");
    }
}
class test extends cricket
{
    void print()
    {
        System.out.println("test");
    }
}
public class Prac_4
{
    public static void main(String[] args)
    {
        cricket a=new cricket(); a.print();
        ipl b=new ipl(); b.print();
        odi c=new odi(); c.print();
        test d=new test(); d.print();
        System.out.println("Prepared by 21CE121_Prasan");
}
}
