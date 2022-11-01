import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class ComparatorLambdaTreeSet {

    public static void main(String[] args) {
        TreeSet<Integer> a = new TreeSet<>();

        TreeSet<Integer> b = new TreeSet<>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);

        a.add(10);
        a.add(20);
        a.add(89);
        a.add(90);
        a.add(32);
        a.add(16);
        System.out.println(a);

        b.add(10);
        b.add(20);
        b.add(89);
        b.add(90);
        b.add(32);
        b.add(16);

        System.out.println(b);

    }
}
