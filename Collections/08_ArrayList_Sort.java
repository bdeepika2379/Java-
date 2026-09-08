import java.util.*;

public class ArrayListSort
{
    public static void main(String[] args)
   {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);

        Collections.sort(numbers);

        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }
    }
}
