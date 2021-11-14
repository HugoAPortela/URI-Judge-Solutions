package Iniciante;

/*
 
 QUEST�O
 Leia um caractere mai�sculo, que indica uma opera��o que deve ser realizada 
 e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a m�dia 
 considerando somente aqueles elementos que est�o na �rea inferior da matriz, 
 conforme ilustrado abaixo (�rea verde). http://prntscr.com/k0z7wp
 	
 ENTRADA
 A primeira linha de entrada contem um �nico caractere Mai�sculo O ('S' ou 'M'), 
 indicando a opera��o (Soma ou M�dia) que dever� ser realizada com os elementos da 
 matriz. Seguem 144 valores com ponto flutuante de dupla precis�o que comp�em a matriz.
 
 SA�DA
 Imprima o resultado solicitado (a soma ou m�dia), com 1 casa ap�s o ponto decimal.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1188 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		M[i][j] = leitor.nextDouble();
        	}
        }
        
        for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
        		if (j < i && j > M.length-i-1) soma += M[i][j];
        	}
        }

        if (O == 'M') soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }
	
}