package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria de fazer um programa com as seguintes caracter�sticas:

 1. Leia 10 nomes, sem espa�o em branco;
 2. Imprima o terceiro nome da lista;
 3. Imprima o s�timo nome da lista;
 4. Imprima o nono nome da lista.
 
 ENTRADA
 A entrada consiste v�rios arquivos de teste. Em cada arquivo de teste tem dez 
 linhas. Em cada linha tem um nome de no m�ximo 30 caracteres e sem espa�o em 
 branco. Conforme mostrado no exemplo de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem tr�s 
 linhas conforme os procedimentos 2, 3 e 4. Conforme mostra o exemplo de sa�da a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2770 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int X = leitor.nextInt();
			int Y = leitor.nextInt();
			int M = leitor.nextInt();
			for (int i = 0; i < M; i++) {
				int Xi = leitor.nextInt();
				int Yi = leitor.nextInt();
				if ((Xi <= X && Yi <= Y) || (Xi <= Y && Yi <= X) || (Yi <= X && Xi <= Y))
					System.out.println("Sim");
				else
					System.out.println("Nao");
			}
		}
	}
	
}