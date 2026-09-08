import java.util.*;

public class HashSetAdd {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Before adding: " + numbers);

        numbers.add(40);
        numbers.add(50);

        System.out.println("After adding: " + numbers);
    }
}
