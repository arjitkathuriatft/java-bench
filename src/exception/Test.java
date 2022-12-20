package exception;

public class Test {


    public void abc() {

            System.out.println(5/0);

        System.out.println("Hello");



    }

    public void multiCatch() {

        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        }

        catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }

        finally {
            System.out.println("I am finally block");
        }


        System.out.println("rest of the code");
    }


    public void aaa(){
        int age = 20;

        if(age<18){
            throw new ArithmeticException("below");
        }
        else
            System.out.printf("above");
    }

    public void bbb() throws Exception{
            Thread.sleep(2000);
    }

    public void cc(){
        System.out.printf("I am cc");
    }


    public void ff(){
        System.out.println("--------");
    }


    public static void main(String[] args) throws Exception {
        Test t1 = new Test();
//        t1.multiCatch();
//        t1.aaa();
        t1.bbb();



    }
}
