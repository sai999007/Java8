import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestFunctionStreams{

public static void main(String[] Args){

       ArrayList<EmployeeEntity> e = new ArrayList<EmployeeEntity>();

       EmployeeEntity emp = new EmployeeEntity(1,"Test1","Manager","Hyderabad",1000);

       EmployeeEntity emp1 = new EmployeeEntity(2,"Test2","Manager","Hyderabad",2000);

       EmployeeEntity emp2 = new EmployeeEntity(2,"Test2","Manager","Hyderabad",2000);

        e.add(emp);
        e.add(emp1);
        e.add(emp2);

        List<EmployeeEntity> testStreams = e.stream().filter(I->I.getLocation().equalsIgnoreCase("Hyderabad")).collect(Collectors.toList());
    List<EmployeeEntity> testStreams2 = e.stream().map(I->{

        I.setSalary(String.valueOf(I.getSalary()+1000));
        return I;

    } ).collect(Collectors.toList());

        System.out.println(testStreams);

          }


        }

