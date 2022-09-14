//ID : 21CE121
//Name : Savaliya Prasan Ashvinbhai
/*Aim : Write a program to create a default method in an interface IPrinter.
 
	Create an interface IPrinter and IScanner.
You can assume variables and methods for both interfaces. Create a concrete class to implement both the interfaces.
Create 5 objects of the class, store it in Vector and display the result of the vector. */

import java.util.Vector; interface iprinter
{ 
    String ip();
    default void show()
    {
        System.out.println("default iprinter");
    }
}
interface iscanner
{
    String isc();
    default void show()
    {
        System.out.println("default testinterface2");
    }
}
public class Prac_2 implements iprinter,iscanner 
{ 
    @Override
    public String ip() 
    { 
    return "iprinter";
    }

@Override
public String isc() 
{
    return "iscanner";
}

public void show() 
{ 
    iprinter.super.show(); 
    iscanner.super.show();
}

public static void main(String[] args) 
{
    Vector<String> v = new Vector<>(); 
    Prac_2 d= new Prac_2(); 
    v.add(d.ip());
    v.add(d.isc());
    v.add(d.ip());
    v.add(d.isc());
    v.add(d.ip());
    d.show();
    for (int i = 0; i < v.size(); i++) 
    {
        System.out.println(v.get(i));
    }
    System.out.println("Prepared by Prasan_21CE121");
}
}
