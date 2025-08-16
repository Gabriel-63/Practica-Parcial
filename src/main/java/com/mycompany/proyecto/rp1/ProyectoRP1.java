package com.mycompany.proyecto.rp1;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class ProyectoRP1 {

    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        float s;
        int n=1;
        do{
            System.out.println("ingese un sueldo ");
            s=lector.nextFloat();
            if(s>7000){
                System.out.println("Exelente sueldo ");
            }else if(s>=4000 & s<=7000){
                System.out.println("Sueldo Bueno");
            }else if(s<4000 & s>0){
                System.out.println("Necesita un aumento");
            }else {
                System.out.println("Ingrese un valor valido");
            }
        n=n+1;
        }while(n<=15);
    }
}
