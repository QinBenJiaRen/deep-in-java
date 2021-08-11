package 排序;

/**
 * @Description 快排
 * @Author jia_h
 * @Date 2021/8/10 11:52
 * @Version 1.0
 */
public class QuickSort {

    public void quickSort(int[] numbs, int low, int high) {
        int pivot, p_pos, i, t;
        if (low < high) {
            p_pos = low;
            pivot = numbs[p_pos];
            for (i = low + 1; i <= high; i++) {
                if (numbs[i] > pivot) {
                    p_pos++;
                    t = numbs[p_pos];
                    numbs[p_pos] = numbs[i];
                    numbs[i] = t;
                }
            }
            t = numbs[low];
            numbs[low] = numbs[p_pos];
            numbs[p_pos] = t;

            quickSort(numbs, low, p_pos - 1);
            quickSort(numbs, p_pos + 1, high);
        }
    }
}
