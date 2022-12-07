package p2;
import p1.*; // importing all classes in package p1

// Class B is subclass of A
class B extends A
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.displayProtected();
    }

}

class C {
    public static void main(String args[])
    {
        A obj = new A();
        obj.displayPublic();


    }


    }
