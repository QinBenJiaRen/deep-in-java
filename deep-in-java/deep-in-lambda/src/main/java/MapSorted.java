import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description Map排序
 * @Author jia_h
 * @Date 2021/2/8 10:15
 * @Version 1.0
 */
public class MapSorted {

    public static void main(String[] args) {
        Map<Integer, Integer> result = new HashMap<>();
        result.put(1, 2);
        result.put(2, 50);
        result.put(3, 10);

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        result.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(e -> sortedMap.put(e.getKey(), e.getValue()));
        System.out.println(sortedMap);
    }
}
