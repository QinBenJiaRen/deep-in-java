import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class LambdaDemo {

    public static void main(String[] args) {

       Runnable runnable = () -> {
           System.out.println("111");
       };

       Runnable runnable1 = new Runnable() {
           @Override
           public void run() {
               System.out.println("2222");
           }
       };

       Map<String, Integer> map = new HashMap<>();
       map.put("1", 11);
       map.put("2", 11);
       map.put("3", 11);
       map.entrySet().stream().distinct();
       for (Map.Entry<String, Integer> entry : map.entrySet()) {
           System.out.println(entry.getKey() + ":" + entry.getValue());
       }



    }
}
