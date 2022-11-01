import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<String, Integer> s = i->i.length();

        Function<Integer, Integer> k = i->i*i;

        Function<String, String> noSpaces = i->i.replaceAll(" ", "");

        System.out.println(s.apply("Sai"));
        System.out.println(s.apply("Krishna"));

        System.out.println(k.apply(25));
        System.out.println(k.apply(20));

        String test = "This is a test ";

        System.out.println(noSpaces.apply(test));

        Function<String, String> upper = i->i.toUpperCase();
        Function<String, String> o = i->i.substring(0,9);

        System.out.println(upper.apply("saikrishnabandaru"));
        System.out.println(o.apply("saikrishnabandaru"));

        System.out.println(upper.andThen(o).apply("saikrishnabandaru"));
        System.out.println(upper.compose(o).apply("saikrishnabandaru"));




    }

}
