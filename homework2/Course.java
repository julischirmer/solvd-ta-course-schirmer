package homework2;

import java.util.LinkedList;

public class Course extends Plan {
    private String coursename;
    private LinkedList<Subject> subjects;
    private double pricepermonth;
    private int planyear;
    private String plandescription;

    public Course(String coursename, double pricepermonth) {
        this.setCoursename(coursename);
        this.setPricepermonth(pricepermonth);
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public LinkedList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(LinkedList<Subject> subjects) {
        this.subjects = subjects;
    }

    public double getPricepermonth() {
        return pricepermonth;
    }

    public void setPricepermonth(double pricepermonth) {
        this.pricepermonth = pricepermonth;
    }

    @Override
    public String toString() {
        return "\nUniversity course{" +
                "coursename='" + coursename + '\'' +
                "price per month (usd)='" + pricepermonth + '\'' +
                ", subjects=" + subjects +
                '}';
    }

    @Override
    public int getPlanyear() {
        return this.planyear;
    }

    @Override
    public String getPlandescription() {
        return this.plandescription;
    }
}
