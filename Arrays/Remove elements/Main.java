//import java util

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 6, 7,};
        int val = 3;
        Solution solution = new Solution();

        int k = solution.removeElement(nums, val);

        System.out.println("Number of remaining elements: " + k);

        System.out.println("Modified array: "
                + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
