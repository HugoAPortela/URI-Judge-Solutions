package Iniciante;

/*

 QUEST�O
 Leia dois valores inteiros. A seguir, calcule o produto entre estes 
 dois valores e atribua esta opera��o � vari�vel PROD. A seguir mostre 
 a vari�vel PROD com mensagem correspondente.   

 ENTRADA
 O arquivo de entrada cont�m 2 valores inteiros.

 SA�DA
 Imprima a vari�vel PROD conforme exemplo abaixo, com um espa�o em branco
 antes e depois da igualdade. N�o esque�a de imprimir o fim de linha ap�s o 
 produto, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1004 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int prod = a * b;
        System.out.println("PROD = " + prod);
    }
	
}