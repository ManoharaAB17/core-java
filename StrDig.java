// Java program to check if a string
// contains only digits
class StrDig{

	// Function to check if a string
	// contains only digits
	public static boolean onlyDigits(String str, int n)
	{

		// Traverse the string from
		// start to end
		for (int i = 0; i < n; i++) {

			// Check if the sepecified
			// character is a not digit
			// then return false,
			// else return false
			if (!Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		// If we reach here that means all
		// the characters were digits,
		// so we return true
		return true;
	}

	// Driver Code
	public static void main(String args[])
	{
		// Given string str
		String str = "1234";
		int len = str.length();

		// Function Call
		System.out.println(onlyDigits(str, len));
	}
}
