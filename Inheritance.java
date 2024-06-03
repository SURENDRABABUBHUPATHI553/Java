public class Inheritance 
{
    public static void main(String[] args)
    {
        Parent p1 = new Parent();
        p1.member();
        p1.fun();
        //p1.isShow();         //It gets error beacause parent class doesn't inherits from child class
                               //we can access every method in child class


        Child c1 = new Child();
        c1.member();
        c1.fun();
        c1.isShow();
    
    }

}


class Parent
{
    void member()
    {
        System.out.println("I am Parent class");
    }

    void fun()
    {
        System.out.println("This is a function");
    }
}

class Child extends Parent 
{
    void member()
    {
        System.out.println("I am Child class");
    }

    void isShow()
    {
        System.out.println("This is showing function");
    }
}