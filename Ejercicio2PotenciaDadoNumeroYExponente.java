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
public class Ejercicio2PotenciaDadoNumeroYExponente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número (Real)");
        double n = sc.nextDouble();
        System.out.println("Introduzca un exponente (Entero)");
        int e = sc.nextInt();
        int cont = 0;
        double pow = 1;
        while (cont < e) {
            pow = pow * n;
            cont++;
        }
        System.out.println(pow);

    }
}
