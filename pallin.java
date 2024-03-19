//Certainly! Here's a Java implementation of a function to check if a number is a palindrome:

public class Palindrome {
    public static boolean isPalindrome(int number) {
        // Convert number to string
        String numStr = String.valueOf(number);
        
        // Initialize variables for left and right pointers
        int left = 0;
        int right = numStr.length() - 1;
        
        // Loop until left pointer is less than right pointer
        while (left < right) {
            // If characters at left and right pointers don't match, return false
            if (numStr.charAt(left) != numStr.charAt(right)) {
                return false;
            }
            // Move the pointers towards the center
            left++;
            right--;
        }
        
        // If the loop completes without returning false, it's a palindrome
        return true;
    }

    public static void main(String[] args) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}


//This Java program defines a isPalindrome function that takes an integer number as input and returns true if it's a palindrome, and false otherwise. The main method demonstrates how to use this function by checking if the number 12321 is a palindrome.//