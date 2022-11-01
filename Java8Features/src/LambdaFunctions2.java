interface Interf1{

    public void m1(int a, int b);
}



public class LambdaFunctions2 {


    public static void main(String[] args) {

        System.out.println("Test Lambda");

        Interf1 s = (a,b)-> System.out.println("Sum of Number ="  + (a + b));

        s.m1(10,20);
        s.m1(1000,2000);


    }

}
