/**
 * @author Fabian Andres Gomez Calva
 */

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int cantidad = 0;
        int suma = 0;

        do {

            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                cantidad++;
                suma = suma + numero;
            }

        } while (numero >= 0);

        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

    }
}