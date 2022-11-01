public class EmployeeEntity {

    int empId;

    String empName;

    String designation;

    String location;

    int salary;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = Integer.parseInt(salary);
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public EmployeeEntity(){
        
    }

    public EmployeeEntity(int empId, String empName, String designation, String location, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.location = location;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", location='" + location + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
