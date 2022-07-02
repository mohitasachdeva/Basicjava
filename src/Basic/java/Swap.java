package Basic.java;

public class Swap {
    public static void main(String[]args){
        int a=7;
        int b=3;
        System.out.println("Before swap");
        System.out.println("print a==="     +a);
        System.out.println("print b==="     +b);
        a=a-b;
        b=a+b;
        a=b-a;
        System.out.println("After swap");
        System.out.println("print a==="     +a);
        System.out.println("print b==="     +b);
    }
}
