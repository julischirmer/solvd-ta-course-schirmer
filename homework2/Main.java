package homework2;

import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Student st = new Student(12345, "Julian", "Lead");


        LinkedList<Student> students = new LinkedList<>();

        Student s = new Student(1234, "Julian", "Schirmer");
        Student s1 = new Student(4321, "Carlos", "Daniel");

        s.setAverageMark(9.21);
        s1.setAverageMark(8.2);

        Student sCopy = new Student(4321, "Carlos", "Daniel");

        students.add(s);
        students.push(s1);

        /*System.out.println("Use of toString");
        System.out.println(students);
        System.out.println(st);

        System.out.println("Use of equals");
        System.out.println("Constains pCopy: " + students.contains(sCopy));*/

        Department systems = new Department(1234);
        Department law = new Department(1235);

        systems.setNamedepartment("Systems");
        systems.setDescription("Syst. Department desc.");

        law.setNamedepartment("Law");
        law.setDescription("Law Department desc.");

        LinkedList<Subject> subjectsse = new LinkedList<>();
        LinkedList<Subject> subjectslawyer = new LinkedList<>();

        Subject sub1se = new Subject(1234, "Data Science", "Cleaning, Modeling and ...",
                "two times per week", "Third year");
        Subject sub2se = new Subject(1234, "QA Testing", "Manual Testing, Automation, ...",
                "three times per week", "Second Year");

        Subject sub1law = new Subject(1235, "Constitutional Law", "Law in the constitution...",
                "two times per week", "Second Year");
        Subject sub2law = new Subject(1235, "Criminal Law", "Law in the crime...",
                "three times per week", "First year");

        subjectsse.add(sub1se);
        subjectsse.add(sub2se);
        subjectslawyer.add(sub1law);
        subjectslawyer.add(sub2law);

        Course soft_eng = new Course(2020, "Software Engineering", 800);
        Course lawyer = new Course(2021, "Lawyer", 750);
        soft_eng.setSubjects(subjectsse);
        lawyer.setSubjects(subjectslawyer);
        System.out.println(soft_eng);
        System.out.println(lawyer);

        LinkedList<Professor> proffesorsDataScience = new LinkedList<>();

        Professor profds = new Professor(17171717, "Miguel", "Juarez", 1000);

        proffesorsDataScience.add(profds);


        Exam exam = new Exam(1234, "Data Science", "Cleaning, Modeling and ...",
                "two times per week", "Systems", "Third year",
                LocalDate.of(2022, 9, 27), 1234, proffesorsDataScience);

        System.out.println(exam);

        System.out.println("---Universities---");

        LinkedList<Course> harvardcourses = new LinkedList<>();
        harvardcourses.add(soft_eng);
        harvardcourses.add(lawyer);

        LinkedList<Course> michigancourses = new LinkedList<>();
        michigancourses.add(lawyer);

        University uni = new University("Harvard", "Cambridge",
                "Harvard College 86 Brattle", harvardcourses);
        University uni1 = new University("University of Michigan", "Michigan",
                "500 S State St, Ann Arbor, MI 48109", michigancourses);

        LinkedList<University> universities = new LinkedList<>();
        universities.add(uni);
        universities.add(uni1);

        System.out.println(universities);


    }
}
