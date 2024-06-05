public class Annotations 
{
    public static void main(String[] args)
    {
        B b = new B();
        b.show();
    }
}


class A 
{
    public void show()
    {
        System.out.println("This is class A");
    }
}

class B extends A
{
    @Override                       //This is Annotation
    public void show()              //If we mention annotation override it gets an error if there is no method with that name to override
    {
        System.out.println("This is Class B");
    }
}
