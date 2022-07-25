package homework2;

public class Subject {
    private String name;
    private String year;
    private String time;
    private String department;
    private String description;

    public Subject(String name, String description, String time, String department, String year) {
        this.setName(name);
        this.setDescription(description);
        this.setTime(time);
        this.setYear(year);
        this.setDepartment(department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nSubject{" +
                "name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", time='" + time + '\'' +
                ", department='" + department + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
