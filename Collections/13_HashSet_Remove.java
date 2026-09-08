import java.util.*;

public class HashSetRemove {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before removing: " + numbers);

        numbers.remove(30);

        System.out.println("After removing: " + numbers);
    }
}
