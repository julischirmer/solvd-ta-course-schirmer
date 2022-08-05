package homework2;


import java.time.LocalDate;

public final class Fee extends Student {

    private int month; // 0 January - 11 December
    private boolean isPay; // True = Pay the month fee & false = don't pay the month fee
    private double costPerMonth;
    private Course course;

    public Fee(int dni, int month, boolean isPay, double amountpay) {
        super(dni);
        this.setMonthFee(month);
        this.setPay(isPay);
    }

    public static void isUpToday(Student student, Fee fee) {
        int monthNow = LocalDate.now().getMonthValue();
        if (fee.getMonthFee() == monthNow && fee.isPay == true) {
            System.out.println("The student: " + student.getName() + " is up to date with the fee");
        } else {
            System.out.println("The student: " + student.getName() + " is not up to date with the fee");
        }
    }

    public int getMonthFee() {
        return month;
    }

    public void setMonthFee(int month) {
        this.month = month;
    }

    public boolean isPay() {
        return isPay;
    }

    public void setPay(boolean pay) {
        isPay = pay;
    }


}
