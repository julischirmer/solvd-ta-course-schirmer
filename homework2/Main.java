package homework2;

import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Creating Students
        LinkedList<Student> students = new LinkedList<>();

        Student s = new Student(1234, "Julian", "Schirmer");
        Student s1 = new Student(4321, "Carlos", "Daniel");

        s.setAverageMark(9.21);
        s1.setAverageMark(8.2);

        Student sCopy = new Student(4321, "Carlos", "Daniel");

        students.add(s);
        students.push(s1);


        System.out.println(students);

        // Creating departments

        Department systems = new Department(1111);
        Department law = new Department(1112);
        Department chemistry = new Department(1113);

        systems.setDescdepartment("Systems");

        law.setDescdepartment("Law");

        chemistry.setDescdepartment("Chemistry");

        Department[] departments = new Department[5];
        departments[0] = systems;
        departments[1] = law;
        departments[2] = chemistry;

        System.out.println(departments);

        // Creating plans
        LinkedList<Plan> plans = new LinkedList<>();
        Plan plansys1 = new Plan(1111, 1);
        plansys1.setYearplan(2008);
        plansys1.setDescdepartment("Systems");


        Plan plansys2 = new Plan(1111, 2);
        plansys2.setYearplan(2022);
        plansys2.setDescdepartment("Systems");

        Plan planlaw1 = new Plan(1112, 3);
        planlaw1.setYearplan(2010);
        planlaw1.setDescdepartment("Law");

        Plan planlaw2 = new Plan(1112, 4);
        planlaw2.setYearplan(2021);
        planlaw2.setDescdepartment("Law");

        Plan planchemistry1 = new Plan(1113, 5);
        planchemistry1.setYearplan(2022);
        planchemistry1.setDescdepartment("Chemistry");

        plans.add(plansys1);
        plans.add(plansys2);
        plans.add(planlaw1);
        plans.add(planlaw2);
        plans.add(planchemistry1);

        System.out.println(plans);

        // Creating subjects per plan and department

        LinkedList<Subject> subjectsSys = new LinkedList<>();
        LinkedList<Subject> subjectslawyer = new LinkedList<>();

        Subject sub1sys = new Subject(1111, 2, 1234);
        sub1sys.setName("Data Science");
        sub1sys.setSubjectdesc("Cleaning, Modeling and ...");
        sub1sys.setWeek_hours(8);
        sub1sys.setTotal_hours(160);

        Subject sub2sys = new Subject(1111, 2, 1235);
        sub2sys.setName("QA Testing");
        sub2sys.setSubjectdesc("Manual Testing, Automation, ...");
        sub2sys.setWeek_hours(4);
        sub2sys.setTotal_hours(140);

        subjectsSys.add(sub1sys);
        subjectsSys.add(sub2sys);


        Subject sub1law = new Subject(1112, 4, 1212);
        sub1law.setName("Constitutional Law");
        sub1law.setSubjectdesc("Law in the constitution...");
        sub1law.setWeek_hours(8);
        sub1law.setTotal_hours(160);

        Subject sub2law = new Subject(1112, 4, 1213);
        sub2law.setName("Criminal Law");
        sub2law.setSubjectdesc("Law in the crime...");
        sub2law.setWeek_hours(8);
        sub2law.setTotal_hours(160);

        subjectslawyer.add(sub1law);
        subjectslawyer.add(sub2law);

        System.out.println("Printing Systems Subjects: " + subjectsSys);
        System.out.println("Printing Lawyer Subjects: " + subjectslawyer);


        // Creating courses

        LinkedList<Course> coursessys = new LinkedList<>();
        LinkedList<Course> courseslaw = new LinkedList<>();

        Course course1sys = new Course(1111, 2, 800, sub1sys);
        course1sys.setAvailability(122); // amount of quota

        Course course2sys = new Course(1111, 2, 801, sub1sys);
        course2sys.setAvailability(90); // amount of quota

        Course course1law = new Course(1112, 4, 223, sub1law);
        course1law.setAvailability(32); // amount of quota

        Course course2law = new Course(1112, 4, 224, sub2law);
        course2law.setAvailability(66); // amount of quota


        coursessys.add(course1sys);
        coursessys.add(course2sys);
        courseslaw.add(course1law);
        courseslaw.add(course1law);

        System.out.println(coursessys);
        System.out.println(courseslaw);


        // Creating professors
        LinkedList<Professor> proffesorsDataScience = new LinkedList<>();
        LinkedList<Professor> proffesorsConstitucionalLaw = new LinkedList<>();

        Professor profds1 = new Professor(17171717, "Miguel", "Juarez", 1000);
        Professor profds2 = new Professor(15151515, "Juan", "Miguel", 990);

        Professor profcl1 = new Professor(12121212, "Jose", "Enrique", 1200);
        Professor profcl2 = new Professor(11111111, "Pedro", "Manzur", 1150);

        proffesorsDataScience.add(profds1);
        proffesorsDataScience.add(profds2);

        proffesorsConstitucionalLaw.add(profcl1);
        proffesorsConstitucionalLaw.add(profcl2);

        System.out.println(proffesorsDataScience);
        System.out.println(proffesorsConstitucionalLaw);


        // Creatin exam
        Exam examDataScience = new Exam(1111, 2, 1234,
                LocalDate.of(2022, 9, 27), 1999, proffesorsDataScience);

        System.out.println(examDataScience);

        System.out.println("---Universities---");

        LinkedList<Course> harvardcourses = new LinkedList<>();
        harvardcourses.addAll(coursessys);
        harvardcourses.addAll(courseslaw);

        LinkedList<Course> michigancourses = new LinkedList<>();
        michigancourses.addAll(courseslaw);

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
