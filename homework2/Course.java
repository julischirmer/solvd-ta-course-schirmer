package homework2;

public class Course extends Plan {
    private int idcourse;
    private Subject subject;
    private int year;
    private int availability;


    public Course(int iddepartment, int idplan, int idcourse, Subject subject) {
        super(iddepartment, idplan);
        this.setIdcourse(idcourse);
        this.setSubject(subject);
    }

    public int getIdcourse() {
        return idcourse;
    }

    public void setIdcourse(int idcourse) {
        this.idcourse = idcourse;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }


    @Override
    public String toString() {
        return "\nCourse{" +
                "idcourse=" + idcourse +
                ", year=" + year +
                ", availability=" + availability +
                ", subject=" + this.getSubject() +
                '}';
    }
}
