import java.util.*;

public class ArrayListAccess
{
    public static void main(String[] args)
  {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));
        System.out.println("Third fruit: " + fruits.get(2));
        System.out.println("Fourth fruit: " + fruits.get(3));
    }
}
