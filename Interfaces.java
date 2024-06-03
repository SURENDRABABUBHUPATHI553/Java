public class Interfaces 
{
    public static void main(String[] args)
    {
        Fortuner c1 = new Fortuner();
        c1.isMoving();
    }
}


interface Car
{
    void isMoving();
    void isGood();
}



class Fortuner implements Car 
{
    public void isMoving()
    {
        System.out.println("This car is moving");
    }

    public void isGood()
    {
        System.out.println("This car is in Good Condition");
    }
}