/**
 * trabajo
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class trabajo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer array[] = new Integer[] {12,30,40,28,60};
        List arrayList = Arrays.asList(array);      

        System.out.println("Digital un numero que ocuoara un espacio en memoria");
        var num = scanner.nextInt();
        do {            
            if (num < 0) {
                System.out.println("Digito no valido, ingresa un numero positivo");
                var num1 = scanner.nextInt();
                num = num1;
            }
        } while (num < 0);
        System.out.println("\nTendras una tabla con diferentes espacios de memoria disponibles que ocupara la asignacion de memoria que diste");
        System.out.println(arrayList);
        System.out.println("\nElige una de las siguientes 3 opciones para asignar tu espacio de memoria a una de las casillas de la tabla segun su peso");
        System.out.println("\n -- (1) PRIMER AJUSTE -- \n        Buscara en la tabla de izquierda a derecha, si el peso es igual o superior ocupara esa casilla de espacio sin importar el desperdicio de memoria");
        System.out.println("\n -- (2) MEJOR AJUSTE -- \n         Buscara en cada casilla y elegira la mejor que no desperdicie espacio de memoria");
        System.out.println("\n -- (3) PEOR AJUSTE -- \n         Esta opcion ordenara la tabla de mayor a menor  por ende cogera la primer casilla de memoria sin importar el desperdicio de espacio ");
        System.out.println("\n -- (0) PARA CANCELAR Y SALIR -- \n");

    }
}