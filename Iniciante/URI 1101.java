package Iniciante;

/*
  
 QUEST�O
 Leia um conjunto n�o determinado de pares de valores M e N (parar quando 
 algum dos valores for menor ou igual a zero). Para cada par lido, mostre 
 a sequ�ncia do menor at� o maior e a soma dos inteiros consecutivos entre 
 eles (incluindo o N e M).
 
 ENTRADA
 O arquivo de entrada cont�m um n�mero n�o determinado de valores M e N. A 
 �ltima linha de entrada vai conter um n�mero nulo ou negativo.
 
 SA�DA
 Para cada dupla de valores, imprima a sequ�ncia do menor at� o maior e a 
 soma deles, conforme exemplo abaixo.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1101 {
	
    public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int M = leitor.nextInt();
    	int N = leitor.nextInt();
    	int soma=0;
    	while (M > 0 && N > 0) {
    		
    		if (M > N) {
        		for (int i = N; i <= M; i++) {
        			soma += i;
        			System.out.print(i + " ");
        		}
    		} else {
        		for (int i = M; i <= N; i++) {
        			soma += i;
        			System.out.print(i + " ");
        		}
    		}

    		System.out.println("Sum=" + soma);
        	M = leitor.nextInt();
        	N = leitor.nextInt();
        	soma = 0;
    	}
    }
	
}