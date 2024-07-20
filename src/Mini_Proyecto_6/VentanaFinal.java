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
public class VentanaFinal {

    private JTextArea areaTexto;
    private JLabel imagen;
    private JButton botonSalir;
    private ImageIcon rutaImagen;

    private int condicion;
    private Personaje pj;

    private JDialog marco;
    private JPanel panelPrincipal;

    public static final int VICTORIA = 0;
    public static final int DERROTA = 1;

    public VentanaFinal(int condicion, Personaje pj) {

        marco = new JDialog();
        panelPrincipal = new JPanel(new BorderLayout());

        areaTexto = new JTextArea();
        botonSalir = new JButton("Finalizar");

        this.condicion = condicion; // lo guardamos en una variable 
        this.pj = pj;

        if (condicion == VICTORIA) {
            rutaImagen = new ImageIcon("src/Mini_Proyecto_6/Imagenes/victoria.png");
        } else {
            rutaImagen = new ImageIcon("src/Mini_Proyecto_6/Imagenes/derrota.png");
        }

        imagen = new JLabel(rutaImagen);

    }

    public void abrir() {

        prepararMensaje();
        montarEscena();
        marco.setUndecorated(true);
        marco.setVisible(true);

    }

    private void prepararMensaje() {

        String mensajeFinal;

        if (condicion == VICTORIA) {

            mensajeFinal = "Has conseguido derrotar al jefe de castillo. Vuelves a tu hogar con una Victoria.\n"
                    + "Tienes heridas que nunca podras borrar. Has vencido, pero a que precio?. \n"
                    + pj.getNombre() + " Nivel: " + pj.getNivel() + " Has logrado traer contigo " + pj.getOro() + " monedas de oro.";

        } else {

            mensajeFinal = "Fuiste aniquilado en el castillo. Tus seres queridos enterraron lo que quedaba de ti.\n"
                    + "En poco tiempo todos se olvidaron de tu tumba.\n"
                    + "Vuelve a intentarlo si te atreves.";

        }

        areaTexto.setEditable(false);
        areaTexto.setText(mensajeFinal);

    }

    private void montarEscena() {

        // anadimos imagen a la parte norte.
        panelPrincipal.add(imagen, BorderLayout.NORTH);

        //anadimos area texto al centro de la pantalla 
        panelPrincipal.add(areaTexto, BorderLayout.CENTER);

        // anadimos boton a la parte sur.
        botonSalir.addActionListener(e -> System.exit(0));
        panelPrincipal.add(botonSalir, BorderLayout.SOUTH);

        marco.add(panelPrincipal);
        marco.setSize(650, 500);
        marco.setLocationRelativeTo(null);
        marco.setModal(true);

    }

}
