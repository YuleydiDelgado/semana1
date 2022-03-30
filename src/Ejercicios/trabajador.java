
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class trabajador {
    public static void main(String[] args) {
        /* Un trabajador de la industria de la construcción gana $10 diarios 
en su jornada normal de  trabajo.  En  ciertas  ocasionesel  empleado  tiene 
que  trabajar  horas extras  para cumplir con su trabajo. En el mes a acumulado
50 horas extras que se la pagan al 10% del valor del pago diario. ¿Cuánto ganara
el trabajador al final de un mes de trabajo? Tomar en consideración que al
trabajador le descontaran el 10% en concepto de renta.*/
        
        NumberFormat formato=new DecimalFormat("#0.00");
        
        double trabajador, horasE, extra, renta, Mtrabajado;
        
        trabajador = 10;
        horasE = 50;
        extra = 10;
        renta = 10;
        
        Mtrabajado = ((10*50)+(10*500/100));
        
        
        System.out.println("El trabajador gana:|" + formato.format(Mtrabajado));
    }
}

