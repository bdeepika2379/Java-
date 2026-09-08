import java.util.*;

public class ArrayListUpdate
{
    public static void main(String[] args)
 {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        fruits.set(1, "Grapes");

        for (int i = 0; i < fruits.size(); i++)
  {
            System.out.println(fruits.get(i));
        }
    }
}
