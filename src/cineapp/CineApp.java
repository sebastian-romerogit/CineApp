package cineapp;

import javax.swing.JOptionPane;

/**
 *
 * @author SR
 */
public class CineApp {

    public static String menu = "\n 1. vender silleteria"
            + " \n 2. Mostrar estado de la sala"
            + "\n 3. Mostrar venta de la funciones"
            + "\n 4. Nueva función";

    public static int sillas[] = new int[100];

    public static void main(String[] args) {
        int respuesta = operar();
        System.out.println(respuesta);
        
        while (respuesta == 0) {
            int opcion = funcion();
            switch (opcion) {

                case 1:
                    System.out.println("ok1");
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        }

    }

    public static int funcion() {

        int opcion = datoEntero("Seleccione una opción " + menu);

        return opcion;
    }

    public static String dato(String solicitud) {
        String dato = JOptionPane.showInputDialog(solicitud);
        return dato;
    }

    public static int datoEntero(String solicitud) {
        int dato = Integer.parseInt(JOptionPane.showInputDialog(solicitud));
        return dato;
    }
    
    public static int operar(){
    int dato = JOptionPane.showConfirmDialog(null, "¿Desea realizar una nueva operación?",null, JOptionPane.YES_NO_OPTION);
    return dato;}

}
