package cineapp;

import javax.swing.JOptionPane;

/**
 *
 * @autor SR
 * @email juans.romero@uqvirtual.edu.co
 * @universidad Universidad Quindío
 */
public class Juego {

    public static void main(String[] args) {
        controlar();
        elegir();
    }

    public static int cartas[] = new int[48];
    public static int cartasElegidas[] = new int[48];
    public static int posicion = 0;

    public static boolean exito = true;

    public static void controlar() {

        while (exito) {
            int contador = 0;

            int numero = (int) (Math.random() * 12) + 1;

            for (int i = 0; i < cartas.length; i++) {
                if (cartas[i] == numero) {
                    contador++;
                }
            }

            if (contador < 4) {
                System.out.println("--" + posicion);
                System.out.println(cartas[posicion] = numero);
                posicion++;
                if (posicion >= cartas.length) {
                    exito = false;
                }
            }

        }

    }

    public static void elegir() {
        int elegidas = 0, total = 0;
        String estado;
        exito = true;

        while (exito) {
            estado = estadoCartas();
            int carta = datoNumerico(estado + "\n Seleccione una carta");
            cartasElegidas[carta] = cartas[carta];
            elegidas++;

            if (elegidas == 3) {
                estado = estadoCartas();
                int respuesta = datoNumerico(estado + "\n ¿Desea una nueva carta? \n 1.Sí \n 2.No");

                if (respuesta == 1) {
                    carta = datoNumerico(estado + "\n Seleccione una carta");
                    cartasElegidas[carta] = cartas[carta];
                } else {

                    exito = false;
                }
            }
        }

        for (int i = 0; i < cartasElegidas.length; i++) {

            total += cartasElegidas[i];

        }

        if (total == 21) {
            imprimir("¡Ha ganado! \n Su puntaje es de: " + total);
        } else {
            imprimir("¡Ha perdido! \n Su puntaje es de: " + total);
        }

    }

    public static int datoNumerico(String solicitud) {
        int dato = Integer.parseInt(JOptionPane.showInputDialog(solicitud));
        return dato;
    }

    public static String dato(String solicitud) {
        String dato = JOptionPane.showInputDialog(solicitud);
        return dato;
    }

    public static void imprimir(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static String estadoCartas() {
        String estado = "X  0 1 2 3 4 5 6 7 8 9";
        int id = 0;
        for (int i = 0; i < cartasElegidas.length; i++) {
            if (i % 10 == 0) {

                estado += "\n" + id + "| ";
                id++;
            }
            estado += cartasElegidas[i] + " ";
        }
        return estado;
    }

}
