
import java.util.Scanner;

/*
Generar las funciones/métodos que devuelvan las suma, resta y multiplicación de 
un arreglo bidimensional cuadrado; mismo que se lo recibe como parámetro.
 * @author Jorge Guerrero
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int f = 5, c = 5, f2 = 5, c2 = 5;

        int matriz[][] = new int[f][c];
        int matriz2[][] = new int[f][c];
        matriz(matriz, matriz2);
        suma(matriz, matriz2, f, c, f2, c2);
        resta(matriz, matriz2, f, c, f2, c2);
        multi(matriz, matriz2, f, c, f2, c2);

    }

    public static void matriz(int matriz[][], int matriz2[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Matriz 1");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void suma(int matriz[][], int matriz2[][], int f, int c, int f2, int c2) {
        if ((f == f2) && (c == c2)) {
            int sum[][] = new int[f][c];
            System.out.println("La suma de las matrices");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    sum[i][j] = matriz2[i][j] + matriz[i][j];
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("No se puede sumar");
        }
    }

    public static void resta(int matriz[][], int matriz2[][], int f, int c, int f2, int c2) {
        if ((f == f2) && (c == c2)) {

            int res[][] = new int[f][c];
            System.out.println("La resta de las matrices");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    res[i][j] = matriz2[i][j] - matriz[i][j];
                    System.out.print(res[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("No se puede restar");
        }
    }

    public static void multi(int matriz[][], int matriz2[][], int f, int c, int f2, int c2) {
        if (c == f2) {
            int multi[][] = new int[f][c2];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int k = 0; k < matriz[0].length; k++) {
                        multi[i][j] += matriz[i][k] * matriz[k][j];
                    }

                }
            }
            for (int i = 0; i < multi.length; i++) {
                for (int j = 0; j < multi[0].length; j++) {
                    System.out.print(multi[i][j] + " ");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("No se puede multiplicar");
        }
    }
}

/*Matriz 1
68 48 2 71 11  
98 8 35 10 26  
17 11 34 48 30  
16 61 67 66 97  
88 70 85 68 13  
Matriz 2
72 25 34 55 49  
1 10 39 58 51  
24 21 49 28 37  
5 40 34 14 63  
27 41 48 47 97  
La suma de las matrices
140 73 36 126 60 
99 18 74 68 77 
41 32 83 76 67 
21 101 101 80 160 
115 111 133 115 110 
La resta de las matrices
4 -23 32 -16 38 
-97 2 4 48 25 
7 10 15 -20 7 
-11 -21 -33 -52 -34 
-61 -29 -37 -21 84 
La multiplicacion es
11466 8771 7576 10838 9086  
10491 7583 4546 11146 3644  
6220 6306 7341 8157 6539  
17797 12809 17112 15914 11435  
16521 10777 11177 16400 12103 
 */
