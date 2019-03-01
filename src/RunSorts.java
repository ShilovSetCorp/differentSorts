import java.time.LocalTime;
import java.util.Arrays;

public class RunSorts {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        int[] unsortedArray = {3, 5,67, 1, 34, 15, 43, 90, 121, 3, 6, 4};
        int[] unsrtedArrBuble = {56, 234, 76, 23, 12, 0, 3, 4,1, 5,8, 88};
        int[] sortedArray;// = new int[unsortedArray.length];
        int[] sortedArrBuble;

        System.out.println(Arrays.toString(unsortedArray) + "\n");
        sortedArrBuble = new BubbleSort().sort(unsrtedArrBuble);
        LocalTime time1 = LocalTime.now();

        System.out.println(time1.toNanoOfDay() - time.toNanoOfDay());
        System.out.println("--------Bubble Sort----------------");
        System.out.println(Arrays.toString(sortedArrBuble));
        sortedArray = new QuickSort().sort(unsortedArray, 0, unsortedArray.length - 1);
        LocalTime time2 = LocalTime.now();
        System.out.println("--------Quick Sort--------------------");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(time2.toNanoOfDay() - time1.toNanoOfDay());
    }
}
