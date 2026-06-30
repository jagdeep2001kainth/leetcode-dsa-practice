// main class

public class Main {

    // main method
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s1 = "([{}])";
        String s2 = "{}()[]";
        String s3 = "(}{]";
        System.out.println(s1 + " -> " + sol.isValid(s1));
        System.out.println(s2 + " -> " + sol.isValid(s2));
        System.out.println(s3 + " -> " + sol.isValid(s3));
    }
}
