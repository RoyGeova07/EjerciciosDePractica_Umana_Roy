/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Elaborar un algoritmo que realice una serie de peticiones de notas de alumno, hasta que se teclee un valor -1 
para finalizar  la introduccion de notas. Una vez finalizada la introduccion de notas se han  de visualizar cuantos
alumnos han aprobado y reprobado, asi como cuantos ha sacado notas englobadas 

de la siguiente forma: 

0 a 4 bajo
5 suficiente 
6 bien 
7 a 8 notable 
9 a 10 sobresaliente 
*/

/**
 *
 * @author royum
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        double nota;
        int ContadorAprobados = 0, ContadorDesaprobados = 0;
        int ContadorSobresalientes = 0, ContadorBajo =0, ContadorBien = 0, ContadorSuficiente = 0, ContadorNotable = 0, Alumnos =1;
        
        System.out.println("Ingrese las notas de los alumnos (de -1 para dar resultado)"); 
        do{
            System.out.println("Nota del alumno N " +Alumnos+ " : ");
            nota = lea.nextDouble();
            // condiciones
            if((nota > -1 && nota <= 10 )) {
                System.out.println("La nota es: "+nota);
                if(nota == 0){
                    System.out.println("Alumno con condicion baja ");
                    ContadorDesaprobados++;
                } else {
                    // aqui aumentamos el contador de los desaprobados  
                    ContadorAprobados++;
                    if(nota >= 5 && nota <= 5.9){
                        System.out.println("Alumno con condicion suficiente ");
                        ContadorSuficiente++;
                    } else if (nota >= 6 && nota <= 6.9 ) {
                        System.out.println("Alumno con condicioon bien");
                        ContadorBien++;
                    } else if(nota >= 7 && nota <= 8){
                        System.out.println("Alumno con condicion notable ");
                        ContadorNotable++;
                    } else if(nota >= 9 && nota <= 10){
                        System.out.println("Alumno con condicion sobresaliente");
                        ContadorSobresalientes++;
                    }
                }
                Alumnos++;
            } else {
                System.out.println("Nota no valida ");
            }
            System.out.println();
        } while(nota != -1);
        
        System.out.println("N de alumnos Aprobados: "+ContadorAprobados);
        System.out.println("N de alumnos desaprobados es: "+ContadorDesaprobados);
        System.out.println("N de alumnos con condicion baja: "+ContadorDesaprobados);
        System.out.println("N de alumnos con condicion suficiente: "+ContadorSuficiente);
        System.out.println("N de alumnos con condicion bien: "+ContadorBien);
        System.out.println("N de alumnos con condicion notable: "+ContadorNotable);
        System.out.println("N de alumnos con condicion sobresaliente: "+ContadorSobresalientes);
    }
}
