
public class Main {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("========== BINARY SEARCH ==========");
        System.out.println("===================================");
        int[] sortedArray = new int[] {0,3,7,10,11,12,20,200};
        int valueToSearch = 10;

        System.out.println("Sorted Array: ");
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int aSortedArray : sortedArray) {
            builder.append(aSortedArray).append(",");
        }
        builder.append("]");
        System.out.println(builder);
        System.out.println("Value to search for: " + valueToSearch);
        System.out.println("------------------------------");

        Integer index = BinarySearch.binarySearch(valueToSearch, sortedArray);
        if (index != null) {
            System.out.println("Value: " + valueToSearch + " found at index: " + index );
        } else {
            System.out.println("Value: " + valueToSearch + " not found!");
        }
        ///////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("===================================");
        System.out.println("========== BUBBLE SORT ============");
        System.out.println("===================================");
        int [] unsortedArray = new int[] {10,4,2,15,100,50};
        System.out.println("Unsorted Array: ");
        StringBuilder builder1 = new StringBuilder();
        builder1.append("[");
        for (int aUnsortedArray : unsortedArray) {
            builder1.append(aUnsortedArray).append(",");
        }
        builder1.append("]");
        System.out.println(builder1);

        BubbleSort.bubbleSort(unsortedArray);
        System.out.println("BUBBLE SORTED Array: ");
        StringBuilder builder2 = new StringBuilder();
        builder2.append("[");
        for (int aSortedArray : unsortedArray) {
            builder2.append(aSortedArray).append(",");
        }
        builder2.append("]");
        System.out.println(builder2);

    }
}
