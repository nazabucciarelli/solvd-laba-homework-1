import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] numbers, int begin, int end){
        if(begin < end){
            int partitionIndex = partition(numbers,begin,end);

            quickSort(numbers,begin,partitionIndex-1);
            quickSort(numbers,partitionIndex+1, end);
        }
    }

    public static int partition(int[] numbers, int begin, int end){
        int pivot = numbers[end];
        int i = begin-1;

        for (int j = begin; j < end; j++){
            if (numbers[j] <= pivot){
                i++;
                int swapAux = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = swapAux;
            }
        }

        int swapAux = numbers[i+1];
        numbers[i+1] = numbers[end];
        numbers[end] = swapAux;

        return i+1;
    }
}
