import java.util.*;

public class HashSetClear {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before clearing: " + numbers);

        numbers.clear();

        System.out.println("After clearing: " + numbers);
    }
}
