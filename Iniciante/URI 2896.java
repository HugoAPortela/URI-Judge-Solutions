package Iniciante;

/*
 
 QUEST�O
 Um supermercado est� fazendo uma promo��o de venda de refrigerantes. Se um dia 
 voc� comprar refrigerantes e levar os cascos vazios no dia seguinte, ela troca 
 cada conjunto de K garrafas vazias  por uma garrafa cheia. Um cliente quer 
 aproveitar ao m�ximo essa oferta e por isso comprou v�rias garrafas no primeiro 
 dia da promo��o. Agora ele quer saber quantas garrafas ter� ao final do segundo 
 dia da promo��o, se us�-la ao m�ximo.

 Fa�a um programa para calcular isso.

 ENTRADA
 A primeira linha de entrada cont�m inteiro T (1 <= T <= 10000) , que indica o 
 n�mero de casos de teste. Em cada uma das T linhas a seguir v�m dois inteiros 
 N e K (1 <= K, N <= 10000),  respectivamente o n�mero de refrigerantes comprados 
 e o n�mero de garrafas vazias para ganhar uma cheia.
 
 SA�DA
 Para cada caso de teste imprima o n�mero de garrafas que o cliente ter� no 
 segundo dia, se aproveitar ao m�ximo a oferta.
 
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2896 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int T = leitor.nextInt();
        for (int i = 0; i < T; i++) {
        	int N = leitor.nextInt();
        	int K = leitor.nextInt();
        	System.out.println((N % K) + (N / K));
        }
    }
	
}