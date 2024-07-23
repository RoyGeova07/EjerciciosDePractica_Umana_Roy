/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mini_Proyecto_6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author royum
 */
public class VentanaPrincipal {

    private JFrame marco;
    private JPanel panelPrincipal, panelSuperior, panelInferior;

    private JLabel etNombre, etNivel, etExp, etOro, etAtributos;
    private JLabel etImagen;

    private JButton botExplorar, botTienda, botSalir;

    private Personaje pj;

    public VentanaPrincipal(Personaje pj) {

        this.pj = pj;

        marco = new JFrame("Mini RPG");
        marco.setSize(600, 500);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

        panelPrincipal = new JPanel(new BorderLayout());
        panelSuperior = new JPanel();
        panelInferior = new JPanel();

        etNombre = new JLabel(pj.getNombre() + "     ");
        etNivel = new JLabel(" Lvl: " + pj.getNivel());
        etExp = new JLabel(" Exp: " + pj.getExp() + " / " + pj.getExpNecesaria());
        etOro = new JLabel(" Oro: " + pj.getOro());
        etAtributos = new JLabel(" Ataque " + pj.getAtaque() + " | Def: " + pj.getDefensa() + "  Vida: ");

        etImagen = new JLabel();

        botExplorar = new JButton("Explorar");
        botTienda = new JButton("Tienda");
        botSalir = new JButton("Salir");

    }

    public void ComenzarJuego() {

        montarEscena();

        marco.setVisible(true);
    }

    private void montarEscena() {

        // elaboramos panel superior con datos del personaje
        modificarFuentes();
        panelSuperior.add(etNombre);
        panelSuperior.add(etNivel);
        panelSuperior.add(etExp);
        panelSuperior.add(etOro);
        panelSuperior.add(etAtributos);
        panelSuperior.add(pj.getBarraVida());

        // PREPARAMOS LA IMAGEN CENTRAL DE LA PANTALLA.
        etImagen.setIcon(new ImageIcon(getClass().getResource("/Mini_Proyecto_6/Imagenes/castillo.jpg")));
        panelPrincipal.add(etImagen, BorderLayout.CENTER);

        // a;adimos  nuestros botones al panelinferior
        botExplorar.addActionListener(e -> nuevaExploracion());
        botTienda.addActionListener(e -> abrirTienda());
        botSalir.addActionListener(e -> System.exit(0));
        panelInferior.add(botExplorar);
        panelInferior.add(botTienda);
        panelInferior.add(botSalir);

        // anadimos paneles secundarios al panel principal.
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

        // anadimos panel principal al marco
        marco.add(panelPrincipal);

    }

    private void abrirTienda() {

        Tienda t = new Tienda(this);
        t.abrirTienda();
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        marco.repaint();  // para que cuando volvamos a la ventana se repinte de nuevo el panel superior con la barra del Hereoe.

    }

    private void nuevaExploracion() {

        Exploracion ex = new Exploracion(this); // en el constructor nos pide un tipo de objeto ventana pricipal, se soluciona con thiss 
        ex.comenzarExploracion();
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        marco.repaint();

    }

    // modificar letras
    private void modificarFuentes() {

        Font miFuente = new Font("Roboto", Font.BOLD, 20);
        etNombre.setFont(miFuente);
    }

    // necesitamos un getter para jugador, porque el metodo "nuevaExploracion", haremos llmar una nueva clase aventura
    // para acceder a los atributos de nuestro personaje ataque, vida etc.
    public Personaje getPj() {
        return pj;
    }

    public JPanel getPabelSup() {
        return panelSuperior;
    }

    // nos traemos las etiquetas con los getters para acceder dentro de la clase de Exploracion y asi se vayan actualizando 
    public JLabel getEtNivel() {
        return etNivel;
    }

    public JLabel getEtExp() {
        return etExp;
    }

    public JLabel getEtOro() {
        return etOro;
    }

    public JLabel getEtAtributos() {
        return etAtributos;
    }

}
