import java.util.*;

public class HashSetSearch {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        if (numbers.contains(30)) {
            System.out.println("30 is present");
        } else {
            System.out.println("30 is not present");
        }
    }
}
