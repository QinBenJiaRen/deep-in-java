package functional;

public class ActionDemo {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("haiyang");
            }
        };

        Runnable runnable1 = () -> {
            System.out.println("11111");
        };
    }
}
