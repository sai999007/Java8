import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo2 {

    public static void main(String[] args) {

        ArrayList<EmployeeEntity> s = new ArrayList<EmployeeEntity>();

        populateList(s);

        Predicate<EmployeeEntity> p = k->k.location.equalsIgnoreCase("Hyderabad");

        Predicate<EmployeeEntity> t = k->k.location.equalsIgnoreCase("Hyderabad") && k.designation.equalsIgnoreCase("Manager");

        for (EmployeeEntity e: s) {
            if(p.test(e)){
                System.out.println(e);
            }
        }

        System.out.println("******************************************");

        for (EmployeeEntity e: s) {
            if(t.test(e)){
                System.out.println(e);
            }
        }


    }

    private static void populateList(ArrayList<EmployeeEntity> s) {

        s.add(new EmployeeEntity(1,"Sai","Manager","Hyderabad",10000));
        s.add(new EmployeeEntity(2,"Sai1","Consultant","Hyderabad",50000));
        s.add(new EmployeeEntity(3,"Sai2","Manager","Blore",10000));
        s.add(new EmployeeEntity(4,"Sai3","Consultant","Hyderabad",10000));
        s.add(new EmployeeEntity(5,"Sai4","Manager","Mumbai",100000));

    }

}
