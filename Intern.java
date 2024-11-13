public class Intern extends Employee{

    private int Duration_of_Internship;
    
    public Intern(String name, int age, double salary, int Duration_of_Internship) {
        super(name, age, salary);
        this.Duration_of_Internship = Duration_of_Internship;
    }

    public void setDuration(int Duration_of_Internship){
        this.Duration_of_Internship = Duration_of_Internship;
    }

    public int getDuration(){
        return Duration_of_Internship;
    }

    @Override
    public double salaryHike(){
        return getSalary()*0.05;
    }

    @Override
    public void EmpInfo(){
        super.EmpInfo();
        System.out.println("Duration of Internship: "+getDuration()+" months");
    }
}
