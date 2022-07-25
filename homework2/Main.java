package homework2;

import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student st = new Student(12345, "Julian", "Lead", 9.20);


        LinkedList<Student> students = new LinkedList<>();

        Student s = new Student(1234, "Julian", "Schirmer", 8.50);
        Student s1 = new Student(4321, "Carlos", "Daniel", 6.7);

        Student sCopy = new Student(4321, "Carlos", "Daniel", 6.7);

        students.add(s);
        students.push(s1);

        /*System.out.println("Use of toString");
        System.out.println(students);
        System.out.println(st);

        System.out.println("Use of equals");
        System.out.println("Constains pCopy: " + students.contains(sCopy));*/

        LinkedList<Subject> subjectsse = new LinkedList<>();
        LinkedList<Subject> subjectslawyer = new LinkedList<>();

        Subject sub1se = new Subject("Data Science", "Cleaning, Modeling and ...",
                "two times per week", "Systems", "Third year");
        Subject sub2se = new Subject("QA Testing", "Manual Testing, Automation, ...",
                "three times per week", "Systems", "Second Year");

        Subject sub1law = new Subject("Constitutional Law", "Law in the constitution...",
                "two times per week", "Law", "Second Year");
        Subject sub2law = new Subject("Criminal Law", "Law in the crime...",
                "three times per week", "Law", "First year");

        subjectsse.add(sub1se);
        subjectsse.add(sub2se);
        subjectslawyer.add(sub1law);
        subjectslawyer.add(sub2law);

        Course soft_eng = new Course("Software Engineering", 800, subjectsse);
        Course lawyer = new Course("Lawyer", 750, subjectslawyer);
        System.out.println(soft_eng);
        System.out.println(lawyer);

        LinkedList<Professor> proffesorsDataScience = new LinkedList<>();

        Professor profds = new Professor(17171717, "Miguel", "Juarez", 1000);

        proffesorsDataScience.add(profds);


        Exam exam = new Exam("Data Science", "Cleaning, Modeling and ...",
                "two times per week", "Systems", "Third year",
                LocalDate.of(2022, 9, 27), 999, proffesorsDataScience);

        System.out.println(exam);


    }
}
