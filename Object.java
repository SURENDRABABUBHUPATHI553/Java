public class Object {
    public static void main(String[] args)
    {
        Animal A1 = new Animal();               // Create a new object with new keyword
        A1.legs();                              // We can create any number of objects for class
    }                                           
}


class Animal                                       //Animal is a class
{
    public void legs()
    {
        System.out.println("Animals having four legs");
    }

}
