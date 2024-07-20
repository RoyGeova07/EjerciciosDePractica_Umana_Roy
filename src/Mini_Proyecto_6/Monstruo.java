/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mini_Proyecto_6;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author royum
 */
// heredar de entidad xddd 
public class Monstruo extends Entidad {

    private int premioOro;
    private int premioExp;

    private JLabel etNombre, imagen;

    // nombres de los mounstruos de nivel Facil
    private static String[] nombresFacil = {"Lobo", "Esqueleto", "Zombie"};
    private static String[] nombresMedio = {"Troll", "Golem", "Gargola"};
    private static String[] nombresDificil = {"Brujo", "Momia", "Demonio"};

    // contructor de la clase padre
    public Monstruo(String nombre, int ataque, int defensa, double vidaMax, String dificultad) {
        super(nombre, ataque, defensa, vidaMax);

        etNombre = new JLabel(nombre);
        etNombre.setFont(new Font("Robto", Font.BOLD, 20));
        String rutaAImagen = "src/Mini_Proyecto_6/Imagenes/" + nombre.toLowerCase() + ".png";
        imagen = new JLabel();
        imagen.setIcon(new ImageIcon(rutaAImagen));

        switch (dificultad) {

            case "facil":
                premioExp = (int) (Math.random() * 2 + 1); // lo que nos genera de experiencia nos da a 1 o 2 de exp
                premioOro = (int) (Math.random() * 5 + 1);
                etNombre.setForeground(Color.GREEN);
                break;
            case "Medio":
                premioExp = (int) (Math.random() * 6 + 2); // lo que nos genera de experiencia nos da a 1 o 2 de exp
                premioOro = (int) (Math.random() * 20 + 1); // minimo 1 y maximo 20
                etNombre.setForeground(Color.YELLOW);
                break;
            case "Dificil":
                premioExp = (int) (Math.random() * 16 + 5); // lo que nos genera de experiencia nos da a 1 o 2 de exp
                premioOro = (int) (Math.random() * 50 + 1); // minimo 1 y maximo 20
                etNombre.setForeground(Color.RED);
                break;
            default:
                premioExp = 500; // lo que nos genera de experiencia nos da a 1 o 2 de exp
                premioOro = 1000; // minimo 1 y maximo 20
                etNombre.setForeground(Color.ORANGE);
                break;
        }

    }

    public static Monstruo generarMonstruo(int itera) { // a mas exploraciones hagamos mas dificil se vuelve.

        Monstruo m;

        // este numero va servir para generar un monstruo de nuestro array
        int nMonstruo = (int) (Math.random() * 3); // 0 y 2
        int nVida = (int) (Math.random() * 30); // entre 0 y 30
        int nAtaque = (int) (Math.random() * 5); // entre 0 y 5
        int nDefensa = (int) (Math.random() * 2); // entre 0 y 1

        // este numero se genera en "decidirDificultad"
        if (itera < 80) { // siempre en est if los monstruo seran de niveles faciles
            m = new Monstruo(nombresFacil[nMonstruo], nAtaque + 1, nDefensa, nVida + 15, "facil");
        } else if (itera < 140) {
            m = new Monstruo(nombresMedio[nMonstruo], nAtaque + 4, nDefensa + 2, nVida + 30, "Medio");
        } else if (itera < 200) {
            m = new Monstruo(nombresDificil[nMonstruo], nAtaque + 8, nDefensa + 5, nVida + 80, "Dificil");
        } else {
            m = new Monstruo("Jefe", nAtaque + 15, nDefensa + 10, nVida + 150, "Jefe");
        }

        return m;

    }

    public int getPremioOro() {
        return premioOro;
    }

    public int getPremioExp() {
        return premioExp;
    }

    public JLabel getEtNombre() {
        return etNombre;
    }

    public JLabel getImagen() {
        return imagen;
    }
}
