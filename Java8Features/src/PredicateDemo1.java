import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo1 {

    public static void main(String[] args) {
        String[] s = {"A", "", null, "K"};

        Predicate<String> p = t->  t != null && t.length() !=0;

        ArrayList<String> x = new ArrayList<>();

        for (String k: s) {

            if(p.test(k)){
                x.add(k);
            }
        }

        System.out.println(x);
    }
}
