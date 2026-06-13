//leetcode problem 2 
// we have to write a function to get the longest common prefix string amongst an array of string,
// a class

public class Main {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        Solution myObj = new Solution();
        String result = myObj.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
