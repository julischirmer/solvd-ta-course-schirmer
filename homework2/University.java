package homework2;

import java.util.LinkedList;

public class University {
    private String universityname;
    private String city;
    private String address;
    private LinkedList<Course> courses = new LinkedList<>();

    public University(String name, String city, String address, LinkedList<Course> courses) {
        this.setUniversityname(name);
        this.setCity(city);
        this.setAddress(address);
        this.setCourses(courses);
    }

    public String getUniversityname() {
        return universityname;
    }

    public void setUniversityname(String universityname) {
        this.universityname = universityname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
                "universityname='" + universityname + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", courses=" + courses +
                '}';
    }
}
