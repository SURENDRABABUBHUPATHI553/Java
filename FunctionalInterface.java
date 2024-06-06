public class FunctionalInterface
{
    public static void main(String[] args)
    {
        // WagonR w1 = new WagonR();
        // w1.company();                            //First Type

        // Car w1 = () ->
        // {
        //     System.out.println("This is from Maruthi Suziki Company");       //Second Type
        // };
        // w1.company();

        // Car w1 = () -> System.out.println("This is from Maruthi Suziki Company");
        // w1.company();                                                            //Third Type

        Addition add1 = (i,j) -> System.out.println(i+j);
        add1.add(10,20);

    }
}


interface Addition
{
    // void company();
    void add(int num1, int num2);
}

// class WagonR implements Car                          //First Type
// {
//     public void company()
//     {
//         System.out.println("This car is from Maruthi Suziki");
//     }
// }
