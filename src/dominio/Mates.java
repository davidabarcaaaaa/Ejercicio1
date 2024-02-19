package dominio;

public class Mates {

    public static int sumaSerie(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    public static long factorial(int numero) {
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static double potencia(int base, int exponente) {
        return Math.pow(base, exponente);
    }

    public static double mediaAritmetica(int... numeros) {
        int suma = sumaSerie(numeros);
        return suma / (double) numeros.length;
    }

    public static double desviacionTipica(int... numeros) {
        double media = mediaAritmetica(numeros);
        double sumatoria = 0;
        for (int num : numeros) {
            sumatoria += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumatoria / numeros.length);
    }

    public static int sumaPrimerosPares(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += 2 * i;
        }
        return suma;
    }

    public static int sumaPares(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            if (num % 2 == 0) suma += num;
        }
        return suma;
    }

    public static int[] listaPrimerosPares(int n) {
        int[] pares = new int[n];
        for (int i = 0; i < n; i++) {
            pares[i] = 2 * (i + 1);
        }
        return pares;
    }

    public static int productoEscalar(int[] lista1, int[] lista2) {
        int producto = 0;
        for (int i = 0; i < lista1.length; i++) {
            producto += lista1[i] * lista2[i];
        }
        return producto;
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
          return n;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= n; i++) {
          int sum = prev + curr;
          prev = curr;
          curr = sum;
        }
        return curr;
      }

    @Override
    public String toString() {
        return "Mates []";
    }

    public static String sumaEnteros(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sumaEnteros'");
    }

    public static String sumaLista(int[] is) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sumaLista'");
    }

    public static long[] obtenerListaMayorIgual2(int[] is) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerListaMayorIgual2'");
    }
}
