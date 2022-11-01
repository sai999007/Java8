import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();

        l.add(0);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        System.out.println(l);

        List<Integer> l1 = l.stream().filter(I->I%2 ==0).collect(Collectors.toList());

        List<Integer> l2 = l.stream().map(I->I*2).collect(Collectors.toList());

        System.out.println(l1);
        System.out.println(l2);

        ArrayList<String> name = new ArrayList<>();

        name.add("Sai Krishna");
        name.add("Sai");
        name.add("Krishna");
        name.add("Sai Krishna Bandaru");

        List<String> filterStream = name.stream().filter(I->I.length()>3).collect(Collectors.toList());
        System.out.println(filterStream);

        List<String> mapStream = name.stream().map(I->I.toUpperCase()).collect(Collectors.toList());
        System.out.println(mapStream);

        long count = name.stream().filter(I->I.length()>3).count();
        System.out.println(count);

        ArrayList<EmployeeEntity> testEmp = new ArrayList<EmployeeEntity>();

        EmployeeEntity tempEmp = new EmployeeEntity(1,"Test1","Manager","Hyderabad",1000);
        EmployeeEntity tempEmp1 = new EmployeeEntity(2,"Test2","Con","Bangalore",1000);
        EmployeeEntity tempEmp2= new EmployeeEntity(3,"Test3","Manager","Hyderabad",9000);
        EmployeeEntity tempEmp3 = new EmployeeEntity(4,"Test4","BTA","Chennai",2000);

        testEmp.add(tempEmp);
        testEmp.add(tempEmp1);
        testEmp.add(tempEmp2);
        testEmp.add(tempEmp3);

        List<EmployeeEntity> streamsDemoFilter = testEmp.stream().filter(I->I.getSalary()>3000).collect(Collectors.toList());

        System.out.println(streamsDemoFilter);

        List<EmployeeEntity> streamsDemoMap = testEmp.stream().map(I->{
            I.setSalary(String.valueOf(I.getSalary()));
            return I;
        }).collect(Collectors.toList());

        System.out.println(streamsDemoMap);

        ArrayList<EmployeeEntity> testEmp1 = new ArrayList<EmployeeEntity>();

        testEmp1.add(tempEmp);
        testEmp1.add(tempEmp1);
        testEmp1.add(tempEmp2);
        testEmp1.add(tempEmp3);

        ArrayList<EmployeeEntity> testEmp2 = new ArrayList<EmployeeEntity>();

        testEmp2.add(tempEmp);
        testEmp2.add(tempEmp1);
        testEmp2.add(tempEmp2);
        testEmp2.add(tempEmp3);

        ArrayList<ArrayList<EmployeeEntity>> test =new ArrayList<ArrayList<EmployeeEntity>>();

        test.add(testEmp);
        test.add(testEmp1);
        test.add(testEmp2);


        List<EmployeeEntity> tempFlatMap = test.stream().flatMap(pList->pList.stream()).collect(Collectors.toList());
        System.out.println("***********************");
        System.out.println(tempFlatMap);


    }
}
