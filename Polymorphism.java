public class Polymorphism 
{
    public static void main(String[] args)
    {
        Addition a1 = new Addition();
        System.out.println(a1.add(10,20));               //method overloading
        System.out.println(a1.add(10,20,30));

        B a2 = new B();                                            //method overriding
        a2.fun();
    }
}


class Addition                                  //Compile Time Polymorphism
{                                               //Method Overloading
    int add(int num1, int num2)
    {
        return num1 + num2;                 //In this function two methods are there
    }                                           //when we give two parameters it take first method 
                                                    //ehrn we give three parameters it takes second method
    int add(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }
}



class A                                                 //Runtime Polymorphism
{                                                       //when we get same method in child class, child class method overrides the parent class method
    void fun()
    {
        System.out.println("This is first function");
    }
}

class B extends A 
{
    void fun()
    {
        System.out.println("This is Second Function");
    }
}
