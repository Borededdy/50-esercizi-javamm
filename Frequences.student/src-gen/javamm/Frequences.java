package javamm;

@SuppressWarnings("all")
public class Frequences {
  public static int[] frequences(int[] a) {
    int _length = a.length;
    boolean _tripleEquals = (_length == 0);
    if (_tripleEquals) {
      return new int[0];
    }
    int[] copia = new int[a.length];
    for (int i = 0; (i < a.length); i++) {
      copia[i] = a[i];
    }
    for (int i = 0; (i < copia.length); i++) {
      for (int j = 0; (j < (copia.length - 1)); j++) {
        boolean _greaterThan = (copia[j] > copia[(j + 1)]);
        if (_greaterThan) {
          int temp = copia[j];
          copia[j] = copia[(j + 1)];
          copia[(j + 1)] = temp;
        }
      }
    }
    int gruppiDistinti = 1;
    for (int i = 1; (i < copia.length); i++) {
      boolean _tripleNotEquals = (copia[i] != copia[(i - 1)]);
      if (_tripleNotEquals) {
        gruppiDistinti++;
      }
    }
    int[] risultato = new int[gruppiDistinti];
    int indiceRis = 0;
    int contaCorrente = 1;
    for (int i = 1; (i < copia.length); i++) {
      boolean _tripleEquals_1 = (copia[i] == copia[(i - 1)]);
      if (_tripleEquals_1) {
        contaCorrente++;
      } else {
        risultato[indiceRis] = contaCorrente;
        indiceRis++;
        contaCorrente = 1;
      }
    }
    risultato[indiceRis] = contaCorrente;
    return risultato;
  }

  public static void main(String[] args) {
  }
}
