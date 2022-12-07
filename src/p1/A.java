package p1;

public class A
{
    private void displayPrivate()
    {
        System.out.println("Hello");
    }

     void displayDefault()
    {
        System.out.println("Hello");
    }

    protected void displayProtected()
    {
        System.out.println("Hello");
    }

    public void displayPublic()
    {
        System.out.println("Hello");
    }

    public static void main(String args[])
    {
        A obj = new A();
        // Trying to access private method
        // of another class
        obj.displayPrivate();
    }

}

class B
{
    public static void main(String args[])
    {
        A obj = new A();
        // Trying to access private method
        // of another class
        obj.displayDefault();
    }
}