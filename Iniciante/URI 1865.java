package Iniciante;

/*
 
 QUEST�O
 Odin criou para Thor a mais fiel e poderosa arma poss�vel, o martelo Mj�lnir. 
 Feito de um min�rio m�stico especial chamado Uru e forjado no cora��o de uma 
 estrela pelos Deuses ferreiros de Asgard, Brokk e Eitri, os lend�rios ferreiros.

 Um dia, Thor desafiou seus amigos para ver quem conseguia levantar o Mj�lnir.

 Escreva um programa que, dado um nome, e a for�a, em Newtons, aplicado ao tentar 
 levantar o Mj�lnir, informar se a pessoa conseguiu ou n�o levant�-lo.
 
 ENTRADA
 
 SA�DA
*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1865 {
	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int C = leitor.nextInt();
		String nome;
		int N;
		for (int i = 0; i < C; i++) {
			nome = leitor.next();
			N = leitor.nextInt();
			if (nome.equalsIgnoreCase("thor")) System.out.println("Y");
			else System.out.println("N");
		}
    }
	
}