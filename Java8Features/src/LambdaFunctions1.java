interface Interf{

    public void m1();
}



public class LambdaFunctions1 {


    public static void main(String[] args) {

        System.out.println("Test Lambda");

        Interf s = ( )-> System.out.println("My First Lambda Expression");

        s.m1();


    }

}
