import java.util.*;

public class ArrayListSearch 
{
    public static void main(String[] args)
 {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        if (fruits.contains("Mango")) 
        {
            System.out.println("Mango is present");
        }
        else 
        {
            System.out.println("Mango is not present");
        }
  }
}
