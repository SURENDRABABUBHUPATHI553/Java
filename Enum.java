public class Enum
{
    public static void main(String[] args)
    {
        // Cars c = Cars.fortuner;      //It can be accessed one element in enum
        // System.out.println(c);

        // Cars arr[] = Cars.values();
        // for(Cars c : arr)                    //Iterate for all the objects in enum
        // {
        //     System.out.println(c);
        // }

        Cars arr[] = Cars.values();
        for(Cars c : arr)
        {
            System.out.println("The price of a Car " + c + " is " + c.getPrice() + " and the mileage of this car is "+c.getMileage());
            
        }

        Bikes bike = Bikes.pulsar;
        switch(bike)
        {
            if(bike == pulsar)
            {
                
            }
        }
        
    }
}



enum Cars
{
    fortuner(4000000,4), landrover(9000000,3), creta(1500000,15), baleno(1000000,20);           //these are named constraints


    private int price;
    private int mileage;


    private Cars(int price, int mileage)
    {
        this.price = price;
        this.mileage = mileage;
    }


    public int getPrice()
    {
        return price;
    }

    public int getMileage()
    {
        return mileage;
    }

}


enum Bikes
{
    pulsar, hornet, duke, himalayan;
}