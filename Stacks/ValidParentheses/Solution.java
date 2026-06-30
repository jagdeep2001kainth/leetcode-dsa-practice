// leet code question 20(stacks)
// Valid Parentheses

//Import stack from java util
import java.util.Stack;

// Solution Class
public class Solution {

    //Solution method
    public Boolean isValid(String s) {

        //create an empty stack
        Stack<Character> stack = new Stack<>();

        // for loop to iterate around the string
        for (char c : s.toCharArray()) {

            // if statement to check if the character
            // has a opening bracket
            if (c == '(' || c == '[' || c == '{') {
                // we push that character to stack
                stack.push(c);
            } // else statment to check other scenarios
            else {

                // if the stack become empty after all iternations
                // means no closing bracket will return false
                if (stack.isEmpty()) {
                    return false;
                }

                // creating a character top which is equal 
                //to the top most character in the stack
                char top = stack.pop();

                // checking that the closing brackets in the string is matching with the opeing bracket which is
                // at the top of the stack
                if (c == ')' && top != '(') {
                    return false;
                }

                if (c == ']' && top != '[') {
                    return false;
                }

                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
