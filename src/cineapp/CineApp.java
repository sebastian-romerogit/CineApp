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
            + "\n 4. Nueva función"
            + "\n 5. Mostrar el mayor"
            + "\n 6. Mostrar el menor"
            + "\n 7. Mostrar orden de usuarios";

    // public static int sillas[] = new int[100];
    
    public static int sillas[] = new int[100];
    public static int sillasOrden[] = new int[100];
    
    public static int numeros[] = {};

    public static int menor = 0; //Variable para almacenar el menor del cine
    public static int mayor = 0; //Variable para almacenar el mayor del cine
    public static int posicion = 0; //Variable global para almacenar posición del menor actual

    public static void main(String[] args) {
        int respuesta = 0;

        //Ejecución de operaciones
        while (respuesta == 0) {
            int opcion = funcion();
            switch (opcion) {

                case 1:
                    silleteria();
                    respuesta = operar();
                    break;

                case 2:
                    String estado = estadoSala();
                    JOptionPane.showMessageDialog(null, estado);
                    respuesta = operar();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    mayor();
                    respuesta = operar();
                    break;

                case 6:
                    menor();
                    respuesta = operar();
                    break;
                case 7:
                    ordenar();
                    respuesta = operar();
                    break;
            }
        }

    }

    //Mpetodo para elegir operación a realizar
    public static int funcion() {

        int opcion = datoEntero("Seleccione una opción " + menu);

        return opcion;
    }

    //Método para reservar una silla
    public static void silleteria() {
        String estado = estadoSala();
        int silla = datoEntero("¿Qué silla desea \n" + estado);

        sillas[silla] = datoEntero("Ingrese su cedula");

    }

    //Método para ordenar cédulas en segundo arreglo
    public static void ordenar() {
        //int temp;

        for (int i = 0; i < sillas.length; i++) {
            menor = 0;
            posicion = 0;
            menor(); //Método de encontrar el menor en arreglo principal
            sillasOrden[i] = menor; //Asignación de valor
            sillas[posicion] = 0;
        }

//        for (int i = 0; i < sillasOrden.length; i++) {
//            System.out.println("--" + sillasOrden[i]);
//        }
        //Variable para llevar conteo de datos ingresados
        //Reemplazar valor por 0

    }

    public static void mayor() {
        int temp;

        for (int i = 0; i < sillas.length; i++) {
            if (sillas[i] != 0) {
                mayor = sillas[i];
                posicion = i;
                break;
            }
        }

        for (int i = posicion; i < sillas.length; i++) {
            if (sillas[i] != 0) {
                temp = sillas[i];
                if (mayor > temp) {
                    mayor = temp;
                    posicion = i;
                }
            }

        }
        JOptionPane.showMessageDialog(null, "El usuario mayor está en la posición: " + posicion + "\n Su cédula es: " + mayor);

    }

    public static void menor() {
        int temp;

        for (int i = 0; i < sillas.length; i++) {
            if (sillas[i] != 0) {
                menor = sillas[i];
                posicion = i;
                break;
            }
        }

        for (int i = posicion; i < sillas.length; i++) {
            if (sillas[i] != 0) {
                temp = sillas[i];
                if (menor < temp) {
                    menor = temp;
                    posicion = i;
                }
            }

        }
        if (menor != 0) {

            JOptionPane.showMessageDialog(null, "El usuario menor está en la posición: " + posicion + "\n Su cédula es: " + menor);
        }

    }

    public static String estadoSala() {
        String estado = "X  0 1 2 3 4 5 6 7 8 9";
        int id = 0;
        for (int i = 0; i < sillas.length; i++) {
            if (i % 10 == 0) {

                estado += "\n" + id + "| ";
                id++;
            }
            estado += sillas[i] + " ";
        }
        return estado;
    }

    //Método para solicitar un dato de tipo String
    public static String dato(String solicitud) {
        String dato = JOptionPane.showInputDialog(solicitud);
        return dato;
    }

    //método para solicitar dato de tipo entero
    public static int datoEntero(String solicitud) {
        int dato = Integer.parseInt(JOptionPane.showInputDialog(solicitud));
        return dato;
    }

    //Método para preguntar si seguir en la app
    public static int operar() {
        int dato = JOptionPane.showConfirmDialog(null, "¿Desea realizar una nueva operación?", null, JOptionPane.YES_NO_OPTION);
        return dato;
    }

}
