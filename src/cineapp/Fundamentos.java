package cineapp;

//import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Fundamentos {
    
   // public static int numeros[] = new int[15];
    public static int numeros[] = {12,1,2,3,4,5,6,7,8,10,9,9,11,5,6};
    
    public static void main(String[] args) {
        //operar();
        ordenar();
    }
//    
//    public static void operar(){
//    
//        for (int i = 0; i < numeros.length; i++) {
//           numeros[i] = leerEntero("Ingresar un número");
//        }
//    }
    
//   public static int leerEntero(String solicitud){
//     int dato =  Integer.parseInt(JOptionPane.showInputDialog(solicitud));
//   return dato;}
//   
   public static void ordenar(){
   boolean success = true;
   int temp, realizo=0;
   
       while(success) { 
           
//           for (int i = 0; i < (numeros.length-1); i++) {
//               
//               if (numeros[i] >= numeros[i+1]) {
//                   temp = numeros[i];
//                   numeros[i] = numeros[i+1];
//                   numeros[i+1] = temp;
//                   realizo=1;
//               }
//               else{
//               realizo =0;
//               }
//           }

           for (int i = 0; i < 10; i++) {
               
           }
           
           success = realizo>0; //Determinar el valor del boolean
       }
       
       for (int i = 0; i < numeros.length; i++) {
           System.out.println("Dato--" + numeros[i]);
       }
   
   }
}
