class Employee {

    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
public class Employeex{
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setSalary(50000);
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
