package functional;

import java.util.function.Supplier;

public class SupplierDesignDemo {

    public static void main(String[] args) {

        echo("hello world");

        //可以进行延迟加载
        echo( () -> {
            sleep(1000);
            return "hello world";
        });

        //lambda语法表达式
        echo(SupplierDesignDemo::getMessage);

    }

    public static String getMessage() {
        sleep(1000);
        return "hello world";
    }

    public static void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void echo(String message) {
        System.out.println(message);
    }

    public static void echo(Supplier<String> message) {
        System.out.println(message.get());
    }
}
