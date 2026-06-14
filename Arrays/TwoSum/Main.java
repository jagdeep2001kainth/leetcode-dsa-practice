// leet code problem 1 Two Sum(array)
// we need to loop through an array of numbers/integers
// and we need to make sure that we return the indexes 
// of those numbers whose sum is matching the 
// target int,

//java util package for arrays to convert the result
//from arrays to String
import java.util.Arrays;

//main class
public class Main {

    public static void main(String[] args) { // < main method

        // target int
        int target = 7;

        // input array
        int[] num = {3, 2, 4};

        // creating an object from Solution class
        Solution sol = new Solution();

        // calling the method using method name
        // and Object name of the Solution class
        int[] result = sol.twoSum(num, target);

        // print the result by converting array to string
        System.out.println(Arrays.toString(result));
    }
}
