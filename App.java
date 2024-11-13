import java.util.Random;

public class App {
    public static int uPos = -1;

    public static Integer[] excluiNumerosPares(Integer[] v) {
        for (int i = 0; i < uPos; i++) {
            if (v[i] % 2 == 0) {
                for (int j = i; j < uPos; j++) {
                    if (j != uPos - 1) {
                        v[j] = v[j + 1];
                    } else {
                        v[j] = null;
                    }
                }
                --i;
                --uPos;
            }
        }
        return v;
    }

    public static void imprimeVetor(Integer[] v) {
        System.out.print("[");
        for (int i = 0; i < uPos; i++) {
            System.out.print(v[i]);
            if (i != uPos - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        Integer[] v = new Integer[10];
        uPos = v.length - 1;

        for (int i = 0; i < v.length; i++) {
            v[i] = new Random().nextInt(100);
        }

        System.out.println("Vetor com números aleatórios:");
        imprimeVetor(v);

        System.out.println("Vetor sem números pares:");
        imprimeVetor(excluiNumerosPares(v));

    }
}
