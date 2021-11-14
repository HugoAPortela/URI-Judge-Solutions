package Iniciante;

/*

 QUEST�O
 Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, 
 o valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de 
 pe�as 2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o 
 valor a ser pago.

 ENTRADA
 O arquivo de entrada cont�m duas linhas de dados. Em cada linha haver� 3 
 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

 SA�DA
 A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, 
 lembrando de deixar um espa�o ap�s os dois pontos e um espa�o ap�s 
 o "R$". O valor dever� ser apresentado com 2 casas ap�s o ponto.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1010 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
		
        int cod1 = leitor.nextInt();
        int n1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();
		
        int cod2 = leitor.nextInt();
        int n2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();
		
        double total = (n1 * valor1) + (n2 * valor2);
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
    }
	
}