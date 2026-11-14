
public class Main {

    public static void main(String[] agrs) {
        int[] nums = {1, 3, 5, 7, 8};
        int target = 4;
        Solution solution = new Solution();
        int result = solution.searchInsertPosition(nums, target);
        System.out.println("Insert position:" + result);

    }
}
