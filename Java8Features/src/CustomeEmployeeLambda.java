import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

class Employee{

    int eno;
    String ename;

    public Employee(int no, String name){
        this.eno=no;
        this.ename=name;
    }

    public Employee() {

    }

    public String toString(){
        return eno+":"+ename;
    }

}


public class CustomeEmployeeLambda {

    public static void main(String[] args) {

        ArrayList<Employee> e = new ArrayList<>();

        e.add(new Employee(1,"Sai"));
        e.add(new Employee(3,"Krishna"));
        e.add(new Employee(2,"Babnd"));
        e.add(new Employee(98,"Dad"));
        e.add(new Employee(5,"Roor"));

        System.out.println(e);

        Collections.sort(e,(E1,E2)->(E1.eno>E2.eno)?-1:(E1.eno<E2.eno)?1:0);

        System.out.println(e);

        Collections.reverse(e);
        System.out.println(e);



    }
}
