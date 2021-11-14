package Strings;

/*

 QUEST�O
 Implemente um programa denominado combinador, que recebe duas strings e deve 
 combin�-las, alternando as letras de cada string, come�ando com a primeira 
 letra da primeira string, seguido pela primeira letra da segunda string, em 
 seguida pela segunda letra da primeira string, e assim sucessivamente. As 
 letras restantes da cadeia mais longa devem ser adicionadas ao fim da string 
 resultante e retornada.
 
 ENTRADA
 A entrada cont�m v�rios casos de teste. A primeira linha cont�m um inteiro N 
 que indica a quantidade de casos de teste que vem a seguir. Cada caso de teste 
 � composto por uma linha que cont�m duas cadeias de caracteres, cada cadeia de 
 caracteres cont�m entre 1 e 50 caracteres inclusive.
 
 SA�DA
 Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo 
 e exiba a cadeia resultante.

*/

import java.util.Scanner;

public class URI 1238 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String string1 = leitor.next();
			String string2 = leitor.next();
			String maior, menor;
			String resultado = "";
			if (string1.length() > string2.length()) {
				maior = string1;
				menor = string2;
			} else {
				maior = string2;
				menor = string1;
			}
			for (int j = 0; j < menor.length(); j++) {
				resultado += string1.charAt(j) + "" + string2.charAt(j);
			}
			resultado += maior.substring(menor.length(), maior.length());
			System.out.println(resultado);
		}
	}

}