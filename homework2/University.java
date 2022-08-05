package homework2;

import java.util.LinkedList;

public class University {
    private String name;
    private String location;

    private LinkedList<Course> courses = new LinkedList<>();

    public University(String name, LinkedList<Course> courses) {
        this.setName(name);
        this.setCourses(courses);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LinkedList<Course> getCourses() {
        return courses;
    }

    public void setCourses(LinkedList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "\nUniversity{" +
                "universityname='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
