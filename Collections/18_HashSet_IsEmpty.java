import java.util.*;

public class HashSetIsEmpty {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        System.out.println("Is HashSet empty? " + numbers.isEmpty());

        numbers.add(10);
        numbers.add(20);

        System.out.println("Is HashSet empty? " + numbers.isEmpty());
    }
}
