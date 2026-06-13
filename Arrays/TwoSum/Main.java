// leet code problem two sum easy problem 1
// we need to loop through an array of numbers/integers
// and we need to make sure that we return the indexes 
// of those numbers whose sum is matching the 
// target int,

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int target = 7;
        int[] num = {3, 2, 4};
        Solution sol = new Solution();
        int[] result = sol.sum(num, target);
        System.out.println(Arrays.toString(result));
    }
}
