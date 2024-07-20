/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mini_Proyecto_6;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author royum
 */
public class Tienda {
    
    private JDialog marco;
    
    private JPanel panelPrincipal, panelSuperior, panelInferior, panelTienda;  // gridLayout ira con 2 columans y 2 filas 
    private JPanel panelEspada, panelEscudo, panelPocion, panelMapa;
    
    private JLabel imagenEspada, imagenEscudo, imagenPocion, imagenMapa;
    private JLabel desEspada, desEscudo, desPocion, desMapa;
    private static JButton botEspada, botEscudo, botPocion, botMapa; // el estatico hace que no se vuelva a comprar los objetos.
    private static boolean agoEspada = false, agoEscudo = false, agoPocion = false, agoMapa = false;
    
    private JButton botSalir;
    
    private VentanaPrincipal vp;
    private Personaje pj;
    
    public Tienda(VentanaPrincipal vp){
        
        this.vp = vp;
        
        pj = vp.getPj();
        
        marco = new JDialog();
        
        panelPrincipal = new JPanel(new BorderLayout());
        panelSuperior = vp.getPabelSup();
        panelInferior = new JPanel();
        panelTienda = new JPanel(new GridLayout(2,2));
        
        panelEspada = new JPanel();
        panelEscudo = new JPanel();
        panelPocion = new JPanel();
        panelMapa = new JPanel();
        
        imagenEspada = new JLabel(new ImageIcon("src/Mini_Proyecto_6/Imagenes/espada.png"));
        imagenEscudo = new JLabel(new ImageIcon("src/Mini_Proyecto_6/Imagenes/escudo.png"));
        imagenPocion = new JLabel(new ImageIcon("src/Mini_Proyecto_6/Imagenes/pocion.png"));
        imagenMapa = new JLabel(new ImageIcon("src/Mini_Proyecto_6/Imagenes/mapa.png"));
        
        desEspada = new JLabel ("Espada - 200 oro.");
        desEscudo = new JLabel ("Escudo - 200 oro.");
        desPocion = new JLabel ("Pocion - 100 oro.");
        desMapa = new JLabel ("Mapa - 10 oro.");
        
        botEspada = new JButton("Comprar");
        botEscudo = new JButton("Comprar");
        botPocion = new JButton("Comprar");
        botMapa = new JButton("Comprar");
        
        botSalir = new JButton("Salir");
        
        
    }
    
    public void abrirTienda(){
        
        montatInterfaz();
        marco.setVisible(true);
        
        
    }

    private void montatInterfaz() {
        
        // panelSuperior listo.
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        
        // preparamos la zona central.
        addObjeto(panelEspada, imagenEspada, desEspada, botEspada, "espada", agoEspada );
        addObjeto(panelEscudo, imagenEscudo, desEscudo, botEscudo, "escudo", agoEscudo );
        addObjeto(panelPocion, imagenPocion, desPocion, botPocion, "pocion", agoPocion );
        addObjeto(panelMapa, imagenMapa, desMapa, botMapa, "mapa", agoMapa );
        
        panelPrincipal.add(panelTienda, BorderLayout.CENTER);
        
        // preparando panel Inferior.
        botSalir.addActionListener(e-> marco.dispose()); // el dispose se encarga de cerrar la ventana.
        panelInferior.add(botSalir);
        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);
        
        marco.setSize(720, 600);
        marco.setLocationRelativeTo(null);
        marco.setModal(true);
        marco.add(panelPrincipal);
        
    }

    private void addObjeto(JPanel panObjeto, JLabel imagen, JLabel descripcion, JButton boton, String nombre, boolean agotado) { // si creamos metodo de este tipo nos ahorramos lineas de codigo
        
        imagen.setAlignmentX(Component.CENTER_ALIGNMENT);
        descripcion.setAlignmentX(Component.CENTER_ALIGNMENT);
        boton.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        if(agotado) boton.setEnabled(false);
        boton.addActionListener(e -> comprarObjeto(boton, nombre));
        
        panObjeto.setLayout(new BoxLayout(panObjeto, BoxLayout.X_AXIS));
        panObjeto.add(imagen);
        panObjeto.add(descripcion);
        panObjeto.add(boton);
        
        panelTienda.add(panObjeto);
        
    }

    private void comprarObjeto(JButton boton, String nombre) {
        
        switch(nombre){
            
            case "espada":
                if(pj.getOro() >=200){
                    pj.setAtaque(pj.getAtaque()+5);
                    vp.getEtAtributos().setText(" Atributos "+ pj.getAtaque()+ " | Def: "+pj.getDefensa() + "  Vida: ");
                    pj.setOro(pj.getOro() - 200);
                    vp.getEtOro().setText(" Oro: "+ pj.getOro());
                    boton.setEnabled(false);
                    agoEspada = true; // se agota la espada y no se volvera a comprar.
                }
                break;
                case "escudo":
                if(pj.getOro() >=200){
                    pj.setDefensa(pj.getDefensa()+3);
                    vp.getEtAtributos().setText(" Atributos "+ pj.getAtaque()+ " | Def: "+pj.getDefensa() + "  Vida: ");
                    pj.setOro(pj.getOro() - 200);
                    vp.getEtOro().setText(" Oro: "+ pj.getOro());
                    boton.setEnabled(false);
                    agoEscudo = true;
                }
                break;case "pocion":
                if(pj.getOro() >=100){
                    pj.setVidaActual((int)pj.getVidaMax());
                    pj.establecerVida(pj.getVidaActual());
                    pj.setOro(pj.getOro() - 100);
                    vp.getEtOro().setText(" Oro: "+ pj.getOro());
                    
                }
                break;
                case "mapa":
                if(pj.getOro() >=10){
                    Exploracion.setNumExploracion(250); // esto hace que al comprar un mapa salga un numero 250, para que el jefe salga.
                    pj.setOro(pj.getOro() - 10);
                    vp.getEtOro().setText(" Oro: "+ pj.getOro());
                    boton.setEnabled(false);
                    agoMapa = true;
                }
                break;
            
        }
        
    }
    
    
    
}
