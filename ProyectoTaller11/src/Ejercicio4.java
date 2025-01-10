
import java.util.Scanner;

/*
Generar un procedimiento para calcular el valor de la planilla de luz y otro 
procedimiento para calcular el valor del predio de un bien inmueble. Cada 
procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, 
cédula del cliente).
En el procedimiento de planilla de luz se debe pedir los siguiente datos valor 
del kilowatio y el número de kilowatios del mes. Y se genera en pantalla el 
siguiente reporte: Cliente Ana Contreras con cédula 1100112233 debe cancelar 
el valor de $10

En el procedimiento del predio se debe pedir el valor de inmueble y el para 
obtener el valor del predio se saca el 2% del valor del inmueble. Y se genera 
el siguiente reporte:

Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado 
en $30000 y tiene que pagar de predio $ 600.

En el método principal; si el usuario ingresa 1 se llama al procedimiento 
calcularValorLuz; 2 se llama al procedimiento calcularPredio. Los datos que se 
necesita en cada procedimiento se los debe ingresar por teclado.
 * @author Jorge Guerrero
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        int opcion, cedula = 0;
        String nombre;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Hola! Ingrese su nombre y numero de cedula: ");
        nombre = tcl.next();
        cedula = tcl.nextInt();
        System.out.println("Que desea hacer?\n1. Calcular valor de la luz.\n2. Calcular predio.\n");
        opcion = tcl.nextInt();
        switch (opcion) {
            case 1:
                double kilovatio = 0,
                 numkilo = 0;
                System.out.println("Ingrese el costo del kilovatio y el numero de kilovatios consumidos: ");
                kilovatio = tcl.nextDouble();
                numkilo = tcl.nextDouble();
                System.out.println("Clienta/o " + nombre + " con cedula " + cedula + " debe cancelar un valor de" + planillaLuz(kilovatio, numkilo));
                break;
            case 2:
                double valor = 0;
                System.out.println("Ingrese el valor del inmueble: ");
                valor = tcl.nextDouble();
                System.out.println("Clienta/o " + nombre + " con cedula " + cedula + " tiene un bien inmueble de " + valor + " y tiene que pagar " + predio(valor));
                break;
        }

    }

    public static double planillaLuz(double k, double nk) {
        return k * nk;
    }

    public static double predio(double v) {
        return v * 0.02;
    }
}

/*run:
Hola! Ingrese su nombre y numero de cedula: 
Jorge 1104899891
Que desea hacer?
1. Calcular valor de la luz.
2. Calcular predio.

2
Ingrese el valor del inmueble: 
30000
Clienta/o Jorge con cedula 1104899891 tiene un bien inmueble de 30000.0 y tiene que pagar 600.0
BUILD SUCCESSFUL (total time: 9 seconds)
 */
