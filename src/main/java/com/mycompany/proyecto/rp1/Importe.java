package com.mycompany.proyecto.rp1;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Importe {
    public static void main(String[] args){
        Scanner lector=new Scanner(System.in);
        String tipo;
        double c, to;
        System.out.println("ingrese tipo de gasolina");
        System.out.println("A=Magma");
        System.out.println("B=Premium");
        System.out.println("C=Diesel");
        tipo=lector.next();
        System.out.println("Ingrese cantidad consumida en litros");
        c=lector.nextDouble();
        if (tipo.equals('A')){
            System.out.println("Tipo de gasolina selecionada: Premium ");
            to=c*7;
            System.out.println("La cantidad a pagar es de $"+to);
        }else if(tipo.equals('B')){
            System.out.println("Tipo de gasolina selecionada: Premium ");
            to=c*7.5;
            System.out.println("La cantidad a pagar es de $"+to);
        }else if(tipo.equals('B')){
            System.out.println("Tipo de gasolina selecionada: Diesel ");
            to=c*5;
            System.out.println("La cantidad a pagar es de $"+to);
        }
    }
}
