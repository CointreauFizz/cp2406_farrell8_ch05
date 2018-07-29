import javax.swing.*;

public class Exer6 {
    public static void main(String[] args) {
        String entry, message;
        int level;
        double hoursWorked;
        double regularPay, overtimePay, totalPay;
        double payRate;
        double medical = 0, dental = 0,
                disability = 0, retirement = 0, totalDeductions;
        int medOption, dentOption,
                disOption, retOption;
        final double PAY1 = 17.00;
        final double PAY2 = 20.00;
        final double PAY3 = 22.00;
        final int FULL_WEEK = 40;
        final double OT_RATE = 1.5;
        final double MEDICAL_INS = 32.50;
        final double DENTAL_INS = 20.00;
        final double LTD_INS = 10.00;
        final double RET_RATE = 0.03;
        entry = JOptionPane.showInputDialog(null,
                "Enter skill level - 1, 2, or 3");
        level = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null,
                "Enter hours worked");
        hoursWorked = Double.parseDouble(entry);
        if(level == 1)
            payRate = PAY1;
        else
        if(level == 2)
            payRate = PAY2;
        else
            payRate = PAY3;
        if(hoursWorked > FULL_WEEK)
        {
            regularPay = FULL_WEEK * payRate;
            overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * payRate;
        }
        else
        {
            regularPay = hoursWorked * payRate;
            overtimePay = 0.0;
        }
        totalPay = regularPay + overtimePay;
        if(level == 2 || level == 3)
        {
            entry = JOptionPane.showInputDialog(null,
                    "Do you want medical insurance?\n" + "   Enter 1 for Yes and 2 for No.");
            medOption = Integer.parseInt(entry);
            if(medOption == 1)
                medical = MEDICAL_INS;
            entry = JOptionPane.showInputDialog(null,
                    "Do you want dental insurance?\n" + "   Enter 1 for Yes and 2 for No.");
            dentOption = Integer.parseInt(entry);
            if(dentOption == 1)
                dental = DENTAL_INS;
            entry = JOptionPane.showInputDialog(null,
                    "Do you want the long term disability insurance?\n" + "   Enter 1 for Yes and 2 for No.");
            disOption = Integer.parseInt(entry);
            if(disOption == 1)
                disability = LTD_INS;

            if(level == 3)
            {
                entry = JOptionPane.showInputDialog(null,
                        "Do you want the retirement plan?\n" + "   Enter 1 for Yes and 2 for No.");
                retOption = Integer.parseInt(entry);
                if(retOption == 1)
                    retirement = totalPay * RET_RATE;
            }
        }
        totalDeductions = medical + dental + disability + retirement;

        message =
                "\nHours worked is    " + hoursWorked +
                        "\nHourly pay rate is " + payRate +
                        "\nRegular pay is     " + regularPay +
                        "\nOvertime pay is    " + overtimePay +
                        "\nTotal pay is.................." + totalPay +
                        "\nDeductions" +
                        "\n      Medical     " + medical +
                        "\n      Dental      " + dental +
                        "\n      Disability  " + disability +
                        "\n      Retirement  " + retirement +
                        "\nTotal deductions.............." + totalDeductions;
        if (totalDeductions > totalPay)
            message = message + "\nDeductions exceed goss pay";
        else
            message = message + "\nNet pay is...................." +
                    (totalPay - totalDeductions);
        JOptionPane.showMessageDialog(null, message);
    }
}