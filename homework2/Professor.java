package homework2;

public class Professor extends Person {
    private double salary;


    public Professor(int dni, String name, String lastname, double salary) {
        this.setDni(dni);
        this.setName(name);
        this.setLastname(lastname);
        this.setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "\nProfessor{" +
                "dni=" + this.getDni() +
                ", name=" + this.getName() +
                ", last name=" + this.getLastname() +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void abstractMethod() {
        System.out.println("This is an abstract method of Professor");
    }
}
