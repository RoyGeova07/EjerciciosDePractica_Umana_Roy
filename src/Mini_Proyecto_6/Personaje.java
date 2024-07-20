/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mini_Proyecto_6;

/**
 *
 * @author royum
 */
public class Personaje extends Entidad {

    private int nivel, oro, exp, expNecesaria;

    public Personaje(String nombre, int ataque, int defensa, double vidaMax) {
        super(nombre, ataque, defensa, vidaMax);

        nivel = 1;
        oro = 0;
        exp = 0;
        expNecesaria = 10;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExp() {
        return exp;
    }

    public void subirNivel() {
        nivel++;
        setAtaque(getAtaque() + 2);
        setDefensa(getDefensa() + 1);
        setVidaMax(getVidaMax() * 1.1);
        getBarraVida().setMaximum((int) getVidaMax());
        setVidaActual((int) getVidaMax());
        establecerVida((int) getVidaMax());
        expNecesaria += (expNecesaria + 5);

    }

    public void subirExp(int cantidad) {
        exp += cantidad;
        while (exp >= expNecesaria) {
            subirNivel();
        }
    }

    public int getExpNecesaria() {
        return expNecesaria;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

}
