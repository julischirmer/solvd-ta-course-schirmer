package homework2;

import java.util.Objects;

public abstract class Person {

    private int dni;
    private String name;
    private String lastname;


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public abstract void abstractMethod();

    @Override
    public String toString() {
        return "\nPerson{" +
                "dni=" + dni +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person person = (Person) obj;
        if (dni != person.dni) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
