public class Employee{

    private String name;
    private int age;
    private double salary;

    public Employee(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;   
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void EmpInfo(){
        System.out.println("Employee Name: "+getName());
        System.out.println("Employee Age: "+getAge());
        System.out.println("Employee Salary: "+getSalary());
    }

    public double salaryHike(){
        return getSalary()*0.1;
    }
}