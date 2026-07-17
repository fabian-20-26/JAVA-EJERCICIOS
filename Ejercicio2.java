/**
 * @author Fabian Andres Gomez Calva
 */
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextInt();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicacion: " + (num1 * num2));
        System.out.println("Division: " + ((double) num1 / num2));
        System.out.println("Residuo: " + (num1 % num2));
    }
}