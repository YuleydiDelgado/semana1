package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class AFP {
     public static void main(String[] args) {
         /*Si un trabajador de la empresa privada está afiliado a las AFP
y los porcentajes que se paga a las AFP es de 6% por parte del trabajador y 6.5%
por parte del  empleador, si el empleado gana $500 al mes,¿Cuánto está pagando a
la AFP el trabajador en concepto de empleado y de empleador?*/
         
         NumberFormat formato=new DecimalFormat("#0.00");
         
         double AFP, trabajador,salario, empleado, empleador;
         
         AFP = 0.6;
         trabajador = 6.5;
         empleado = 500;
         
         trabajador = (6*500/100);
         empleador = (6.5*500/100);
         
         System.out.println("trabajador:|" + formato.format(trabajador));
          System.out.println("empleador:|" + formato.format(empleador));
         
         
         
         
     }
    
}