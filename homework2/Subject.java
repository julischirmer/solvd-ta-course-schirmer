package homework2;

public class Subject extends Department {
    private String name;
    private String year;
    private String time;
    private String description;

    public Subject(int deparmentnum, String name, String description, String time, String year) {
        super(deparmentnum);
        this.setName(name);
        this.setDescription(description);
        this.setTime(time);
        this.setYear(year);
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
                ", description='" + description + '\'' +
                '}';
    }
}
