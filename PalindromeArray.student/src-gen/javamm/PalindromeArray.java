package javamm;

@SuppressWarnings("all")
public class PalindromeArray {
  public static boolean palindrome(int[] a) {
    boolean isPalindrome = true;
    int _length = a.length;
    int j = (_length - 1);
    for (int i = 0; (i <= (a.length - 1)); i++) {
      {
        boolean _tripleNotEquals = (a[i] != a[j]);
        if (_tripleNotEquals) {
          isPalindrome = false;
        }
        j--;
      }
    }
    return isPalindrome;
  }

  public static void main(String[] args) {
  }
}
