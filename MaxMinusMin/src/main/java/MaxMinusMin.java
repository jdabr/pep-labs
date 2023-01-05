import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int lowest = 0;
        int hold;
        int highest = 0;
        int initial = nums.get(0);

        for (int i = 0; i < nums.size(); i++) {
            //hold = nums.get(i-1);

            if(nums.get(i) < initial)
            {
                lowest = initial;
            }
        }

        for (int i = 0; i < nums.size(); i++) {

            if(nums.get(i) > initial)
            {
                highest = initial;
            }
        }
        return highest - lowest;
    }
}
