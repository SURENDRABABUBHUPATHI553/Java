public class Encapsulation 
{
    public static void main(String[] args)        //Encapsulation is the mechanism of restricting direct access 
                                                    // to some of an object's and restricting how they can be modified or accessed
    {
        Person p1 = new Person();
        p1.setName("Suri");
        p1.setAge(22);
                                                //Data hiding is acheived using access modifiers like private, public, protected
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        System.out.println(p1.name);
    }

}


class Person
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }
}