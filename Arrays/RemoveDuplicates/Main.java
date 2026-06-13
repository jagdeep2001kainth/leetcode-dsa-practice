// leet code problem 3
// remove duplicates from sorted array

public class Main {

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 2, 3, 3, 4, 4, 9, 9};
        Solution myObj = new Solution();
        int k = myObj.removeDuplicates(nums);
        System.out.println("Unique count: " + k);
        // print modified array (first k elements)
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
