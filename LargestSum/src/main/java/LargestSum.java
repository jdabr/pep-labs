
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int n = nums.size();
        int largest = nums.get(0);
        int secondLargest = nums.get(0);
        int counter = 0;
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if(largest < nums.get(i))
            {
                largest = nums.get(i);
                counter = i;
            }
        }
        nums.remove(counter);
        int n1 = nums.size();

        for (int i = 1; i < n1; i++) {
            if(secondLargest < nums.get(i))
            {
                secondLargest = nums.get(i);
            }
        }
        sum = largest + secondLargest;
        return sum;
    }
}