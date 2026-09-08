import java.util.*;

public class ArrayListBasics 
{
    public static void main(String[] args)
 {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Fruits in the ArrayList:");

        for (int i = 0; i < fruits.size(); i++)
        {
            System.out.println(fruits.get(i));
        }
    }
}
