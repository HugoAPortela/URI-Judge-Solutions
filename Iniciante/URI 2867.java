package Iniciante;

/*
 
 QUEST�O
 Dados dois n�meros inteiros, n e m, quantos d�gitos tem nm ?

 Exemplos:

 2 e 10 - 210 = 1024 - 4 d�gitos

 3 e 9 - 39 = 19683 - 5 d�gitos
 
 ENTRADA
 A entrada � composta por v�rios casos de teste. A primeira linha tem um 
 n�mero inteiro C, representando a quantidade de casos de teste. As C linhas 
 seguintes cont�m dois n�meros inteiros N e M (1 <= N, M <= 100).
 
 SA�DA
 Para cada caso de teste de entrada do seu programa, voc� deve imprimir um 
 n�mero inteiro contendo a quantidade de d�gitos do resultado da pot�ncia 
 calculada no respectivo caso de teste.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2867 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int C = leitor.nextInt();
        for (int i = 0; i < C; i++) {
        	int N = leitor.nextInt();
        	int M = leitor.nextInt();
        	int digitos = (int) (Math.log10(Math.pow(N, M)) + 1);
        	System.out.println(digitos);
        }
    }
	
}