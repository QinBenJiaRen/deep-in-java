package functional;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateDesignDemo {

    public static void main(String[] args) {

        List<Integer> source = Arrays.asList(1, 2, 3, 4, 5);
        Collection<Integer> even = filter(source, num -> num % 2 == 0);
        System.out.println(even);

        //
        Stream.of(1,2,3,4,5).filter(num -> num % 2 == 0).forEachOrdered(System.out::println);
    }

    private static <E> Collection<E> filter(Collection<E> source, Predicate<E> predicate){
        List<E> list = new ArrayList<E>(source);
        Iterator<E> iterator = list.iterator();
        while (iterator.hasNext()) {
            E element = iterator.next();
            if (!predicate.test(element)) {
                iterator.remove();
            }
        }
        return Collections.unmodifiableList(list);
    }
}
