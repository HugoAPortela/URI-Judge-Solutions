package Iniciante;

/*
 
 QUEST�O
 Leia um valor inteiro X. Em seguida apresente os 6 valores �mpares consecutivos 
 a partir de X, um valor por linha, inclusive o X ser for o caso.
 
 ENTRADA
 A entrada ser� um valor inteiro positivo.

 SA�DA
 A sa�da ser� uma sequ�ncia de seis n�meros �mpares.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1070 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();
        int cont = 0;
        while (cont < 6) {
        	if (x % 2 == 1) {
        		System.out.println(x);
        		cont++;
        	}
    		x++;
        }
    }
	
}