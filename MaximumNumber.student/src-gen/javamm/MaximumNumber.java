package javamm;

@SuppressWarnings("all")
public class MaximumNumber {
  public static long maximumNumber(int[] a, int k) {
    long numeroFinale = 0;
    int start = 0;
    for (int i = 0; (i < k); i++) {
      {
        int numeriRimastiDaTrovareDopoQuesto = ((k - 1) - i);
        int _length = a.length;
        int _minus = (_length - 1);
        int end = (_minus - numeriRimastiDaTrovareDopoQuesto);
        int maxCifra = -1;
        int indiceDelMax = -1;
        for (int j = start; (j <= end); j++) {
          boolean _greaterThan = (a[j] > maxCifra);
          if (_greaterThan) {
            maxCifra = a[j];
            indiceDelMax = j;
          }
        }
        numeroFinale = ((numeroFinale * 10) + maxCifra);
        start = (indiceDelMax + 1);
      }
    }
    return numeroFinale;
  }

  public static void main(String[] args) {
  }
}
