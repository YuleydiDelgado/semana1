package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Sueldo {
    public static void main(String[] args) {
        
     /*Un  docente  universitario  gana  $8.00  la  hora  de  clase  y  ha 
impartido  36  horas  en  un mes  de  clases.  Debemos  de  calcular  el  salario
del  docente  sabiendo  que  le  van  a descontar el 10% de  la renta. 
¿Cuánto ganara el docente al final de un mes de clases menos el descuento de la renta?
        */
      NumberFormat formato=new DecimalFormat("#0.00");
     double Salario, horas,renta, sueldo,porcentaje;
     
     Salario = 8.00;
     horas = 36;
     renta = 10;
     porcentaje = 100;
    
     Salario = (8.00*36);
     renta = (10*288/100);
     
     
        System.out.println("El docente gana:|" + formato.format(Salario-renta));
        
    }
    
}
