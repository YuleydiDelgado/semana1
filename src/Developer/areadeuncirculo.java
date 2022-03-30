package Developer;

public class areadeuncirculo {
    public static void main(String[] args) {
        //Declaracion de variables
        double area, radio;
        final double pi = 3.1416; //La palabra final indica que ese valor de la variable no cambiara
        //  Inicializacion de variables
        area = 145;
        //Uso de variables 
        radio = Math.sqrt(area/pi); //Calcular la raiz cuadrada con la funcion Math.sqrt
        System.out.println("Radio: " + radio + "cm");
        
    }
    
}