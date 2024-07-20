/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mini_Proyecto_6;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author royum
 */
public class Exploracion {

    private JDialog marco;

    private JPanel panelPrincipal, panelSuperior, panelInferior, panelMonstruo, panelMonstruoSec;

    private JButton botAtacar, botHuir;

    private JTextArea infoExploracion;
    private JScrollPane barraDes;

    private Personaje pj;

    private Monstruo enemigo;

    private static int numExploracion = 0; // este se encarga si nuestor combate seria facul, medio, dificil, hasta el jefe.

    private VentanaPrincipal vp; // hacemos una instancia  de VentanaPrincipal en un variable  de la clase para actualizar las etiquetas 

    private boolean esJefe = false;

    public Exploracion(VentanaPrincipal vp) {

        this.vp = vp;

        pj = vp.getPj();

        marco = new JDialog();

        panelPrincipal = new JPanel(new BorderLayout());
        panelSuperior = vp.getPabelSup();
        panelInferior = new JPanel();
        panelMonstruo = new JPanel(); // agregar boxLayout si no dara error
        panelMonstruoSec = new JPanel();

        infoExploracion = new JTextArea();
        infoExploracion.setEditable(false);
        barraDes = new JScrollPane(infoExploracion);
        barraDes.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // este establece una politica de desplazamiento, sino saldria una barra toda rarita ahi

        botAtacar = new JButton("Atacar");
        botHuir = new JButton("Huir (gei)");

    }

    public void comenzarExploracion() {

        decidirDificultad();
        montarInterfaz();

    }

    private void decidirDificultad() {

        int numAle = (int) (Math.random() * 100) + numExploracion;

        numExploracion++;

        enemigo = Monstruo.generarMonstruo(numAle); // aqui guardamos un monstruo
        // ahora aqui instanciamos un objeto de la clase Monstruo

        if (enemigo.getNombre().equals("Jefe")) {
            esJefe = true;
        }

    }

    private void montarInterfaz() {

        // panel Superior Listo.
        // anadimos el area del texto al panel principal
        panelPrincipal.add(barraDes, BorderLayout.CENTER);

        // tenemos que anadir lo del monstruo.
        panelMonstruoSec.add(enemigo.getEtNombre());
        panelMonstruoSec.add(enemigo.getBarraVida());

        panelMonstruo.setLayout(new BoxLayout(panelMonstruo, BoxLayout.Y_AXIS));
        panelMonstruo.add(enemigo.getImagen());
        panelMonstruo.add(panelMonstruoSec);

        // elaboramos panel Inferior con sus Botones.
        botAtacar.addActionListener(e -> atacar());
        botHuir.addActionListener(e -> {
            numExploracion++; // si huimos tendremos un castigo donde ahora nos saldra enemigos mas dificiles.
            marco.dispose();
        }); // volver a la ventana principal

        panelInferior.add(botAtacar);
        panelInferior.add(new JLabel("         "));
        if (esJefe) {
            botHuir.setEnabled(false);
        }
        panelInferior.add(botHuir);

        // anadimos los paneles secundarios  al panel principal;
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);
        panelPrincipal.add(panelMonstruo, BorderLayout.EAST);

        marco.add(panelPrincipal);
        marco.setSize(650, 500);
        marco.setLocationRelativeTo(null);
        marco.setModal(true); // este modal hace que no nos permite clickear en las ventanas de atras de esa misma aplicacion, hasta que esta se cierre
        marco.setUndecorated(true);
        marco.setVisible(true);

    }

    private void atacar() {

        int dano;

        // bloque donde el herore ataca
        pj.atacar(enemigo);    // se usa esto porque si hay algo escrito yo no quiero que se borre lo que haya escrito, para que aparesca un nuevo texto
        infoExploracion.setText(infoExploracion.getText() + pj.getNombre()
                + " ataca con una fuerza de " + pj.getAtaque() + ".\n"); // este metodo nos permite establecer un texto en ese area de texto.

        dano = pj.getAtaque() - enemigo.getDefensa();
        if (dano <= 0) {
            dano = 1; // si en algun momento restar la defensa al ataque nos da un numero negativo, yo quiero que ese numero sea 1, porque al menos se va a hacer siempre 1 de dano, da igual la defensa que tenga.
        }
        infoExploracion.setText(infoExploracion.getText() + enemigo.getNombre()
                + " a recibido " + dano + " de daño gracias a su defensa.\n\n");
        // establecemos la vida del enemigo.
        enemigo.establecerVida(enemigo.getVidaActual());
        //comprobamos si el enemigo sigue vivo o no, queremos saber si esta muerto
        if (!enemigo.isEstaVivo()) {
            enemigoDerrotado(); // bloque donde el heroe ataca 

            // bloque donde el enemigo nos ataca
        } else {
            enemigo.atacar(pj); // aqui el enemigo nos ataca a nosotros
            infoExploracion.setText(infoExploracion.getText() + enemigo.getNombre()
                    + " ataca con una fuerza de " + enemigo.getAtaque() + ".\n");
            dano = enemigo.getAtaque() - pj.getDefensa();
            if (dano <= 0) {
                dano = 1;
            }
            infoExploracion.setText(infoExploracion.getText() + pj.getNombre()
                    + " a recibido " + dano + " de daño gracias a su defensa.\n\n");
            // establecer vida de nuestro personaje.
            pj.establecerVida(pj.getVidaActual()); // bloque donde el enemigo nos ataca 

            // comprobar si hemos sido derrotados o no.
            if (!pj.isEstaVivo()) {
                derrota();
            }

        }

    }

    // este metodo lo vamos a utilizar para actualizar nuestro heroe subirle  el oro y la experiencia  que gana, comprobar si sube de nivel
    private void enemigoDerrotado() {

        botAtacar.setEnabled(false); // este se usa para bloquear los botones 
        botHuir.setText(" Salir ");

        // queremos que cuando el enemigo sea derrotado nos suba nuestro oro, experiencia y que comprobemos si tenemos que subir de nivel o no.
        infoExploracion.setText(infoExploracion.getText() + enemigo.getNombre() + " ha sido derrotado.\n"
                + " Haz obtenido " + enemigo.getPremioOro() + " oro.\n"
                + " Ganas " + enemigo.getPremioExp() + " Puntos de experiencia.");

        // ahora le vamos a ir subiendo esos atributos a nuestro heroe.
        pj.subirExp(enemigo.getPremioExp());
        vp.getEtExp().setText(" Exp: " + pj.getExp() + " / " + pj.getExpNecesaria()); // aqui se actualiza la experiencia 
        vp.getEtNivel().setText(" Lvl: " + pj.getNivel()); // aqui subimos de nivel.
        vp.getEtAtributos().setText(" Ataque " + pj.getAtaque() + " | Def: " + pj.getDefensa() + "  Vida: ");

        pj.setOro(pj.getOro() + enemigo.getPremioOro());
        vp.getEtOro().setText(" Oro: " + pj.getOro());

        if (esJefe) {

            VentanaFinal v = new VentanaFinal(VentanaFinal.VICTORIA, pj);
            v.abrir();

        }

    }

    private void derrota() {

        VentanaFinal v = new VentanaFinal(VentanaFinal.DERROTA, pj);
        v.abrir();

    }

    public static void setNumExploracion(int numExploracion) {
        Exploracion.numExploracion = numExploracion;
    }

}
