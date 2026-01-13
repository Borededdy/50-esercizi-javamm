package javamm;

@SuppressWarnings("all")
public class IntegerSquareRoot {
  public static int integerSquareRoot(int n) {
    int i = 1;
    while (((i * i) <= n)) {
      i++;
    }
    return (i - 1);
  }

  public static void main(String[] args) {
  }
}
