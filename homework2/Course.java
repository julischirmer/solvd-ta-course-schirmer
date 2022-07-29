package homework2;

public class Course extends Plan {
    private int idcourse;
    private int idsubject;
    private int year;
    private int availability;


    public Course(int iddepartment, int idplan, int idcourse) {
        super(iddepartment, idplan);
        this.setIdcourse(idcourse);
    }

    public int getIdcourse() {
        return idcourse;
    }

    public void setIdcourse(int idcourse) {
        this.idcourse = idcourse;
    }

    public int getIdsubject() {
        return idsubject;
    }

    public void setIdsubject(int idsubject) {
        this.idsubject = idsubject;
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
                ", idsubject=" + idsubject +
                ", year=" + year +
                ", availability=" + availability +
                '}';
    }
}
