//ID : 21CE121
//Name : Prasan Savaliya
abstract class GeometricObject
{
abstract void Draw(); abstract double getArea();
abstract double getPerimeter(); void Display()
{
System.out.println("In Abstract Class");
}
}
class Rectangle extends GeometricObject
{
//Scanner sc=new Scanner(System.in); void Draw()
{
System.out.println(""); System.out.println("Rectangle");
}
double getArea()
{
int l=5,b=17; return(l*b);
 
	}
double getPerimeter()
{
int l=13;


int b=22; return(2*(l+b));
}
@Override
void Draw() {
    // TODO Auto-generated method stub
    
}

}
class Circle extends GeometricObject
{
void Draw()
{
System.out.println("Circle");
}
double getArea()
{
int r=2; return(3.14*r*r);
}
double getPerimeter()
{
int r=7; return(2*3.14*r);
}
}
public class Prac_1 {
public static void main(String[] args)
{
    int l,b;
    GeometricObject g=new Circle(); g.Draw();
    System.out.println("Area of Circle is:" +g.getArea()); 
    System.out.println("Perimeter of Circle is:" +g.getPerimeter()); 
    GeometricObject g1=new Rectangle();
    g1.Draw();
    System.out.println("Area of Rectangle is:" +g1.getArea()); 
    System.out.println("Perimeter of Rectangle is:"+g1.getPerimeter());
    System.out.println(""); 
    System.out.println("Prepared by Prasan_21CE121");
}

}
