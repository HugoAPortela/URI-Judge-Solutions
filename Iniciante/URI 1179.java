package Iniciante;

/*
 
 QUEST�O
 Neste problema voc� dever� ler 15 valores coloc�-los em 2 vetores conforme 
 estes valores forem pares ou �mpares. S� que o tamanho de cada um dos dois 
 vetores � de 5 posi��es. Ent�o, cada vez que um dos dois vetores encher, 
 voc� dever� imprimir todo o vetor e utiliz�-lo novamente para os pr�ximos 
 n�meros que forem lidos. Terminada a leitura, deve-se imprimir o conte�do 
 que restou em cada um dos dois vetores, imprimindo primeiro os valores do 
 vetor impar. Cada vetor pode ser preenchido tantas vezes quantas for necess�rio.
 
 ENTRADA
 A entrada cont�m 15 n�meros inteiros.

 SA�DA
 Imprima a sa�da conforme o exemplo abaixo.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1179 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int X, contPar = 0, contImpar = 0;
        for (int i = 0; i < 15; i++) {
        	X = leitor.nextInt();
        	
        	if (X % 2 == 0) {
        		par[contPar] = X; 
        		contPar++;
        	} else {
        		impar[contImpar] = X;
        		contImpar++;
        	}
        	
        	if (contPar == 5) {
        		contPar = 0;
        		for (int j = 0; j < par.length; j++) {
        			System.out.println("par[" + j + "] = " + par[j]);
        		}
        	} else if (contImpar == 5) {
        		contImpar = 0;
        		for (int j = 0; j < impar.length; j++) {
        			System.out.println("impar[" + j + "] = " + impar[j]);
        		}
        	}
        }
        
        for (int i = 0; i < contImpar; i++) {
			System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for (int i = 0; i < contPar; i++) {
			System.out.println("par[" + i + "] = " + par[i]);
        }
    }
	
}