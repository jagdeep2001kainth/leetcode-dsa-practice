// Leet Code 14 Common Prefix(Array)
//need to Write a function that find the common prefix
//string amongst an array of strings

//Main class
public class Main {

    public static void main(String[] args) { // < main method method

        // input array 
        String[] strs = {"flower", "flow", "flight"};

        // creating object myObj using Solution class
        Solution myObj = new Solution();

        // calling method using method name and object name of the solution and storing ouputin in a string result
        String result = myObj.longestCommonPrefix(strs);

        // printing result
        System.out.println(result);
    }
}
