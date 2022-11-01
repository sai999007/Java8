import java.util.function.Predicate;

public class PredicateFunctionDemo {

    public static void main(String[] args) {
        int[] x = {0,5,10,15,20,25,30};

        Predicate<Integer> p1 = I->I>10;
        Predicate<Integer> p2 = I->I%2==0;

        System.out.println("The Numbers Greater than 10 are");
        m1(p1,x);
        System.out.println("The Numbers Less than 10 are");
        m1(p1.negate(),x);
        System.out.println("The Numbers Greater than 10 and Even numbers");
        m1(p1.and(p2),x);
        System.out.println("The Numbers Greater than 10 or Even numbers");
        m1(p1.or(p2),x);
        System.out.println("The Numbers less than 10  and Even numbers");
        m1(p1.negate().and(p2),x);
        System.out.println("The Numbers less than 10  or Even numbers");
        m1(p1.negate().or(p2),x);


    }

    public static void m1(Predicate<Integer> p, int[] x) {

        for (int x1:x) {

            if(p.test(x1)){
                System.out.println(x1);
            }

        }

    }

}
