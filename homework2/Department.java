package homework2;

public class Department {
    private int iddeparment;
    private String descdepartment; //Systems, Law, Science, etc.


    public Department(int iddeparment) {
        this.setIddeparment(iddeparment);
    }

    public int getIddeparment() {
        return iddeparment;
    }

    public void setIddeparment(int iddeparment) {
        this.iddeparment = iddeparment;
    }

    public String getDescdepartment() {
        return descdepartment;
    }

    public void setDescdepartment(String descdepartment) {
        this.descdepartment = descdepartment;
    }

    @Override
    public String toString() {
        return "\nDepartment{" +
                "iddeparment=" + iddeparment +
                ", descdepartment='" + descdepartment + '\'' +
                '}';
    }
}
