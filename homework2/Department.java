package homework2;

public class Department {

    private String namedepartment; //Systems, Law, Science, etc.
    private int deparmentnum;
    private String description;


    public Department(int deparmentnum) {
        this.setDeparmentnum(deparmentnum);
    }

    public String getNamedepartment() {
        return namedepartment;
    }

    public void setNamedepartment(String namedepartment) {
        this.namedepartment = namedepartment;
    }

    public int getDeparmentnum() {
        return deparmentnum;
    }

    public void setDeparmentnum(int deparmentnum) {
        this.deparmentnum = deparmentnum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
