
/**
 * Write a description of class WorkshopC111 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorkshopC111
{
    int age; //instance variable 
static int qty; //static variable

public static void main(String[] args)
{ //<className><variable> = new<className>()
    int age =18;
    WorkshopC1 v1 = new WorkshopC111(); //calling instance variable in static method
    System.out.println(v1.age);
    
    System.out.println(age);
    System.out.println(WorkshopC11.qty);
    
} 
    
}