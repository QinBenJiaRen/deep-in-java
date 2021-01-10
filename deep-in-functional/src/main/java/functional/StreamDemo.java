package functional;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        count(1,2,3,4,5,6,7,8,9);

        sort(8,9,1,4,7,5,2,3);

        sort((x, y) ->(x > y ? 1 : x == y ? 0 : -1),
                8,9,1,4,7,5,2,3);

        parallelSort(8,9,1,4,7,5,2,3);

    }

    public static void count(Integer... nums) {
        Stream.of(nums)
                .reduce(Integer::sum)
                .ifPresent(System.out::print);
    }

    public static void sort(Comparator<Integer> comparator, Integer... nums) {
        Stream.of(nums)
                .sorted(comparator)
                .forEach(System.out::println);
    }

    public static void sort(Integer... nums) {
        Stream.of(nums)
                .sorted()
                .forEach(System.out::println);
    }

    public static void parallelSort(Integer... nums) {
        Stream.of(nums)
                .sorted()
                .parallel()
                .forEach(StreamDemo::out);
    }

    //并行执行
    public static void out(Object object) {
        System.out.printf("[%s]: %s\n", Thread.currentThread().getName(), object);
    }
}
