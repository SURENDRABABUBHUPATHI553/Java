public class TryCatch 
{
    public static void main(String[] args)
    {
        int num1 = 100;
        int num2 = 0;
        int res;
        
        try
        {
            res = num1 / num2;              //Here it is runtime error thats why try block doesn't executes
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Successfully Executed");
    }
}
