// leet code problem 26(array)
// remove duplicates from sorted array

//main class
public class Main {

    public static void main(String[] args) {// < main method

        //input of array of numbers
        int nums[] = {1, 1, 2, 2, 3, 3, 4, 4, 9, 9};

        // creating an object of the solution class
        Solution myObj = new Solution();

        //calling main method using method name and object name
        // of the solution class and storing in integer k
        int k = myObj.removeDuplicates(nums);

        //printing result of unique count
        System.out.println("Unique count: " + k);

        //looping/iterating throught the array
        for (int i = 0; i < k; i++) {

            // print modified array (first k elements)
            System.out.print(nums[i] + " ");
        }
    }
}
