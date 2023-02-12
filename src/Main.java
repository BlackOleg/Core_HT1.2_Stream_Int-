import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(List.of(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        intList.removeIf(x -> x < 1);
        intList.removeIf(x -> x % 2 != 0);
        intList.sort(Comparator.naturalOrder());
        for (Integer i : intList) {
            System.out.print(i);
        }
    }
}