import java.util.*;

public class ArrayListMinMax
{
    public static void main(String[] args)
   {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
