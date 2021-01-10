package functional;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer consumer = System.out::print;

        consumer.accept("hello world");

        Consumer<String> consumer1 = ConsumerDemo::echo;

        consumer1.andThen(consumer).accept("1111");
    }

    public static void echo(String message) {
        System.out.println(message);
    }
}
