package homework2;

public class Subject {

    private int idSubject;
    private String name;
    private String subjectDesc;
    private int weekHours;
    private int totalHours;


    public Subject(int idSubject) {
        this.setIdSubject(idSubject);
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc;
    }

    public int getWeekHours() {
        return weekHours;
    }

    public void setWeekHours(int weekHours) {
        this.weekHours = weekHours;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public String toString() {
        return "\nSubject{" +
                "idsubject=" + idSubject +
                ", name='" + name + '\'' +
                ", subjectdesc='" + subjectDesc + '\'' +
                ", week_hours=" + weekHours +
                ", total_hours=" + totalHours +
                '}';
    }
}
