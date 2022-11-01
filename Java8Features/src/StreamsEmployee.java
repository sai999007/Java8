import java.util.ArrayList;

public class StreamsEmployee {

    public static void main(String[] args) {
        ArrayList<EmployeeEntity> emp = new ArrayList<>();
        ArrayList<EmployeeEntity> emp1 = new ArrayList<>();
        ArrayList<EmployeeEntity> emp2= new ArrayList<>();
        ArrayList<EmployeeEntity> emp3 = new ArrayList<>();


        EmployeeEntity e = new EmployeeEntity(1,"TestName","BTA","Hyderabad",1000);
        EmployeeEntity e1 = new EmployeeEntity(1,"TestName1","BTA","Hyderabad",1000);
        EmployeeEntity e2 = new EmployeeEntity(1,"TestName2","BTA","Hyderabad",1000);
        EmployeeEntity e3 = new EmployeeEntity(1,"TestName3","BTA","Hyderabad",1000);
        EmployeeEntity e4 = new EmployeeEntity(1,"TestName4","BTA","Hyderabad",1000);
        EmployeeEntity e5 = new EmployeeEntity(1,"TestName5","BTA","Hyderabad",1000);

        emp.add(e);
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        emp.add(e5);

        EmployeeEntity testEmp1 = new EmployeeEntity(1,"TestName6","BTA","Hyderabad",1000);
        EmployeeEntity testEmp2 = new EmployeeEntity(1,"TestName7","BTA","Hyderabad",1000);
        EmployeeEntity testEmp3 = new EmployeeEntity(1,"TestName8","BTA","Hyderabad",1000);
        EmployeeEntity testEmp4 = new EmployeeEntity(1,"TestName9","BTA","Hyderabad",1000);
        EmployeeEntity testEmp5 = new EmployeeEntity(1,"TestName0","BTA","Hyderabad",1000);
        EmployeeEntity testEmp6 = new EmployeeEntity(1,"TestName11","BTA","Hyderabad",1000);

        emp1.add(testEmp1);
        emp1.add(testEmp2);
        emp1.add(testEmp3);
        emp1.add(testEmp4);
        emp1.add(testEmp5);
        emp1.add(testEmp6);

        EmployeeEntity test2Emp1 = new EmployeeEntity(1,"TestName12","BTA","Hyderabad",1000);
        EmployeeEntity test2Emp2 = new EmployeeEntity(1,"TestName13","BTA","Hyderabad",1000);
        EmployeeEntity test2Emp3 = new EmployeeEntity(1,"TestName14","BTA","Hyderabad",1000);
        EmployeeEntity test2Emp4 = new EmployeeEntity(1,"TestName15","BTA","Hyderabad",1000);
        EmployeeEntity test2Emp5 = new EmployeeEntity(1,"TestName16","BTA","Hyderabad",1000);
        EmployeeEntity test2Emp6 = new EmployeeEntity(1,"TestName17","BTA","Hyderabad",1000);

        emp2.add(test2Emp1);
        emp2.add(test2Emp2);
        emp2.add(test2Emp3);
        emp2.add(test2Emp4);
        emp2.add(test2Emp5);
        emp2.add(test2Emp6);

        EmployeeEntity test3Emp1 = new EmployeeEntity(1,"TestName18","BTA","Hyderabad",1000);
        EmployeeEntity test3Emp2 = new EmployeeEntity(1,"TestName19","BTA","Hyderabad",1000);
        EmployeeEntity test3Emp3 = new EmployeeEntity(1,"TestName20","BTA","Hyderabad",1000);
        EmployeeEntity test3Emp4 = new EmployeeEntity(1,"TestName21","BTA","Hyderabad",1000);
        EmployeeEntity test3Emp5 = new EmployeeEntity(1,"TestName22","BTA","Hyderabad",1000);
        EmployeeEntity test3Emp6 = new EmployeeEntity(1,"TestName23","BTA","Hyderabad",1000);

        emp3.add(test3Emp1);
        emp3.add(test3Emp2);
        emp3.add(test3Emp3);
        emp3.add(test3Emp4);
        emp3.add(test3Emp5);
        emp3.add(test3Emp6);


//        List<EmployeeEntity> stream1 = emp.stream().filter(I->I.)



    }




}
