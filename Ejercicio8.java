/**
 * @author Fabian Andres Gomez Calva
 */

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contrasena;

        do {

            System.out.print("Ingrese la contrasena: ");
            contrasena = sc.nextLine();

        } while (!contrasena.equals("java2026"));

        System.out.println("Acceso concedido");

    }
}