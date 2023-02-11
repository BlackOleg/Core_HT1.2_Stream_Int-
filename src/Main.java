import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        //TreeSet<Integer> intList = new TreeSet<Integer> (1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        intList.removeIf(x -> x < 0);
        intList.removeIf(x -> x % 2 != 0);
        intList.sort(Comparator.naturalOrder());
        System.out.println(intList);
        //for (Integer integer : intList) {
        //    System.out.print(integer);
        //}

    }
}