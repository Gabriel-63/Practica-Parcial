package com.mycompany.proyecto.rp1;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */

public class IMC {
    public static void main(String[] args) {
        Double p, a, imc;
        Scanner lector=new Scanner(System.in);
        System.out.println("ingrese su peso en Kilogramos ");
        p=lector.nextDouble();
        System.out.println("igrese su altura en metros ");
        a=lector.nextDouble();
        imc= p /(a*a);
        if(imc<16){
            System.out.println("Criterio de ingreso en hospital");
        } else if(imc>=16 & imc<17 ){
            System.out.println("infrapeso");
        }else if(imc>=17 & imc<=18 ){
            System.out.println("infrapeso");
        }else if(imc>18 & imc<=25 ){
            System.out.println("peso normal");
        }else if(imc>25 & imc<=30 ){
            System.out.println("sobrepeso (obesidad grado I)");
        }else if(imc>31 & imc<=35 ){
            System.out.println("sobrepeso cronico (obesidad grado II)");
        }else if(imc>35 & imc<=40 ){
            System.out.println("obesidad premorbida (obesidad grado III)");
        }else if(imc>40){
            System.out.println("obesidad morbida (obesidad grado IV)");
        }
        System.out.println("IMC: "+imc);
    }
}
