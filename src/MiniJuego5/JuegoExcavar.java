/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniJuego5;

import java.util.Scanner;

/**
 *
 * @author royum
 */
public class JuegoExcavar {

    // no queremos que cada objeto tenga su copiar, no queremos que se hagan stancias de ella, por ello usamos static
    private static int derrumbe = 1;
    private static int diamante = 1;

    // lo que encuentre el excavador 
    private int carbon = 0, oro = 0, diamantes = 0;

    private static boolean derrumbado = false;
    private static boolean jugando = true ;

    // ponerlo privado el scanner 
    private Scanner lea = new Scanner(System.in);

    // accedemos este metodo desde la clase main
    public void jugar() {

        // se vaya a repetir 
        while (derrumbado == false && jugando == true) {

            menuEleccion();

        }

        // salimos de este bucle y llamara a otro metodo que se llame final partida
        finalPartida();

    }
    
    private void finalPartida() {
        if (derrumbado == true) {
            System.out.println("\n");
            System.out.println("Perdiste la vida y la partida, por avarooooo xd.");
        } else {

            System.out.println("\n");
            System.out.println("Conseguiste salir a tiempo puto. ");
            System.out.println("Has conseguido " + carbon + " Kilos de carbon. Son " + carbon + " Puntos.");
            System.out.println("Has conseguido " + oro + " Kilos de oro. Son " + oro * 10 + " Puntos.");
            System.out.println("Has conseguido " + diamantes + " diamantes. Son " + diamantes * 50 + " Puntos.");

            int total = carbon + (oro * 10) + (diamantes * 50);

            tablaPuntuacion(total);

        }
    }
    
    private void tablaPuntuacion(int total) {

    System.out.println("Tu puntuacion total es de " + total + " puntos.");

    if (total < 100) {
    System.out.println("Sigues siendo pobre. para nada cabaste JAJAJAJA.");
    } else if (total < 500) {
    System.out.println("Bien encontraste un buena cantidad de material, podras vivir 25 años agusto. ");
    } else {
        System.out.println("Que pije suerte sos bestie de rico. Puedes comprar loo que sea, ni con Elon Musk se te puede compara fockk.");
        }

    }

    //con esto mostrara las 2 opciones que tenemos que son seguir excavando o retirar
    private void menuEleccion() {

        MostarMateriales();
        System.out.println("Elige una opcion: ");
        System.out.println("1. Seguir cabando");
        System.out.println("2. Retirarme");
        int Eleccion = lea.nextInt();

        switch (Eleccion) {

            case 1:
                cavar();
                break;
            case 2:
                jugando = false;
                break;
            default:
                System.out.println("Imbecil, selecciona una opcion valida.");
                break;

        }

    }

    private void cavar() {
        // recasting entero  // con esto generamos un numero aleatorio entre 1 y 100. 
        int derrumbo = (int) (Math.random() * 100 + 1);

        // si ese numero es menor o igual que el que tenemos guardado en la variable "derrumbe" se a derrumbado 
        // osea si sale 1 se derrumba
        if (derrumbo <= derrumbe) {
            derrumbado = true;
            System.out.println("!!OH NOO, se ha derrumbado el tunel ");
        } else {

            // con esto generamos un numero aleatorio entre 1 y 100. 
            int material = (int) (Math.random() * 100 + 1);
            // si el numero que se a generado aqui es menor o igual que la variable "diamante" se ha encontrado diamante
            if (material <= diamante) {
                diamantes++;
                System.out.println("!! Chetttttt has encontrado un diamante. ");
            } // si no, si el numero es menor o igual que 20  mas lo que valga diamante, entonces es oro
            // por que? por que en la primera vuelta encontrar un oro en la tirada de 100 caras  seria entre 1 hasta el 21
            // pero tambien queremos que se aumente esa posibilidad, asi que cuando aumentemos la posibilidad  de encontrar diamante
            // tambien va a aumentar  la posibilidad  de encontrar oro 
            else if (material <= (20 + diamante)) {
                oro++;
                System.out.println("!! Huyyy, encontras oro.");
            } // y asu vez disminuira la probabilidad de encontrar carbon
            else {
                carbon++;
                System.out.println("XD, encontraste carbon.");
            }

            // despues nos queda es aumentar las posibilidades, quiero que cada vez que el jugador cabe derrumbe
            // aumente su valor en 1, por lo que haya mas psosibilidades
            derrumbe++;
            // y que diamante aumente pero 2
            diamante += 2;

        }

    }
          
    private void MostarMateriales() {

        System.out.println(" Carbon: " + carbon + " Oro: " + oro + " Diamantes " + diamantes);

    }

}
