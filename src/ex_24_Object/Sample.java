package ex_24_Object;

public class Sample extends Object {

    public String toString()
    {
        System.out.println("I am coming from object? class");
        return null;
    }

    public int hashCode()
    {
        System.out.println("coming from object");
        return 0;
    }

    public boolean equals(Object obj)
    {
        System.out.println("This is also coming from object class");
        return true;
    }
}
