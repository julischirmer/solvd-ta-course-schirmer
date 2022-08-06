package homework2;


import homework2.exceptions.InvalidMonthNumberException;

import java.time.LocalDate;
import java.util.Scanner;

public final class Fee extends Student {

    private int month; // 0 January - 11 December
    private boolean isPay; // True = Pay the month fee & false = don't pay the month fee
    private double costPerMonth;
    private Course course;

    public Fee(int dni, int month, boolean isPay) {
        super(dni);
        try {
            this.setMonthFee(month);
        } catch (InvalidMonthNumberException e) {
            System.out.println(e.getMessage());
        }
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

    public static Fee createFee() throws InvalidMonthNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert student dni");
        int dni = scanner.nextInt();
        System.out.println("Insert number month 0 January - 11 December");
        int month = scanner.nextInt();
        int pay = 2;
        boolean isPay = false;
        while (pay != 0 && pay != 1) {
            System.out.println("is Pay? 1: true 0: false");
            pay = scanner.nextInt();
            if (pay == 0) {
                isPay = false;
            } else if (pay == 1) {
                isPay = true;
            } else {
                System.out.println("The answer must be 0 or 1");
            }
        }
        Fee fee = new Fee(dni, month, isPay);
        System.out.println(fee);
        return fee;

    }

    public int getMonthFee() {
        return month;
    }

    public void setMonthFee(int month) throws InvalidMonthNumberException {
        if (month >= 0 && month <= 11) {
            this.month = month;
        } else {
            throw new InvalidMonthNumberException("The month must be an integer between 0 January to 11 December");
        }

    }

    public boolean isPay() {
        return isPay;
    }

    public void setPay(boolean pay) {
        isPay = pay;
    }

    @Override
    public String toString() {
        return "Fee{" +
                "dni=" + getDni() +
                ", month=" + month +
                ", isPay=" + isPay +

                '}';
    }
}
