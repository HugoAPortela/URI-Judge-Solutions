package Iniciante;

/*

 QUEST�O
 Leia 2 valores de ponto flutuante de dupla precis�o A e B, que 
 correspondem a 2 notas de um aluno. A seguir, calcule a m�dia do aluno,
 sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos 
 pesos portanto � 11). Assuma que cada nota pode ir de 0 at� 10.0, sempre 
 com uma casa decimal.

 ENTRADA
 O arquivo de entrada cont�m 2 valores com uma casa decimal cada um.

 SA�DA
 Calcule e imprima a vari�vel MEDIA conforme exemplo abaixo, com 5 d�gitos
 ap�s o ponto decimal e com um espa�o em branco antes e depois da igualdade.
 Utilize vari�veis de dupla precis�o (double) e como todos os problemas, n�o
 esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc�
 receber� "Presentation Error".

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1005 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double a = leitor.nextDouble();
        double b = leitor.nextDouble();
        double media = ((3.5 * a) + (7.5 * b))/11;
        System.out.println(String.format("MEDIA = %.5f" , media));
    }
	
}