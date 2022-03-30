
package Ejercicios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Convercion_Monedas {
    public static void main(String[] args) {
        
        /* Nos  piden  hacer  un  programa  que  calcule  el  valor 
        de  la  moneda  para  los  siguientes países:  Europa,  Reino  Unido,
        Australia  y  Canadá.  El  programa  tiene  declarada  una variable 
        con  el  valor  $100.00  de  tipo  double  y  tenemos  que  realizar
        la  conversión  de dólares  a  las  monedas  solicitadas. 
        A  continuación  se  muestra  los  valores  de 
        conversión:1 USD    0.70 Europa  0.61 Reino Unido  0.95 Australia  0.97 Canadá
        */
        
        NumberFormat formato=new DecimalFormat("#0.00");
        
     double Dolar,EEUU,Europa,UK,Austria,Canada,conver1,conver2,conver3,conver4,conver5;
        
        Dolar = 100.00;
        EEUU = 1;
        Europa = 0.70;
        UK = 0.61;
        Austria = 0.95;
        Canada = 0.97;
        
        conver1 = 100.00/EEUU;
        conver2 = 100.00/Europa;
        conver3 = 100.00/UK;
        conver4 = 100.00/Austria;
        conver5 = 100.00/Canada;
        
        System.out.println("La Conversion de $100.00 a :|");
        System.out.println("EEUU: "+formato.format(conver1));
        System.out.println("Europa: "+formato.format(conver2));
        System.out.println("UK: "+formato.format(conver3));
        System.out.println("Autria: "+formato.format(conver4));
        System.out.println("Canada: "+formato.format(conver5));
        
        
    }
}
