import java.util.*;
import java.time.LocalDate;

public class Exer5_PastPresentFuture {

        public static void main (String[] args)
        {
            LocalDate today = LocalDate.now();
            int mo, yr;
            int this_year, this_month;
            Scanner input = new Scanner(System.in);
            this_month = today.getMonthValue();
            this_year = today.getYear();

            System.out.print("Enter month: ");
            mo = input.nextInt();
            System.out.print("Enter day: ");
            System.out.print("Enter year: ");
            yr = input.nextInt();

     if(yr != this_year)
             System.out.println(yr + " is not this year");
             else
             if(mo < this_month)
        System.out.println(mo + " was a month earlier this year");
        else
        if(mo > this_month)
        System.out.println(mo + " is a month later this year");
        else
        System.out.println(mo + " is this month");
             }
        }