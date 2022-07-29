package homework2;

import java.util.Objects;

public class Plan extends Department {
    private int idplan;
    private int yearplan;

    public Plan(int iddepartment, int idplan) {
        super(iddepartment);
        this.setIdplan(idplan);
    }

    public int getIdplan() {
        return idplan;
    }

    public void setIdplan(int idplan) {
        this.idplan = idplan;
    }


    public int getYearplan() {
        return yearplan;
    }

    public void setYearplan(int yearplan) {
        this.yearplan = yearplan;
    }

    @Override
    public String toString() {
        return "\nPlan{" +
                "idplan=" + idplan +
                ", yearplan=" + yearplan +
                ", idDepartment=" + this.getIddeparment() +
                ", DepartmentDesc=" + this.getDescdepartment() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return idplan == plan.idplan;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idplan);
    }
}
