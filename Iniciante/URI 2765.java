package Iniciante;

/*
 
 QUEST�O
 O seu professor gostaria de fazer um programa com as seguintes caracter�sticas:

 1. Leia uma frase que vai ter uma virgula no meio do texto;
 2. Imprima a primeira parte da frase;
 3. Imprima a segunda parte da frase.
 
 ENTRADA
 A entrada consiste v�rios arquivos de teste. Em cada arquivo de teste tem uma linha. 
 A linha tem uma frase com no m�ximo 100 caracteres (pode ter espa�o em branco) e 
 uma virgula. Conforme mostrado no exemplo de entrada a seguir.
 
 SA�DA
 Para cada arquivo da entrada, ter� um arquivo de sa�da. O arquivo de sa�da tem duas 
 linhas conforme os passos 2 e 3. Conforme mostra o exemplo de sa�da a seguir.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 2765 {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String STR = leitor.nextLine();
		String A = STR.split(",")[0];
		String B = STR.split(",")[1];
		System.out.println(A);
		System.out.println(B);
	}
	
}