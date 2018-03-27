/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author soib1a04
 */
public class Ejemplos {

    public static void contarCharRepe() {
        String linea = "nbbnbnbnbncndfhrñoy";
        int posicion = 0;
        int repes = 0;
        int letras = 0;
        char caracter = 'b';
        letras = linea.length();

        while (posicion < letras) {

            if (linea.charAt(posicion) == caracter) {
                repes++;
            }
            posicion++;
        }
        System.out.println("La letra "+ caracter+" se repite "+repes+" veces en la frase "+linea);
    }

    public static void contarStringRepe() {
        String linea = "nbbnbnbnbncndfhrñoy";
        int posicion = 0;
        int repes = 0;
        int letras = 0;
        String linea2 = "ab";
        letras = linea.length();

        while (posicion < letras) {

            if (linea.charAt(posicion) == linea2.charAt(1)) {
                posicion++;
                if (linea.charAt(posicion) == linea2.charAt(2)) {
                    repes++;
                }
                posicion++;
            }
            System.out.println("Las letras " + linea2 + " se repiten " + repes + " veces en la frase " + linea);
        }
    }
           
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        contarStringRepe();// TODO code application logic here
    }

}
