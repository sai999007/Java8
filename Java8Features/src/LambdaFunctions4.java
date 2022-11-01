interface Interf4{

    public int m1(int a);
}



public class LambdaFunctions4 {


    public static void main(String[] args) {

        System.out.println("Test Lambda");

        Interf4 s = a-> a*a;

        System.out.println("Square root of number = " + s.m1(231) );
        System.out.println("Square root of number = " + s.m1(10) );





    }

}
