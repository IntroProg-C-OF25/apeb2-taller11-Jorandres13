
import java.util.Scanner;


/*
Generar los procedimientos y/o funciones que impriman los valor pares, impares 
y el promedio de un arreglo bidimensional. El (los) procedimiento(s) o método(s) 
deben ser invocados desde el método principal (quien es el único responsable de gestionar las entradas/salidas); además el método debe recibir como parámetro un arreglo bidimensional.
 * @author Jorge Guerrero
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int fila, columna;
        System.out.print("Dame fila y columna de la matriz: ");
        fila = tcl.nextInt();
        columna = tcl.nextInt();
        int matriz[][] = new int[fila][columna];
        generarMatriz(matriz);
        mostrarMatriz(matriz);
        presentarParImpar(matriz);
        presentarPromedio(matriz);

    }

    public static void generarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[ " + matriz[i][j] + " ]");
            }
            System.out.println("");
        }
    }

    public static void presentarParImpar(int matriz[][]) {
        System.out.println("Elementos pares de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 == 0) ? matriz[i][j] + (" ") : "");
            }
            System.out.println("");
        }
        System.out.println("Elementos impares de la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print((matriz[i][j] % 2 != 0) ? matriz[i][j] + (" ") : "");
            }
            System.out.println("");
        }
    }

    public static void presentarPromedio(int matriz[][]) {
        int sumaMatriz = 0;
        double prom = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                sumaMatriz += matriz[i][j];
            }
        }
        prom = sumaMatriz / (matriz.length * matriz[0].length);
        System.out.println("\nEl promedio es = " + prom);
    }
}

/*
run:
Dame fila y columna de la matriz: 3 3
[ 6 ][ 7 ][ 7 ]
[ 0 ][ 7 ][ 3 ]
[ 5 ][ 2 ][ 8 ]
Elementos pares de la matriz
6 
0 
2 8 
Elementos impares de la matriz
7 7 
7 3 
5 

El promedio es = 5.0
BUILD SUCCESSFUL (total time: 2 seconds)
 */
