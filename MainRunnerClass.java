public class MainRunnerClass {
    
    public static void main(String[] args) {

        Employee e=new Employee("John", 23, 28000);
        Manager m=new Manager("James", 28, 50000, "IT");
        Intern i=new Intern("Gosling", 21, 18000, 3);

        System.out.println("---Employee Details---");
        e.EmpInfo();
        System.out.println("Hike in Salary per Year: "+e.salaryHike());
        System.out.println("----------");
        System.out.println("---Manager Details---");
        m.EmpInfo();
        System.out.println("Hike in Salary per Year: "+m.salaryHike());
        System.out.println("----------");
        System.out.println("---Intern Details---");
        i.EmpInfo();
        System.out.println("Hike in Salary per Year: "+i.salaryHike());
        System.out.println("----------");
    }
}
