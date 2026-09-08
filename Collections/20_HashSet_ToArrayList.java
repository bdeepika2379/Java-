import java.util.*;

public class HashSetToArrayList {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list = new ArrayList<>(numbers);

        System.out.println("HashSet: " + numbers);
        System.out.println("ArrayList: " + list);
    }
}
