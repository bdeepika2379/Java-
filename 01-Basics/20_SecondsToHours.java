import java.util.Scanner;

public class SecondsToHours 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();

        int hours = seconds / 3600;
        int remainingSeconds = seconds % 3600;

        int minutes = remainingSeconds / 60;
        int finalSeconds = remainingSeconds % 60;

        System.out.println("Hours = " + hours);
        System.out.println("Minutes = " + minutes);
        System.out.println("Seconds = " + finalSeconds);

        sc.close();
    }
}
