/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicavacaciones;

import java.util.Scanner;

/**
 *
 * @author royum
 */
public class Codigo_Morse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al conversor de texto a codigo Morse y viceversa.");
        System.out.println("Ingrese el texto o el código Morse a convertir:");
        
        String entrada = scanner.nextLine();
        
        // Detectar automáticamente si la entrada es texto o Morse
        if (esTextoNatural(entrada)) {
            String morse = textoANumeroMorse(entrada);
            System.out.println("Texto a Morse: " + morse);
        } else if (esCodigoMorse(entrada)) {
            String texto = morseANumeroTexto(entrada);
            System.out.println("Morse a Texto: " + texto);
        } else {
            System.out.println("Entrada no válida. Debe ser texto natural o código Morse.");
        }
        
        scanner.close();
    }
    
    // Función para determinar si la entrada es texto natural
    private static boolean esTextoNatural(String entrada) {
        // Se considera texto natural si contiene letras, números, espacios y signos de puntuación comunes
        return entrada.matches("[a-zA-Z0-9,.?!\\s]+");
    }
    
    // Función para determinar si la entrada es código Morse
    private static boolean esCodigoMorse(String entrada) {
        // Se considera código Morse si solo contiene puntos, rayas, espacios y dobles espacios
        return entrada.matches("[\\-./\\s]+");
    }
    
    // Función para convertir texto a código Morse
    private static String textoANumeroMorse(String texto) {
        StringBuilder morse = new StringBuilder();
        
        for (int i = 0; i < texto.length(); i++) {
            char caracter = Character.toLowerCase(texto.charAt(i));
            String codigoMorse = caracterAMorse(caracter);
            if (codigoMorse != null) {
                morse.append(codigoMorse).append(" ");
            } else if (caracter == ' ') {
                morse.append("  "); // Dos espacios entre palabras
            }
        }
        
        return morse.toString().trim(); // Eliminar espacio en blanco al final
    }
    
    // Función para convertir un carácter a su código Morse
    private static String caracterAMorse(char caracter) {
        switch (caracter) {
            case 'a':
                return ".-";
            case 'b':
                return "-...";
            case 'c':
                return "-.-.";
            case 'd':
                return "-..";
            case 'e':
                return ".";
            case 'f':
                return "..-.";
            case 'g':
                return "--.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".---";
            case 'k':
                return "-.-";
            case 'l':
                return ".-..";
            case 'm':
                return "--";
            case 'n':
                return "-.";
            case 'o':
                return "---";
            case 'p':
                return ".--.";
            case 'q':
                return "--.-";
            case 'r':
                return ".-.";
            case 's':
                return "...";
            case 't':
                return "-";
            case 'u':
                return "..-";
            case 'v':
                return "...-";
            case 'w':
                return ".--";
            case 'x':
                return "-..-";
            case 'y':
                return "-.--";
            case 'z':
                return "--..";
            case '1':
                return ".----";
            case '2':
                return "..---";
            case '3':
                return "...--";
            case '4':
                return "....-";
            case '5':
                return ".....";
            case '6':
                return "-....";
            case '7':
                return "--...";
            case '8':
                return "---..";
            case '9':
                return "----.";
            case '0':
                return "-----";
            case ',':
                return "--..--";
            case '.':
                return ".-.-.-";
            case '?':
                return "..--..";
            case ' ':
                return "/"; // Separador especial para dos espacios entre palabras
            default:
                return null; // Caracteres no soportados
        }
    }
    
    // Función para convertir código Morse a texto
    private static String morseANumeroTexto(String morse) {
        StringBuilder texto = new StringBuilder();
        
        String[] palabras = morse.split("   "); // Separador para palabras en Morse
        
        for (String palabra : palabras) {
            String[] letras = palabra.split(" "); // Separador para letras en Morse
            
            for (String letra : letras) {
                char caracter = morseACaracter(letra);
                if (caracter != '\0') {
                    texto.append(caracter);
                }
            }
            
            texto.append(" "); // Espacio entre palabras en el texto resultante
        }
        
        return texto.toString().trim(); // Eliminar espacio en blanco al final
    }
    
    // Función para convertir un código Morse a su carácter correspondiente
    private static char morseACaracter(String morse) {
        switch (morse) {
            case ".-":
                return 'a';
            case "-...":
                return 'b';
            case "-.-.":
                return 'c';
            case "-..":
                return 'd';
            case ".":
                return 'e';
            case "..-.":
                return 'f';
            case "--.":
                return 'g';
            case "....":
                return 'h';
            case "..":
                return 'i';
            case ".---":
                return 'j';
            case "-.-":
                return 'k';
            case ".-..":
                return 'l';
            case "--":
                return 'm';
            case "-.":
                return 'n';
            case "---":
                return 'o';
            case ".--.":
                return 'p';
            case "--.-":
                return 'q';
            case ".-.":
                return 'r';
            case "...":
                return 's';
            case "-":
                return 't';
            case "..-":
                return 'u';
            case "...-":
                return 'v';
            case ".--":
                return 'w';
            case "-..-":
                return 'x';
            case "-.--":
                return 'y';
            case "--..":
                return 'z';
            case ".----":
                return '1';
            case "..---":
                return '2';
            case "...--":
                return '3';
            case "....-":
                return '4';
            case ".....":
                return '5';
            case "-....":
                return '6';
            case "--...":
                return '7';
            case "---..":
                return '8';
            case "----.":
                return '9';
            case "-----":
                return '0';
            case "--..--":
                return ',';
            case ".-.-.-":
                return '.';
            case "..--..":
                return '?';
            case "/":
                return ' '; // Separador especial para dos espacios entre palabras
            default:
                return '\0'; // Caracteres no soportados
        }
    }
}