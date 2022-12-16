import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    // count the number of even integers
    public static <T> int count(Collection<T> collection, Predicate<T> predicate) {
        int res = 0;
        for (T obj : collection) {
            if (predicate.predict(obj)) {
                res++;
            }
        }
        return res;
    }

    // exchange the positions of two different elements
    public static <T> void Swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // find the maximal element in the range [begin, end) of a list
    public static <T extends Comparable> T maxElement(List<T> list, int begin, int end) {
        T maxElement = list.get(begin);

        for (++begin; begin < end; ++begin) {
            if (maxElement.compareTo(list.get(begin)) < 0) {
                maxElement = list.get(begin);
            }
        }

        return maxElement;
    }

    // test
    public static void main(String[] args) {
        Collection<Integer> integers = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
        System.out.println("The number of even number is: " + count(integers, new EvenNumberPredicate()));

        Integer[] test = {0, 1, 2, 3, 4, 5, 6};
        Swap(test, 2, 5);
        for (Integer integer : test) {
            System.out.println(integer);
        }

        List<Integer> list = new ArrayList<>() {{
            add(0);
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
        }};
        System.out.println("The max value is " + maxElement(list, 2, 5));
    }
}
