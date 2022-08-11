package homework2;

import homework2.generics.LinkedList;
import homework2.generics.LinkedList.Node;

public class Subject<T> {

    Node<T> head;
    private int idSubject;
    private String name;
    private String subjectDesc;
    private int weekHours;
    private int totalHours;
    private LinkedList<Professor> proffesors;

    public Subject(int idSubject) {
        this.setIdSubject(idSubject);
    }

    public Subject(int idSubject, String name) {
        this.setIdSubject(idSubject);
        this.setName(name);
    }

    public static void main(String[] args) {
        try {
            LinkedList<Professor> ll = new LinkedList<Professor>();
            ll.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(T val) {
        Node<T> obj = new Node<T>();
        obj.next = (head == null) ? null : head;
        obj.data = val;

        // set new head
        head = obj;
    }

    public void insert_professor_test() {
        Professor professor_test = new Professor(111, "Miguel", "Juarez", 1000);
        Professor professor_test2 = new Professor(111, "Juan", "Ramik", 1400);
        insert((T) professor_test);
        insert((T) professor_test2);
    }

    public void print_linkedlist() {
        Node<T> trav = head;
        while (trav != null) {
            System.out.println(trav.data);
            trav = trav.next;
        }

    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectDesc() {
        return subjectDesc;
    }

    public void setSubjectDesc(String subjectDesc) {
        this.subjectDesc = subjectDesc;
    }

    public int getWeekHours() {
        return weekHours;
    }

    public void setWeekHours(int weekHours) {
        this.weekHours = weekHours;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }


    @Override
    public String toString() {
        return "\nSubject{" +
                "idsubject=" + idSubject +
                ", name='" + name + '\'' +
                ", subjectdesc='" + subjectDesc + '\'' +
                ", week_hours=" + weekHours +
                ", total_hours=" + totalHours +
                '}';
    }
}
