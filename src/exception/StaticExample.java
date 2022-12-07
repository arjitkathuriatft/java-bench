package exception;

public class StaticExample {

    static int a = 1;
    int b = 1;

    public void abc(){

        System.out.println(++a);
        System.out.println(++b);

    }

    public static void main(String[] args) {
        StaticExample s1 = new StaticExample();
        StaticExample s2 = new StaticExample();
        s1.abc();
        s2.abc();
    }
}
