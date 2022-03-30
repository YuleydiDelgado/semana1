
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Estudiante {
    public static void main(String[] args) {
        
        /*Un estudiante de del ITCA tiene 5 evaluaciones en cada ciclo de estudio.
        La  primera  evaluación  tiene  una  ponderación del  25%  de  la  nota 
        final,   la segunda evaluación tiene un 15% de la nota final, la tercera
        evaluación tiene un 15% de la nota final, la cuarta evaluación
        tiene un 20% del valor de la nota final y la quinta evaluación tiene 
        un 25% del valor de la nota final. Si el estudiante obtuvo las siguientes
        calificaciones:Parcial 1: 8.0  Parcial 2: 7.5  Parcial 3: 9.0  
        Parcial 4: 8.0  Parcial 5: 9.0¿Cuál sería el promedio final del
        estudiante al final del ciclo?*/
        
         NumberFormat formato=new DecimalFormat("#0.00");
         
         double Estudiante,evalu1,evalu2,evalu3,evalu4,evalu5,notaFinal,parcial,
                 parcial2,parcial3,parcial4,parcial5;
         
         evalu1 = 25;
         evalu2 = 15;
         evalu3 = 15;
         evalu4 = 20;
         evalu5 = 25;
         
         parcial = 25*8.0/100;
         parcial2 = 15*7.5/100;
         parcial3 = 15*9.0/100;
         parcial4 = 20*8.0/100;
         parcial5 = 25*9.0/100;
         
         notaFinal = (2.00 + 1.12 + 1.35 + 1.60 + 2.25);
         
         System.out.println("parcial 1:|" + formato.format(parcial));
         System.out.println("parcial 2:|" + formato.format(parcial2));
         System.out.println("parcial 3:|" + formato.format(parcial3));
         System.out.println("parcial 4:|" + formato.format(parcial4));
         System.out.println("parcial 5:|" + formato.format(parcial5));
         System.out.println("Nota Final:|" + formato.format(notaFinal));
    }
}