package homework2;

public class Subject extends Plan {

    private int idsubject;
    private String name;
    private String subjectdesc;
    private int week_hours;
    private int total_hours;


    public Subject(int iddepartment, int idplan, int idsubject) {
        super(iddepartment, idplan);
        this.setIdsubject(idsubject);

    }


    public int getIdsubject() {
        return idsubject;
    }

    public void setIdsubject(int idsubject) {
        this.idsubject = idsubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeek_hours() {
        return week_hours;
    }

    public void setWeek_hours(int week_hours) {
        this.week_hours = week_hours;
    }

    public int getTotal_hours() {
        return total_hours;
    }

    public void setTotal_hours(int total_hours) {
        this.total_hours = total_hours;
    }

    public String getSubjectdesc() {
        return subjectdesc;
    }

    public void setSubjectdesc(String subjectdesc) {
        this.subjectdesc = subjectdesc;
    }

    @Override
    public String toString() {
        return "\nSubject{" +
                "idsubject=" + idsubject +
                ", name='" + name + '\'' +
                ", subjectdesc='" + subjectdesc + '\'' +
                ", week_hours=" + week_hours +
                ", total_hours=" + total_hours +
                '}';
    }
}
