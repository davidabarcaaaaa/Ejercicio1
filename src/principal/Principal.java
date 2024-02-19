package principal;

import dominio.Matematicas;
import java.util.*;

public class Principal {

    public static void main(String[] args) {

        System.out.println("La suma de los números enteros hasta 10 es: " + Mates.sumaEnteros(10));

        System.out.println("El factorial de 5 es: " + Mates.factorial(5));

        System.out.println("2 elevado a la potencia 5 es: " + Mates.potenciaEnesima(2, 5));

        System.out.println("La suma de la lista es: " + Mates.sumaLista(new int[]{1, 2, 3, 4, 5}));

        System.out.println("La media aritmética de la lista es: " + Mates.mediaAritmetica(new int[]{1, 2, 3, 4, 5}));

        System.out.println("La desviación típica de la lista es: " + Mates.desviacionTipica(new int[]{1, 2, 3, 4, 5}));

        System.out.println("La suma de los primeros números pares hasta 10 es: " + Mates.sumaPares(10));

        System.out.println("La suma de los elementos pares de la lista es: " + Mates.sumaElementosPares(new int[]{1, 2, 3, 4, 5}));

        System.out.println("La lista de números naturales mayores o iguales que 2 es: " + Arrays.toString(Mates.obtenerListaMayorIgual2(new int[]{1, 2, 3, 4})));

        System.out.println("La lista de los primeros 5 números pares es: " + Arrays.toString(Mates.listaPrimerosNPares(5)));

        System.out.println("El producto escalar de las listas [1, 2, 3] y [4, 5, 6] es: " + Mates.productoEscalar(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }
}
