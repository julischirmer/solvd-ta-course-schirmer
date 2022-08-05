package homework2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();

    }

    public static void run() {

        LinkedList<Student> students = new LinkedList<>();

        Student student = new Student(111, "Julián", "Schirmer");
        Student student2 = new Student(112, "Carlos", "Perez");

        students.add(student);
        students.add(student2);


        Course testAutomationCourse = new Course(2424, 1000, "Test Automation");
        Course dataScienceCourse = new Course(2525, 1200, "Data Science");
        testAutomationCourse.setStudents(students);
        // dataScienceCourse.setStudents(students);

        Subject subject1testAutomation = new Subject(5454, "Java Language");
        Subject subject2testAutomation = new Subject(6464, "SQL");
        LinkedList<Subject> subjectstestAutomation = new LinkedList<>();
        subjectstestAutomation.add(subject1testAutomation);
        subjectstestAutomation.add(subject2testAutomation);


        testAutomationCourse.setSubjects(subjectstestAutomation);

        LinkedList<Course> courses = new LinkedList<>();
        courses.add(testAutomationCourse);
        courses.add(dataScienceCourse);


        menu(students, courses);

    }

    public static void menu(LinkedList<Student> students, LinkedList<Course> courses) {
        int opc = 1;
        while (opc != 5) {
            System.out.println("Chose an option: \n 1. Find student by dni \n 2. Cost of a Course \n 3.Is the course available? " +
                    "\n 4. See subjects per course \n 5. Exit");
            Scanner scanner = new Scanner(System.in);
            opc = scanner.nextInt();
            switch (opc) {
                case 1: {
                    // Find student by dni
                    Student.findStudent(students);
                    break;
                }
                case 2: {
                    // What is the cost of a course?
                    Course.getCourseCost(courses);
                    break;
                }
                case 3: {
                    //Is the course available?
                    Course.isTheCourseAvailable(courses);
                    break;

                }
                case 4: {
                    // What are the subjects in a course
                    Course.getCourseSubjects(courses);
                    break;
                }
                case 5: {
                    System.out.println("End");
                    System.out.close();
                    break;
                }
                default: {
                    System.out.println("Choose only the allowed options");
                    break;
                }
            }

        }
    }

}

