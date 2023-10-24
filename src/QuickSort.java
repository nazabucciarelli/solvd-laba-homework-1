import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] numbersArr = {1, 14, 18, 3, 2, 6, 5, 4, 0, 8, 20};
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(numbersArr));
        System.out.println(quickSort(numbers));
    }

    public static ArrayList<Integer> quickSort(ArrayList<Integer> numbers){
        if (numbers.size() < 1) return new ArrayList<>();
        ArrayList<Integer> leftList = new ArrayList();
        ArrayList<Integer> rightList = new ArrayList();
        Integer pivot = numbers.get(0);
        numbers.remove(0);
        for(Integer num:numbers){
            if(num < pivot){
                leftList.add(num);
            } else{
                rightList.add(num);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(quickSort(leftList));
        result.add(pivot);
        result.addAll(quickSort(rightList));
        return result;
    }
}
