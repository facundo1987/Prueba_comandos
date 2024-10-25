/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author 46390835
 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Creo el objeto input de la clase Scanner 
        // Creo el objeto random de la clase Random
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int furia_del_twister = random.nextInt(10);

        // Defino las variables
        String[] refugios = new String[3];
        refugios[0] = "subterraneo";
        refugios[1] = "Montaneas";
        refugios[2] = "Bosque";

        String[] inventario_del_usuario = new String[5];

        String[] suministros_clave = new String[10];
        suministros_clave[0] = "Manta termica";
        suministros_clave[1] = "Encendedor";
        suministros_clave[2] = "Comida enlatada";
        suministros_clave[3] = "Botiquin basico";
        suministros_clave[4] = "Kit primero auxilios";
        suministros_clave[5] = "Linterna";
        suministros_clave[6] = "Radio";
        suministros_clave[7] = "Filtro de agua";
        suministros_clave[8] = "Cobija";
        suministros_clave[9] = "Herramientas";

        int opcion_refugio;
        boolean es_seguro;

        // Bucle while infinito para modo multijugador
        int numero_jugador = 0;
        
        while (true) {
        numero_jugador = numero_jugador + 1;
        // Menu de bienvenida con los refugios utilizando for
            System.out.println("Bienvenido jugador " + numero_jugador + " a Sobreviviendo al Twister ");
            System.out.println("Seleccione un refugio");
            for (int i = 0; i < refugios.length; i++) {
                System.out.println((i + 1) + " ---- " + refugios[i]);

            }

            // Guardo el refugio en una variable
            opcion_refugio = input.nextInt();
            String refugio_usuario = refugios[opcion_refugio - 1];
            System.out.println("Gracias el refugio seleccionado es " + refugio_usuario);
            System.out.println("//////////////////////////////////////////////////////");

            //Recoleccion de suministros primero muestro la lista
            System.out.println("A Continuacion se muestran los suministros encontrados");

            for (int i = 0; i < suministros_clave.length; i++) {
                System.out.println((i + 1) + " ----- " + suministros_clave[i]);

            }

            // Luego guardo lo ingresado por el usuario en una lista
            int contador = 0;
            int contador_espacio_libre = 5;
            do {

                System.out.println("Seleccione un suministro  ");
                int opcion_suministro = input.nextInt();

                inventario_del_usuario[contador] = suministros_clave[opcion_suministro - 1];
                contador = contador + 1;
                System.out.println("le quedan " + (contador_espacio_libre - 1) + " lugares disponibles ");
                contador_espacio_libre = contador_espacio_libre - 1;

            } while (contador <= 4);

            System.out.println("/////////////////////////////////////");

            // recorro la lista con un for para mostrar lo que contiene
            System.out.println("su inventario contiene ");
            for (int i = 0; i < inventario_del_usuario.length; i++) {

                System.out.println(inventario_del_usuario[i]);

            }
            // Defino de manera aleatoria cual es el elemento clave 
            String fortalecer_refugio = suministros_clave[furia_del_twister];

            // Con un For recorro la lista para ver si esta el elemento clave
            for (int i = 0; i < inventario_del_usuario.length; i++) {

                if (inventario_del_usuario[i].equals(fortalecer_refugio)) {

                    es_seguro = true;
                    System.out.println("Felicitaciones se fortalecio su refugio ");
                    break;
                } else {
                    es_seguro = false;
                }
                if (!es_seguro && i == 4) {
                    System.out.println("No contiene suministro clave, refugio no seguro!! ");

                }
            }
        }
    }

}
