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
public class Ejercicio3PedirLimitesIntervaloYEscribirNumeros {
public static void main(String []args){
int ini,fin,num,suma=0,cont=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el inicio del intervalo");
        ini=sc.nextInt();
        System.out.println("Introduzca el final del intervalo");
        fin=sc.nextInt();
        while(ini>=fin){
            System.out.println("Número menor al inicio del intervalo, introdúzcalo de nuevo");
            System.out.println("Introduce el final del intervalo");
            fin=sc.nextInt();
        }
        do{
            System.out.println("Número:");
            num=sc.nextInt();
            if(num==ini){
                System.out.println("Igual al inicio del intervalo");
            }else if (num==fin){
               System.out.println("Igual al final del intervalo");  
            }
            else if(num>ini&&num<fin){
                suma+=num;
            } else if(num!=0){
                cont++;
            }
        }while(num!=0);
        System.out.println("La suma es " + suma);
        System.out.println("Hay " + cont + " fuera del parametro");
    }

    
    
    
    
}    

