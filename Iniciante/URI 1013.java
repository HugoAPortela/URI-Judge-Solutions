package Iniciante;

/*

 QUEST�O
 Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s 
 valores lidos seguido da mensagem �eh o maior�.

 ENTRADA
 O arquivo de entrada cont�m tr�s valores inteiros.

 SA�DA
 Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem "eh o maior".

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1013 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int valor1 = leitor.nextInt();
        int valor2 = leitor.nextInt();
        int valor3 = leitor.nextInt();
        if (valor1 > valor2 && valor1 > valor3) {
        	System.out.println(valor1 + " eh o maior");
        } else if (valor2 > valor3) {
        	System.out.println(valor2 + " eh o maior");
        } else {
        	System.out.println(valor3 + " eh o maior");
        }
    }
	
}