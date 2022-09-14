//ID : 21CE121
//Name : Savaliya Prasan Ashvinbhai
//Aim : Write a program that illustrates the significance of interface default method.

interface Vehicle
{
    String getBrand(); 
    String speedUp();
    String slowDown(); 
    default String turnon()
    {
        return "Turning the vehicle on ! ";
    }
    default String turnof()
    {
        return "Turning the vehicle off ! "; 
    }
}
class Car implements Vehicle
{
    private String brand; Car(String a)
    {
        this.brand=a;
    }
	public String getBrand()
    {
        return brand;
    }
    public String speedUp()
    {
        return "The car is speeding up.";
    }
    public String slowDown()
    {
        return "The car is slowing down.";
    }
}
public class Prac_7
{
    public static void main(String[] args)
    {
    System.out.println("");
    System.out.println("Interface Vehicle has default methods turnon and turnof and class car implements Vehicle ! ");
    System.out.println("Now a object is created of class Car and is used to print ! "); 
    System.out.println("");
    Vehicle car = new Car("Tata"); 
    System.out.println(car.getBrand()); 
    System.out.println(car.speedUp()); 
    System.out.println(car.slowDown()); 
    System.out.println(car.turnon()); 
    System.out.println(car.turnof()); 
    System.out.println("");
    System.out.println("Here we can access functions turnon and turnof because they arecreated as default is interface Vehicle");
    System.out.println("");
    System.out.println("prepared by Prasan_21CE121");
    }
}
