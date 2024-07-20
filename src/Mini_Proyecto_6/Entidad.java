/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mini_Proyecto_6;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JProgressBar;

/**
 *
 * @author royum
 */
public class Entidad implements IAtacable {

    private String nombre;
    private int vidaActual, ataque, defensa;
    private double vidaMax;
    private boolean estaVivo;
    private JProgressBar barraVida;

    public Entidad(String nombre, int ataque, int defensa, double vidaMax) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vidaMax = vidaMax;
        vidaActual = (int) vidaMax;
        estaVivo = true;
        barraVida = new JProgressBar(0, (int) vidaMax);
        barraVida.setPreferredSize(new Dimension(150, 25)); //  tamanio de la barra de vida
        establecerVida(vidaActual);

    }

    // establcerVida es para la barra de Vida 
    public void establecerVida(int vida) {

        barraVida.setValue(vida);
        barraVida.setForeground(Color.RED);
        // este metodo hace escribir ese texto de porcentaje de vida
        barraVida.setStringPainted(true);
        barraVida.setString(vidaActual + "/" + (int) vidaMax);
    }

    @Override
    public void atacar(IAtacable enemigo) { // este es de tipo IAtacable ya que la clase que esta atacando es nuestra clase personaje y esta atacando
        // a un objeto  de un clase diferente de la clase Monstruo, por que? porque luego el monstruo no podra atacarnos a nosotros,
        // ya que no podrimso pasarle un heroe como parametro, entonces gracias a la Interfaz todas aquellas clases que implementen
        // esta interfaz podemos pasarlos por parametros  en la llamada al metodo
        enemigo.recibirHerida(ataque);

    }

    // esto lo que hace es calcular si el personaje sigue vivo y establece cuanto daño va recibir 
    // hace la misma resta que hacemos aqui: cantidad - defensa
    // si es negativo la cantidadTotal al menos sera 1
    // y a nuestra vidaActual  se le resta en dano que recibimos al final, despues de todo esto si la vida es 0 o menos pasara a el boleano de esta a vivo a falso
    @Override
    public void recibirHerida(int cantidad) {

        if (estaVivo) {
            int cantidadTotal = cantidad - defensa;
            if (cantidadTotal <= 0) {
                cantidadTotal = 1;
            }
            vidaActual -= cantidadTotal;
            if (vidaActual <= 0) { // si la vidaActul es menor que cero, ahora quiero que aparte que ya no estemos vivos , nuestra vidaActual se igual 0
                estaVivo = false;
                vidaActual = 0; // esot hace que la vida del enemigo no aparesca en neegativo y se quede en cero.
            }

        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public double getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(double vidaMax) {
        this.vidaMax = vidaMax;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public JProgressBar getBarraVida() {
        return barraVida;
    }

}
