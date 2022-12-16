public class EvenNumberPredicate implements Predicate<Integer> {
    public boolean predict(Integer i) {
        return i % 2 == 0;
    }
}
