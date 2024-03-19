A palindrome number is a number that remains the same when its digits are reversed. Here's a simple algorithm to determine if a number is a palindrome:

Take the input number.
Convert the number into a string to make it easier to work with its digits.
Reverse the string.
Compare the original string with the reversed string.
If the two strings are equal, then the number is a palindrome; otherwise, it's not.


Here's a Python implementation of the algorithm:

def is_palindrome(number):
    # Convert number to string
    num_str = str(number)
    
    # Reverse the string
    reversed_str = num_str[::-1]
    
    # Compare original string with reversed string
    if num_str == reversed_str:
        return True
    else:
        return False

# Test the function
number = 12321
if is_palindrome(number):
    print(f"{number} is a palindrome.")
else:
    print(f"{number} is not a palindrome.")
