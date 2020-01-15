/*it runs in O(n^2) time

Algo 1:

Steps: Its a brute force method

    Have 2 for loops
    for i = 1 to i less than array.length -1
    for j=i+1 to j less than array.length
    This way you can get substring of every possible combination from the array
    Have a palindrome function which checks if a string is palindrome
    so for every substring (i,j) call this function, if it is a palindrome store it in a string variable
    If you find next palindrome substring and if it is greater than the current one, replace it with current one.
    Finally your string variable will have the answer

Issues: 1. This algo runs in O(n^2) time.

Algo 2:

    Reverse the string and store it in diferent array
    Now find the largest matching substring between both the array
    But this too runs in O(n^2) time
*/

class LongestPalindrome {

    /**
     * @param input is a String input
     * @return The longest palindrome found in the given input.
     */
    public static String getLongestPalindrome(final String input) {
        int rightIndex = 0, leftIndex = 0;
        String currentPalindrome = "", longestPalindrome = "";
        for (int centerIndex = 1; centerIndex < input.length() - 1; centerIndex++) {
            leftIndex = centerIndex - 1;  rightIndex = centerIndex + 1;
            while (leftIndex >= 0 && rightIndex < input.length()) {
                if (input.charAt(leftIndex) != input.charAt(rightIndex)) {
                    break;
                }
                currentPalindrome = input.substring(leftIndex, rightIndex + 1);
                longestPalindrome = currentPalindrome.length() > longestPalindrome.length() ? currentPalindrome : longestPalindrome;
                leftIndex--;  rightIndex++;
            }
        }
        return longestPalindrome;
    }

    public static void main(String args[]) {
        String str = "HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE";
        String longestPali = getLongestPalindrome(str);
        System.out.println("String: " + str);
        System.out.println("Longest Palindrome: " + longestPali);
    }
}

/*
The output of this is the following:

marcello:datastructures marcello$ javac LongestPalindrome
marcello:datastructures marcello$ java LongestPalindrome
String: HYTBCABADEFGHABCDEDCBAGHTFYW12345678987654321ZWETYGDE
Longest Palindrome: 12345678987654321
*/



