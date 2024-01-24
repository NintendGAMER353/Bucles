/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntregaBucles;

import java.util.Scanner;

/**
 *
 * @author pfran
 */
public class Ejercicio1CalcularHipotenusaConValoresCatetos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor del primer cateto");
        double c1 = sc.nextDouble();
        if (c1 <= 0) {
            System.out.println("No válido, introduzca un valor mayor que 0");
            while (c1 <= 0) {
                c1 = sc.nextDouble();
                if (c1 <= 0) {
                    System.out.println("No válido, introduzca un valor mayor que 0");
                }
            }
            System.out.println("Valor válido");
        }
        System.out.println("Introduzca el valor del segundo cateto");
        double c2 = sc.nextDouble();
        if (c2 <= 0) {
            System.out.println("No válido, introduzca un valor mayor que 0");
            while (c2 <= 0) {
                c2 = sc.nextDouble();
                if (c2 <= 0) {
                    System.out.println("No válido, introduzca un valor mayor que 0");
                }
            }
            System.out.println("Valor válido");
        }
        double hip = Math.sqrt((c1 * c1) + (c2 * c2));
        System.out.println("La hipotenusa es " + hip);

    }
}
