/**
 * Created by Dragos on 06.04.2017.
 */
public class BubbleSort {

    /**
     * iterate array and swap values
     * repeat the process until the array is fully sorted.
     * Complexity of O(N^2)
     * @return the asc sorted array
     */
    public static int[] bubbleSort(int [] arrayToSort) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int currentIndex = 0; currentIndex < arrayToSort.length -1; currentIndex++) {
                int currentValue = arrayToSort[currentIndex];
                int nextValue = arrayToSort[currentIndex + 1];
                if (currentValue > nextValue) {
                    swapValues(arrayToSort, currentIndex, currentIndex +1);
                    isSorted = false;
                }
            }
        }
        return arrayToSort;
    }

    private static void swapValues(int[] array, int val1, int val2) {
        int tmpValue = array[val1];
        array[val1] = array[val2];
        array[val2] = tmpValue;
    }
}
