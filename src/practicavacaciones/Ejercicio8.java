/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/*
Se desea procesar las operaciones bancarias de un cliente a quien se le pide por unica vez su nombre y su saldo inicial
Luego en un proceso repetitivo se presenta las siguientes opciones:1 = deposito:2 = retiro3: = fin:4 salir.
Al ingresar la opcion elegida si esta fue 'D' se pide si es efectivo (1) o con cheque (2), se ingresa la cantidad
y si fuese chuque se descuente el 1% por comision y se actualiza  su saldo monstrandolo en pantalla.
Si la opcion elegida fue 'R' se ingresa la cantidad verificando que esta sea menor al saldo actualizando, de lo
contrario dar un mensaje desobregiro Si la opcion elegida fue 'F' mostrar los siguientes resultados:

a. Nombre 
b. Saldo.
c. Numero de DEPOSITOS en EFECTIVO y con CHEQUE
d. MONTO promedio de retiro.
e. MONTO minimo depositado y maximo retirado.

 */
/**
 *
 * @author royum
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        String nombre;
        float saldoInicial;
        int opcion;
        int contadorEfectivos, contadorCheque;
        contadorCheque = 0;
        contadorEfectivos = 0;
        float cantidadIngresada;
        float retiroMaximoRetirado = 0;
        float retiroMininoDepositado = 0;
        float cantidadRetiro;
        float sumaRetiros = 0;
        float promedioRetiros;
        int contadorRetiros = 0;
        int opcionN2;

        String mensaje = "\t====Opciones===="
                + "\n\t1. Deposito"
                + "\n\t2. Retiro "
                + "\n\t3. Fin"
                + "\n\t4. Salir";
        String mensaje2 = "\t==Opciones=="
                + "\n\t1. Efectivo"
                + "\n\t2. Cheque.";
        System.out.print("Ingrese su nombre: ");
        nombre = lea.nextLine();
        System.out.print("Hola! " + nombre + " Ingrese su saldo inicial por favor: S/.");
        saldoInicial = lea.nextFloat();
        do {
            System.out.println(mensaje);
            opcion = lea.nextInt();
            switch (opcion) {
                case 1:// deposito
                    System.out.println(mensaje2);
                    opcionN2 = lea.nextInt();
                    System.out.print("Ingrese la cantidad a Ingresar a su saldo Inicial: ");
                    cantidadIngresada = lea.nextFloat();
                    if (opcionN2 == 1) {
                        saldoInicial += cantidadIngresada;
                        System.out.println("Saldo actualizado: S/." + saldoInicial);
                        contadorEfectivos++;
                    } else {
                        float comision01;
                        // descuento del 1% de la cantidad ingresada
                        comision01 = cantidadIngresada * 0.01f;
                        saldoInicial = saldoInicial + cantidadIngresada - comision01;
                        System.out.println("Saldo actualizado: S/." + saldoInicial);
                        contadorCheque++;
                    }
                    retiroMininoDepositado = saldoInicial;
                    if (retiroMininoDepositado > cantidadIngresada) {
                        retiroMininoDepositado = cantidadIngresada;
                    }
                    break;
                case 2:// retiro
                    System.out.println("Sueldo actual: S/:" + saldoInicial);
                    System.out.print("Ingrese la cantidad a Retirar: S/. ");
                    cantidadRetiro = lea.nextFloat();
                    if (cantidadRetiro >= saldoInicial) {
                        System.out.println("Lo sentimos solo puede Retirar: S/." + saldoInicial);
                    } else {
                        saldoInicial -= cantidadRetiro;
                        System.out.println("Saldo actualizado: S/." + saldoInicial);
                    }
                    sumaRetiros += cantidadRetiro;
                    contadorRetiros++;
                    retiroMaximoRetirado = saldoInicial;

                    if (retiroMaximoRetirado > cantidadRetiro) {
                        retiroMaximoRetirado = cantidadRetiro;
                    }
                    break;
                case 3:
                    // procedemos a sacar el promedio de retiros
                    promedioRetiros = sumaRetiros / contadorRetiros;
                    String mensajeUltimo = "\n\tDATOS: "
                            + "\n\tNombre: " + nombre
                            + "\n\tSaldo: S/." + saldoInicial
                            + "\n\tNº de depósitos en Efectivo: " + contadorEfectivos
                            + "\n\tNº de depósitos con Cheque: " + contadorCheque
                            + "\n\tMonto promedio de retiros: " + promedioRetiros
                            + "\n\tMonto Màximo Retirado: " + retiroMaximoRetirado
                            + "\n\tCantidad Mínima Depositada: " + retiroMininoDepositado + "\n";
                    System.out.println(mensajeUltimo);
                    break;
                case 4:
                    System.out.println("Gracias por participar");
                    break;
                default:
                    System.out.println("==Selecione una opción Valida==");
                    break;
            }
        } while (opcion != 4);

    }

}
