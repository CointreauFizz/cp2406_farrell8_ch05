import java.util.Scanner;

public class Exer2_AscendingAndDescending {

    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;

        int low;
        int med;
        int high;

        Scanner input =new Scanner(System.in);
        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();
        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();
        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();

        if(num1 <= num2 && num1 <= num3)
        {
            low = num1;
            if(num2 <= num3)
            {
                med = num2;
                high = num3;
            }
            else
            {
                med = num3;
                high = num2;
            }
        }
        else
        {
            if(num2 <= num1 && num2 <= num3)
            {
                low = num2;
                if(num1 <= num3)
                {
                    med = num1;
                    high = num3;
                }
                else
                {
                    med = num3;
                    high = num1;
                }
            }
            else
            {
                low = num3;
                if(num1 <= num2)
                {
                    med = num1;
                    high = num2;
                }
                else
                {
                    med = num2;
                    high = num1;
                }
            }
        }
        System.out.println("Your integers in Ascending order: " + low + " " +
                med + " " + high);
        System.out.println("Your integers in Descending order: " + high + " " +
                med + " " + low);
    }
}