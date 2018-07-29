import javax.swing.*;

public class Exer4_CellphoneService {

    public static void main (String args[])
    {
        int talk;
        int texts;
        int data;
        final int TALK_MIN = 500;
        final int TEXTS_MIN = 100;
        final int DATA_MIN = 2;
        final int PRICE_A = 49;
        final int PRICE_B = 55;
        final int PRICE_C = 61;
        final int PRICE_D = 70;
        final int PRICE_E = 79;
        final int PRICE_F = 87;
        String entry, message;
        int price;
        String plan;
        entry = JOptionPane.showInputDialog(null,
                "Enter talk minutes needed");
        talk = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null,
                "Enter text messages needed");
        texts = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null,
                "Enter GB of data needed");
        data = Integer.parseInt(entry);
        if(data > 0)
            if(data <= DATA_MIN)
            {
                plan = "E";
                price = PRICE_E;
            }
            else
            {
                plan = "F";
                price = PRICE_F;
            }
        else
        if(talk < TALK_MIN)
            if(texts == 0 && data == 0)
            {
                plan = "A";
                price = PRICE_A;
            }
            else
            {
                plan = "B";
                price = PRICE_B;
            }
        else
        if(texts < TEXTS_MIN)
        {
            plan = "C";
            price = PRICE_C;
        }
        else
        {
            plan = "D";
            price = PRICE_D ;
        }
        message = "Plan " + plan + "  $" + price + " per month";
        JOptionPane.showMessageDialog(null, message);
    }
}