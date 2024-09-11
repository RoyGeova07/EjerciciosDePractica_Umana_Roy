/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniJuego4;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author royum
 */
public class Laberinto {
    // uso de array matriz
    int[][]lab= new int[13][23];
    int fila  = 0;
    int columna = 0;
    int numeroFilas = 13;
    int numeroColumnas = 23;
    int anchoBloque = 40;
    int altoBloque = 40;
    
    public void paint (Graphics grafico){
        int [][]laberinto = obtieneLaberinto();
        
        for(fila  = 0; fila < numeroFilas; fila++ ){
            for(columna = 0; columna < numeroColumnas; columna++){
                if(laberinto[fila][columna]==1){
                    if(Juego.obtieneNivel()==1){grafico.setColor(Color.darkGray);}
                    if(Juego.obtieneNivel()==2){grafico.setColor(Color.pink);}
                    if(Juego.obtieneNivel()==3){grafico.setColor(Color.magenta);}
                    if(Juego.obtieneNivel()==4){grafico.setColor(Color.red);}
                    
                     
                    // uso de fillrect
                    // se utiliza para dibujar un rectángulo sólido en un lienzo en gráficos 2D. Está presente en varios lenguajes de programación y bibliotecas gráficas.
                    
                    grafico.fillRect(columna*40, fila*40, anchoBloque, altoBloque);
                    grafico.setColor(Color.black);
                    //uso de drawRect
                    // se utiliza para dibujar el contorno de un rectángulo en un lienzo o contexto gráfico.
                    
                    grafico.drawRect(columna*40, fila*40, anchoBloque, altoBloque);
                    
                }
            }
        }
        // uso de drawString
        // se utiliza para dibujar texto en una superficie gráfica. 
        grafico.drawString("Inicio", 5, 62);
        grafico.drawString("Fin", 850, 462);
        
    }
    
    public int [][] obtieneLaberinto(){
        if(Juego.obtieneNivel()== 1){
            int laberinto[][]=
{{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
{ 1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0,1,1},
{ 1,1,0,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1},
{ 1,1,0,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,1},
{ 1,1,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,1,0,1,0,1,1},
{ 1,1,0,0,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,1,0,1,1},
{ 1,1,0,1,1,1,1,0,1,0,1,0,1,0,1,1,1,1,0,1,1,1,1},
{ 1,1,0,1,0,0,0,0,1,0,0,0,1,0,0,1,1,1,0,1,0,1,1},
{ 1,1,0,1,0,1,1,1,1,0,1,1,1,1,0,1,0,1,0,1,0,1,1},
{ 1,1,0,1,0,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,0,1,1},
{ 1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1},
{ 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            lab = laberinto;
        }
        
        if(Juego.obtieneNivel()== 2){
            int laberinto[][]=
{{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
{ 1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
{ 1,1,1,0,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1},
{ 1,1,0,0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1},
{ 1,1,0,1,1,1,1,0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1},
{ 1,1,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1,0,1,1},
{ 1,1,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1},
{ 1,1,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,1,0,1,1},
{ 1,1,0,1,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1},
{ 1,1,0,1,0,0,0,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,1},
{ 1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1,0,1,0,1,1,1,1},
{ 1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            lab = laberinto;
        }
        
        if(Juego.obtieneNivel()== 3){
            int laberinto [][]=
{{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
{ 1,0,0,0,1,0,0,0,0,0,0,1,1,1,0,0,1,1,3,0,0,1,1},
{ 1,1,1,0,1,0,1,0,1,1,1,0,0,0,1,0,0,0,1,1,0,1,1},
{ 1,1,0,0,0,0,1,0,0,1,0,0,1,0,1,0,1,0,0,1,0,1,1},
{ 1,1,0,1,1,1,1,0,1,0,0,1,1,0,1,0,0,1,0,1,0,1,1},
{ 1,1,0,0,0,0,1,0,0,0,1,1,1,0,1,0,1,0,0,1,0,1,1},
{ 1,1,1,0,1,0,1,1,1,1,0,0,0,0,1,0,0,1,0,1,0,1,1},
{ 1,1,0,0,0,1,0,0,0,1,0,1,1,1,0,0,1,0,0,1,0,1,1},
{ 1,1,0,1,1,0,0,1,0,1,0,0,0,0,0,1,0,0,1,1,0,1,1},
{ 1,1,0,1,0,0,1,1,0,1,0,1,1,1,1,0,0,1,0,0,0,1,1},
{ 1,1,0,0,0,1,1,1,0,1,0,0,0,0,0,1,0,0,0,1,0,1,1},
{ 1,1,0,1,0,0,0,1,0,0,0,1,1,1,1,0,0,1,0,1,0,0,1},
{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            lab = laberinto;
        }
        
        if(Juego.obtieneNivel() == 4){
            int laberinto [][]=
{{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1},
{ 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
{ 1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
{ 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1},
{ 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
{ 1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
{ 1,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,1},
{ 1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1},
{ 1,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,1},
{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
            lab = laberinto;
        }
        
        return lab;
    }
    
    // de aqui saque el diseño de los lab laberintos: https://fredygeek.com/2020/09/17/mi-primer-laberinto-en-java/
    
}
