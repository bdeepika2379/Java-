import java.util.*;

public class ArrayListIteration
{
    public static void main(String[] args) 
    {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        for (int i = 0; i < fruits.size(); i++)
        {
            System.out.println("Index " + i + ": " + fruits.get(i));
        }
     }
}
