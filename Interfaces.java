public class Interfaces 
{
    public static void main(String[] args)
    {
        Fortuner c1 = new Fortuner();                   //by default variables in interface is static and final
        c1.isMoving();
    }
}


interface Car                             //In interfaces we can create only methods not implementation
{                                           //The implementation of interfaces is in classes
    void isMoving();                        //by default in interfaces methods having 'public static'
    void isGood();
}



class Fortuner implements Car           // class extends class
{                                       // class implents interface
    public void isMoving()              //interface extends interface
    {                                    //class implements multiple interfaces also
        System.out.println("This car is moving");           //Extended interfaces is also having only method not implementations
    }

    public void isGood()
    {
        System.out.println("This car is in Good Condition");
    }
}