package homework2;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Course {
    private static final int total = 150;
    private int idCourse;
    private String name;
    private LinkedList<Subject> subjects = new LinkedList<>();
    private LinkedList<Student> students = new LinkedList<>();
    private double cost;


    public Course(int idcourse, double price, String name) {
        this.setIdCourse(idcourse);
        this.setName(name);
        this.setCost(price);
    }

    public Course() {

    }

    public Course(int idCourse) {
        this.setIdCourse(idCourse);
    }

    public static void isTheCourseAvailable(LinkedList<Course> courses) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert course ID");
        Course courseToFind = new Course(scanner.nextInt());
        if (courses.contains(courseToFind)) {
            if (courseToFind.getAvailability() > 0) {
                System.out.println("The Course is available");
                System.out.println("The course quota is: " + courseToFind.getAvailability());
            } else {
                System.out.println("The Course is completed");
            }
        } else {
            System.out.println("The id Course doesn't exist");
        }
    }

    public static void getCourseCost(LinkedList<Course> courses) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert course ID");
        Course course = new Course(scanner.nextInt());
        if (courses.contains(course)) {
            Course coursefind = courses.get(courses.indexOf(course));
            System.out.println("The course: " + coursefind.getName() + " has the cost: u$d " + coursefind.getCost());
        } else {
            System.out.println("The course doesn't exist");
        }
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idcourse) {
        this.idCourse = idcourse;
    }

    public LinkedList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(LinkedList<Subject> subjects) {
        this.subjects = subjects;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAvailability() {
        return (this.total - students.size());
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCourse=" + idCourse +
                ", total=" + total +
                ", price=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return idCourse == course.idCourse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCourse);
    }


}
