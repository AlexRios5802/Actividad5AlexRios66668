
package actividad5alexrios66668;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Actividad5AlexRios66668 {
    
    public static void Actividad5_1 ( ){
        
        System.out.println("Actividad 5.1 // Imprimir los días de la semana por Array");

        String Dia[] = new String[7];

        Dia[0] = "Domingo";
        Dia[1] = "Lunes";
        Dia[2] = "Martes";
        Dia[3] = "Miercoles";
        Dia[4] = "Jueves";
        Dia[5] = "Viernes";
        Dia[6] = "Sábado";
        for (int i = 0; i < 7; i++) {
            System.out.println(Dia[i]);
        }
    }
    
    public static void Actividad5_2 ( ){
        
        System.out.println("Actividad 5.2 // Imprimir los nombres de los personajes de StarWars");
        
        String aPersonajes [ ] [ ] = new String [16] [3];
        aPersonajes[0][0] = "Luke Skywalker";
        aPersonajes[0][1] = "172";
        aPersonajes[0][2] = "male";
        aPersonajes[1][0] = "R2-D2";
        aPersonajes[1][1] = "96";
        aPersonajes[1][2] = "n/a";
        aPersonajes[2][0] = "C-3PO";
        aPersonajes[2][1] = "167";
        aPersonajes[2][2] = "n/a";
        aPersonajes[3][0] = "Darth Vader";
        aPersonajes[3][1] = "202";
        aPersonajes[3][2] = "male";
        aPersonajes[4][0] = "Leia Organa";
        aPersonajes[4][1] = "150";
        aPersonajes[4][2] = "female";
        aPersonajes[5][0] = "Owen Lars";
        aPersonajes[5][1] = "178";
        aPersonajes[5][2] = "male";
        aPersonajes[6][0] = "Beru Whitesun lars";
        aPersonajes[6][1] = "165";
        aPersonajes[6][2] = "female";
        aPersonajes[7][0] = "R5-D4";
        aPersonajes[7][1] = "97";
        aPersonajes[7][2] = "n/a";
        aPersonajes[8][0] = "Biggs Darklighter";
        aPersonajes[8][1] = "183";
        aPersonajes[8][2] = "male";
        aPersonajes[9][0] = "Obi-Wan Kenobi";
        aPersonajes[9][1] = "182";
        aPersonajes[9][2] = "male";
        aPersonajes[10][0] = "Yoda";
        aPersonajes[10][1] = "66";
        aPersonajes[10][2] = "male";
        aPersonajes[11][0] = "Jek Tono Porkins";
        aPersonajes[11][1] = "180";
        aPersonajes[11][2] = "male";
        aPersonajes[12][0] = "Jabba Desilijic Tiure";
        aPersonajes[12][1] = "175";
        aPersonajes[12][2] = "hermaphrodite";
        aPersonajes[13][0] = "Han Solo";
        aPersonajes[13][1] = "180";
        aPersonajes[13][2] = "male";
        aPersonajes[14][0] = "Chewbacca";
        aPersonajes[14][1] = "228";
        aPersonajes[14][2] = "male";
        aPersonajes[15][0] = "Anakin Skywalker";
        aPersonajes[15][1] = "188";
        aPersonajes[15][2] = "male";
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(aPersonajes [i][j]);
            }
        }
    }
    
    public static void Actividad5_3 ( ){
        
        System.out.println("Actividad 5.3 // Imprimir desde un arreglo bidimensional las letras y la clave morse de cada una");
        
        System.out.println("Letras y morse");
        
        String aCodigo [ ] [ ] = new String [26] [2];
        
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
        for (int i = 0; i < 26; i++) {
            
                System.out.println("La letra: " + aCodigo [i] [0] + " va relacionado con "  + aCodigo [i] [1]);
        }
    }
    
    public static void matriz( ){
        
        String aCodigo [ ] [ ] = new String [26] [1];
        
        aCodigo[0][0] = "A";
        aCodigo[1][0] = "B";
        aCodigo[2][0] = "C";
        aCodigo[3][0] = "D";
        aCodigo[4][0] = "E";
        aCodigo[5][0] = "F";
        aCodigo[6][0] = "G";
        aCodigo[7][0] = "H";
        aCodigo[8][0] = "I";
        aCodigo[9][0] = "J";
        aCodigo[10][0] = "K";
        aCodigo[11][0] = "L";
        aCodigo[12][0] = "M";
        aCodigo[13][0] = "N";
        aCodigo[14][0] = "O";
        aCodigo[15][0] = "P";
        aCodigo[16][0] = "Q";
        aCodigo[17][0] = "R";
        aCodigo[18][0] = "S";
        aCodigo[19][0] = "T";
        aCodigo[20][0] = "U";
        aCodigo[21][0] = "V";
        aCodigo[22][0] = "W";
        aCodigo[23][0] = "X";
        aCodigo[24][0] = "Y";
        aCodigo[25][0] = "Z";
        
    }
    
    public static void morse ( ){
        String aCodigo [ ] [ ] = new String [26] [2];
        aCodigo[0][1] = ".-";
        aCodigo[1][1] = "-...";
        aCodigo[2][1] = "-.-.";
        aCodigo[3][1] = "-..";
        aCodigo[4][1] = ".";
        aCodigo[5][1] = "..-.";
        aCodigo[6][1] = "--.";
        aCodigo[7][1] = "...";
        aCodigo[8][1] = "..";
        aCodigo[9][1] = ".---";
        aCodigo[10][1] = "-.-";
        aCodigo[11][1] = ".-..";
        aCodigo[12][1] = "--";
        aCodigo[13][1] = "-.";
        aCodigo[14][1] = "---";
        aCodigo[15][1] = ".--.";
        aCodigo[16][1] = "--.-";
        aCodigo[17][1] = ".-.";
        aCodigo[18][1] = "...";
        aCodigo[19][1] = "-";
        aCodigo[20][1] = "..-";
        aCodigo[21][1] = "...-";
        aCodigo[22][1] = ".--";
        aCodigo[23][1] = "-..-";
        aCodigo[24][1] = "-.--";
        aCodigo[25][1] = "--..";
        
        
       
        
    }
    
    public static void Actividad5_4 ( ){
        
        System.out.println("Actividad 5.4 // Leer una palabra, conviertala a un arreglo de caracteres y ");
        System.out.println("busque su correspondencia en el código ascii");
        
       Scanner tecla = new Scanner(System.in);
       String frase;
       System.out.print("Introduce una frase: ");
        
       
       
       frase = tecla.nextLine();

        int asciiValue;
        char cChar;
        String sFrase = frase;
        char[] aChar = sFrase.toCharArray();
        for (int i = 0; i < aChar.length; i++) {
            System.out.println(" ");
            System.out.println(aChar[i]);
            cChar = aChar[i];
            asciiValue = (int) cChar;

            String aCodigo[][] = new String[26][1];
            aCodigo[0][0] = ".-";
            aCodigo[1][0] = "-...";
            aCodigo[2][0] = "-.-.";
            aCodigo[3][0] = "-..";
            aCodigo[4][0] = ".";
            aCodigo[5][0] = "..-.";
            aCodigo[6][0] = "--.";
            aCodigo[7][0] = "...";
            aCodigo[8][0] = "..";
            aCodigo[9][0] = ".---";
            aCodigo[10][0] = "-.-";
            aCodigo[11][0] = ".-..";
            aCodigo[12][0] = "--";
            aCodigo[13][0] = "-.";
            aCodigo[14][0] = "---";
            aCodigo[15][0] = ".--.";
            aCodigo[16][0] = "--.-";
            aCodigo[17][0] = ".-.";
            aCodigo[18][0] = "...";
            aCodigo[19][0] = "-";
            aCodigo[20][0] = "..-";
            aCodigo[21][0] = "...-";
            aCodigo[22][0] = ".--";
            aCodigo[23][0] = "-..-";
            aCodigo[24][0] = "-.--";
            aCodigo[25][0] = "--..";

            for (int j = 0; j < asciiValue - 65; j++) {
                
            }
            System.out.println(aCodigo[asciiValue - 65][0]);
        }
        
        
       frase = tecla.nextLine();
       StringTokenizer st = new StringTokenizer(frase);
       System.out.println("Número de palabras: " + st.countTokens());     
       
       
            
        
        
    }
    
    public static void Actividad5_5 ( ) {
        
        System.out.println("Actividad 5.5 // Leer una frase e identificar el sexo del personaje");
        System.out.println("Tipos de sexo existente: ");
        System.out.println("1.- Masculino // 2.-  Femenino // 3.- N/A  // 4.- Hermaphrodite");
        
        int v1 = 0;
        System.out.println("Ingresa el sexo o la procedencia");
        Scanner tc = new Scanner (System.in);
        v1 = tc.nextInt( );
        
        String aPersonajes [ ] [ ] = new String [16] [3];
        aPersonajes[0][0] = "Luke Skywalker";
        aPersonajes[0][1] = "172";
        aPersonajes[0][2] = "male";
        aPersonajes[1][0] = "R2-D2";
        aPersonajes[1][1] = "96";
        aPersonajes[1][2] = "n/a";
        aPersonajes[2][0] = "C-3PO";
        aPersonajes[2][1] = "167";
        aPersonajes[2][2] = "n/a";
        aPersonajes[3][0] = "Darth Vader";
        aPersonajes[3][1] = "202";
        aPersonajes[3][2] = "male";
        aPersonajes[4][0] = "Leia Organa";
        aPersonajes[4][1] = "150";
        aPersonajes[4][2] = "female";
        aPersonajes[5][0] = "Owen Lars";
        aPersonajes[5][1] = "178";
        aPersonajes[5][2] = "male";
        aPersonajes[6][0] = "Beru Whitesun lars";
        aPersonajes[6][1] = "165";
        aPersonajes[6][2] = "female";
        aPersonajes[7][0] = "R5-D4";
        aPersonajes[7][1] = "97";
        aPersonajes[7][2] = "n/a";
        aPersonajes[8][0] = "Biggs Darklighter";
        aPersonajes[8][1] = "183";
        aPersonajes[8][2] = "male";
        aPersonajes[9][0] = "Obi-Wan Kenobi";
        aPersonajes[9][1] = "182";
        aPersonajes[9][2] = "male";
        aPersonajes[10][0] = "Yoda";
        aPersonajes[10][1] = "66";
        aPersonajes[10][2] = "male";
        aPersonajes[11][0] = "Jek Tono Porkins";
        aPersonajes[11][1] = "180";
        aPersonajes[11][2] = "male";
        aPersonajes[12][0] = "Jabba Desilijic Tiure";
        aPersonajes[12][1] = "175";
        aPersonajes[12][2] = "hermaphrodite";
        aPersonajes[13][0] = "Han Solo";
        aPersonajes[13][1] = "180";
        aPersonajes[13][2] = "male";
        aPersonajes[14][0] = "Chewbacca";
        aPersonajes[14][1] = "228";
        aPersonajes[14][2] = "male";
        aPersonajes[15][0] = "Anakin Skywalker";
        aPersonajes[15][1] = "188";
        aPersonajes[15][2] = "male";
        for (int i = 0; i < 16; i++) {
        
            for (int j = 0; j < 3; j++) {
                
                
                
                    
                    
                
                
            }
            System.out.println(aPersonajes [i] [0] + ": Personaje masculino");
                    
                
                    
                    System.out.println(aPersonajes[i][1] + ": Personaje femenino ");
                    
               
                    
                    System.out.println(aPersonajes [i][2] + ": Este personaje no aplica a algún sexo");
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Ingresa un número entre el 1 y 5 para ver la tarea que desea");
        
        int v1 = 0;
        
        Scanner tc = new Scanner (System.in);
        v1 = tc.nextInt( );
        
        switch (v1) {
            case 1:
                Actividad5_1 ( );
                break;
            case 2:
                Actividad5_2 ( );
                break;
            case 3:
                Actividad5_3 ( );
                break;
            case 4:
                Actividad5_4 ( );
                break;
            case 5:
                Actividad5_5 ( );
                break;
            default:
                System.out.println("Valor no valido, reinicia el programa e intenta de nuevo");
        }
    }

}
