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

        LinkedList<Course> courses = new LinkedList<>();
        courses.add(testAutomationCourse);
        courses.add(dataScienceCourse);

        // Is the student up to date with the monthly fee?
        Fee studentFee7 = new Fee(111, 7, true, 1000);
        /* Fee studentFee1 = new Fee(111, 1, true, 1000);
        Fee studentFee2 = new Fee(111, 2, true, 1000);
        Fee studentFee3 = new Fee(111, 3, true, 1000);
        Fee studentFee4 = new Fee(111, 4, true, 1000);
        Fee studentFee5 = new Fee(111, 5, true, 1000);
        Fee studentFee6 = new Fee(111, 6, true, 1000);
        Fee studentFee7 = new Fee(111, 7, false, 1000);
        LinkedList<Fee> julianfee = new LinkedList<>();
        julianfee.add(studentFee0);
        julianfee.add(studentFee1);
        julianfee.add(studentFee7);*/
        Fee.isUpToday(student, studentFee7);


        System.out.println("Chose an option: \n 1. Find student by dni \n 2. Cost of a Course \n 3.Is the course available? \n 4. Exit");
        Scanner scanner = new Scanner(System.in);

        switch (scanner.nextInt()) {
            case 1: {
                // Find student by dni
                Student.findStudent(students);
            }
            case 2: {
                // What is the cost of a course?
                Course.getCourseCost(courses);

            }
            case 3: {
                //Is the course available?
                Course.isTheCourseAvailable(courses);

            }
            case 4: {
                System.out.println("End");
                System.out.close();
            }


        }
    }

}

