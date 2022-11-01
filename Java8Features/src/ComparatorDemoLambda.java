import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemoLambda {

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        a.add(10);
        a.add(20);
        a.add(89);
        a.add(90);
        a.add(32);
        a.add(16);
        System.out.println(a);

        Collections.sort(a);
        System.out.println(a);

        Collections.reverse(a);
        System.out.println(a);

        Collections.sort(a, (i,j)-> (i>j)?-1:(i<j)?1:0);
        System.out.println(a);



    }
}
