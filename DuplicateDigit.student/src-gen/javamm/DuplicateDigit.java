package javamm;

@SuppressWarnings("all")
public class DuplicateDigit {
  public static long duplicateDigit(int n) {
    long duplicatedDigit = 0;
    long posizione = 1;
    while ((n > 0)) {
      {
        int cifra = (n % 10);
        long coppia = (cifra * 11);
        long _duplicatedDigit = duplicatedDigit;
        duplicatedDigit = (_duplicatedDigit + (coppia * posizione));
        long _posizione = posizione;
        posizione = (_posizione * 100);
        int _n = n;
        n = (_n / 10);
      }
    }
    return duplicatedDigit;
  }

  public static void main(String[] args) {
  }
}
