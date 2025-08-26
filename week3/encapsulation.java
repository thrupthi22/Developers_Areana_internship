public class Employee {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("John");
        e.setSalary(50000);
        System.out.println(e.getName() + " earns $" + e.getSalary());
    }
}
