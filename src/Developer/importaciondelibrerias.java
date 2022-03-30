package Developer;

import java.text.DecimalFormat;
import java.text.NumberFormat;


public class importaciondelibrerias {
    public static void main(String[] args) {
        NumberFormat formato = new DecimalFormat("#0.00");
        //Declarar variables
        double area, radio;
        final double pi = 3.1416;
        area = 145;
        //uso de variables
        radio= Math.sqrt(area/pi); 
        System.out.println("Rdio: " + formato.format(radio) + "cm");
    }
    
}