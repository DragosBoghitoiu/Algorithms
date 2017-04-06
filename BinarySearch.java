/**
 * Created by Dragos on 06.04.2017.
 */
public class BinarySearch {

    /**
     * Complexity of O(log(N))
     * @param lookupValue - value to search for in the given array
     * @param lookupArray - sorted array to search in
     * @return the array index of the found value or null if value is not present.
     */
    public static Integer binarySearch(int lookupValue, int [] lookupArray) {
        //initial help values
        int lowIndex = 0;
        int highIndex = lookupArray.length -1;

        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;
            if (lookupArray[middleIndex] == lookupValue) {
                return middleIndex;
            } else {
                if (lookupArray[middleIndex] > lookupValue) {
                    highIndex = middleIndex - 1;
                } else {
                    lowIndex = middleIndex + 1;
                }
            }
        }

        return null;
    }
}
