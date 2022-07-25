package homework2;


public class Fee extends Student {

    private int month; // 01 January - 12 December
    private boolean isPay; // True = Pay the month fee & false = don't pay the month fee
    private double amountpay;

    public Fee(int dni, String name, String lastname, int month, boolean isPay, double amountpay) {
        super(dni, name, lastname);
        this.setMonth(month);
        this.setPay(isPay);
        this.setAmountpay(amountpay);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public boolean isPay() {
        return isPay;
    }

    public void setPay(boolean pay) {
        isPay = pay;
    }

    public double getAmountpay() {
        return amountpay;
    }

    public void setAmountpay(double amountpay) {
        this.amountpay = amountpay;
    }


}
