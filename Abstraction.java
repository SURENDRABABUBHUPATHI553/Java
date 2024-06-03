public class Abstraction {
    public static void main(String[] args)
    {
        wagonR wagonRCar = new wagonR();
        wagonRCar.fuel();
        wagonRCar.isSound();

        Animal dogA = new Dog();
        dogA.isRun();
        dogA.isSound();
    }
}


//Abstract is the concept of hiding the complex implementation the implement details and showing the essentional features of an object
// Abstract methods are declared without implementation
//You cannot create an object of an abstract class directly

abstract class Car 
{
    public abstract void fuel();                                //create Abstract method
    public void isSound()
    {
        System.out.println("Suyyyyy");
    }
}

class wagonR extends Car 
{
    public void fuel()
    {
        System.out.println("The fuel for this car is Diesel");
    }
}



interface Animal
{
    void isRun();
    void isSound();
}

class Dog implements Animal
{
    public void isRun()
    {
        System.out.println("Dor is Running");
    }

    public void isSound()
    {
        System.out.println("Dog sounds bowbow");
    }
}

