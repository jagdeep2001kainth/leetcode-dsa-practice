// leet code problem 1 Two Sum(array)
// we need to loop through an array of numbers/integers
// and we need to make sure that we return the indexes 
// of those numbers whose sum is matching the 
// target int,

//Solution class
public class Solution {

    //Solution method
    public int[] twoSum(int[] num, int target) {

        // for loop for checking each number starting from 0
        for (int i = 0; i < num.length; i++) {

            // for loop for checking each number starting from 1     
            for (int j = i + 1; j < num.length; j++) {

                //if statement to check if the sum is equal to target
                if (num[i] + num[j] == target) {

                    // return indexes of the i,j which is matching the 
                    //target by sum
                    return new int[]{i, j};

                }
            }
        }
        return new int[]{};
    }
}
