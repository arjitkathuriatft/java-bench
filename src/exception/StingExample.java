package exception;

public class StingExample {


    public void abc(){

        String a = "   ABCdef    ";
        String b = "ABcD";

        System.out.println(a.trim());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.charAt(0));


    }


    public void test(){
        String s="Arjit";
        s = s.concat("Kathuria");//concat() method appends the string at the end
        System.out.println(s);


    }

    public static void main(String[] args) {
        StingExample s1 = new StingExample();
        s1.test();

    }
}
