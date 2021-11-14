package Iniciante;

/*

 QUEST�O
 Leia 3 valores, no caso, vari�veis A, B e C, que s�o as tr�s notas de 
 um aluno. A seguir, calcule a m�dia do aluno, sabendo que a nota A tem 
 peso 2, a nota B tem peso 3 e a nota C tem peso 5. Considere que cada 
 nota pode ir de 0 at� 10.0, sempre com uma casa decimal.

 ENTRADA
 O arquivo de entrada cont�m 3 valores com uma casa decimal, de dupla precis�o (double).

 SA�DA
 Imprima a vari�vel MEDIA conforme exemplo abaixo, com 1 d�gito ap�s o 
 ponto decimal e com um espa�o em branco antes e depois da igualdade. 
 Assim como todos os problemas, n�o esque�a de imprimir o fim de linha 
 ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1006 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double c = leitor.nextDouble();
        double media = ((A * 2) + (B * 3) + (C * 5)) / 10;
        System.out.println(String.format("MEDIA = %.1f" , media));
    }
	
}