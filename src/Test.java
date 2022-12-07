public class Test {

    int a = 10;

    public void abc() {

        int a = 5;
        System.out.println(a);


    }
    public void xyz(){
        System.out.println(a);
    }


    public static void main(String[] args) {
        Test t1 = new Test();
        t1.abc();
        t1.xyz();
        System.out.println();


    }
}
