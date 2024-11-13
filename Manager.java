public class Manager extends Employee{

    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department=department;
    }
    
    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }

    @Override
    public double salaryHike(){
        return getSalary()*0.15;
    }

    @Override
    public void EmpInfo(){
        super.EmpInfo();
        System.out.println("Department: "+getDepartment());
    }
}
