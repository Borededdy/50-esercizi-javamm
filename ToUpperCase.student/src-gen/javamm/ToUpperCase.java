package javamm;

@SuppressWarnings("all")
public class ToUpperCase {
  public static char[] upperCase(char[] a) {
    char[] ris = new char[a.length];
    for (int i = 0; (i <= (a.length - 1)); i++) {
      if (((a[i] >= 'a') && (a[i] <= 'z'))) {
        int _minus = (a[i] - ('a' - 'A'));
        ris[i] = ((char) _minus);
      } else {
        ris[i] = a[i];
      }
    }
    return ris;
  }

  public static void main(String[] args) {
  }
}
