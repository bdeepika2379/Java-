import java.util.Scanner;

public class DaysToYears
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int years = days / 365;
        int remainingDays = days % 365;

        System.out.println("Years = " + years);
        System.out.println("Remaining Days = " + remainingDays);

        sc.close();
    }
}
