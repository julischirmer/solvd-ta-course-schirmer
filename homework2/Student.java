package homework2;

import java.util.Objects;

public class Student extends Person {

    private double averagemark;

    public Student(int dni, String name, String lastname) {
        this.setDni(dni);
        this.setName(name);
        this.setLastname(lastname);
    }


    public double getAverageMark() {
        return averagemark;
    }

    public void setAverageMark(double averageMark) {
        this.averagemark = averageMark;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "dni=" + getDni() +
                ", name='" + getName() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                "averagemark=" + averagemark +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        if (getDni() != person.getDni()) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
        return Objects.hash(getDni());
    }


}
