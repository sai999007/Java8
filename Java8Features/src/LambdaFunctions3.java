interface Interf3{

    public int m1(String a);
}



public class LambdaFunctions3 {


    public static void main(String[] args) {

        System.out.println("Test Lambda");

        Interf3 s = a-> a.length();

        int b = s.m1("This is test");
        int c = s.m1("This is second Test");

        System.out.println("Sum Of the String Lengths = " + (b+c) );





    }

}
