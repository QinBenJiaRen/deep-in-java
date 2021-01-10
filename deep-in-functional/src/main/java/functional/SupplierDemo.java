package functional;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<Long> supplier = getLong();

        supplier.get();

    }

    public static Supplier<Long> getLong() {
        return System::currentTimeMillis;


//        return () -> {
//            return System.currentTimeMillis();
//        };

    }
}
