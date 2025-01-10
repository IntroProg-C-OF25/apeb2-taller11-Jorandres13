
import java.util.Scanner;

/*
Generar una función que tenga 4 parámetros de tipo decimal y devuelva el 
promedio cualitativo de los parámetros. Si el promedio es: De 0 a 5 el promedio 
cualitativo es Regular De 5.1 a 8 el promedio es Bueno De 8.1 a 9 el promedio 
es Muy Bueno De 9.1 a 10 el promedio es Sobresaliente. A la función se la debe 
llamar desde un método principal. Los parámetros necesarios para llamar a la 
función, deben ser ingresados solicitados al usuario.
 * @author Jorge Guerrero
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        double prom1 = 0, prom2 = 0, prom3 = 0, prom4 = 0;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese las notas de los 4 parametros: ");
        prom1 = tcl.nextDouble();
        prom2 = tcl.nextDouble();
        prom3 = tcl.nextDouble();
        prom4 = tcl.nextDouble();
        System.out.println("Promedio es igual a = " + promedio(prom1, prom2, prom3, prom4));
        System.out.println("Promedio " + notapromedio(prom4));

    }

    public static double promedio(double p1, double p2, double p3, double p4) {
        return ((p1 + p2 + p3 + p4) / 4);
    }

    public static String notapromedio(double promedio) {
        if (promedio <= 5) {
            return "Regular";
        }
        if ((promedio > 5) && (promedio <= 8)) {
            return "Muy bueno";
        } else {
            return "Sobresaliente";
        }
    }
}

/* run:
Ingrese las notas de los 4 parametros: 8 8,7 9 10
Promedio es igual a = 8.925
Promedio Sobresaliente
BUILD SUCCESSFUL (total time: 7 seconds)
 */
