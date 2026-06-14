// Leet Code 14 Common Prefix(Array)
//need to Write a function that find the common prefix
//string amongst an array of strings

// Solution class
public class Solution {

    //  Solution Method
    public String longestCommonPrefix(String[] strs) {

        // if statement to check is the input is not empty
        if (strs == null || strs.length == 0) {

            //if input is empty return empty string
            return " ";
        }
        // declaring the first string of the array named first
        String first = strs[0];

        //outer loop iterating through the first string of array
        for (int i = 0; i < first.length(); i++) {

            //saving the check character of string in currentchar for comparison
            char currentChar = first.charAt(i);

            // inner loop iterating through the array check all strings
            for (int j = 1; j < strs.length; j++) {

                // if statement to check that if the first string is 
                //not greater than the others or the next character in first string is not matching with other strings
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {

                    // return statement to get the output
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
