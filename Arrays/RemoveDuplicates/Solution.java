// leet code problem 26(array)
// remove duplicates from sorted array

//class Solution
public class Solution {

    // Solution Method name
    public int removeDuplicates(int[] nums) {

        //checking if num/input is 0 using if statement
        if (nums.length == 0) {
            return 0;
        }
        // first element is always unique
        int k = 1;

        // for loop on traversing through nums
        for (int i = 1; i < nums.length; i++) {

            // if statement to check if the current int
            // is not equal to previous int
            if (nums[i] != nums[i - 1]) {

                // if true than store that int in k 
                nums[k] = nums[i];

                // count increase of k each time condition 
                //become true
                k++;
            }
        }
        return k;
    }
}
