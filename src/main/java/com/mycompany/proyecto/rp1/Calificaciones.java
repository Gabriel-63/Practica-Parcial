package com.mycompany.proyecto.rp1;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class Calificaciones {
     public static void main(String[] args) {
         Scanner lector=new Scanner(System.in);
         int i=1;
         double n, c1=0, c2=0 ,c3=0, t1=0, t2=0, t3=0, tc, tn, p3, pt;
         System.out.println("ingrese sus 15 notas ");    
         do{       
             n=lector.nextDouble();
             if (n>0 & n<=40){
                 c1 = c1 + 1;
                 t1 = t1 + n;
             } else if (n>40 & n<=70){
                 c2 = c2 + 1;
                 t2 = t2 + n;
             } else if (n>70 & n<=100){
                 c3 = c3 + 1;
                 t3 = t3 + n;
             }else{
                 System.out.println("ingrese una nota valida");
             }
         i=i+1;
         }while(i<=15);
         tc= c1+c2+c3;
         tn = t1+t2+t3;
         p3 = t3 / c3;
         pt = tn / tc;
         System.out.println("cantidad de notas que están entre 0 y 40 puntos: "+c1);
         System.out.println("cantidad de notas que están entre 41 y 70 puntos: "+c2);
         System.out.println("cantidad de notas que están entre 71 y 100 puntos: "+c3);
         System.out.println("suma de las notas que están entre 0 y 40 puntos: "+t1);
         System.out.println("suma de las notas que están entre 41 y 70 puntos: "+t2);
         System.out.println("suma de las notas que están entre 71 y 100 puntos: "+t3);
         System.out.println("cantidad total de notas ingresadas: "+tc);
         System.out.println("suma total de tadas las notas ingresadas: "+tn);
         System.out.println("Promedio de las notas ingresadas entre 71 y 100 puntos: "+p3);
         System.out.println("Promedio de todas las notas ingresadas: "+pt);  
     }
}
