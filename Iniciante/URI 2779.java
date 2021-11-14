package Iniciante;

/*
 
 QUEST�O
 Em ano de Copa do Mundo de Futebol, o �lbum de figurinhas oficial � sempre um 
 grande sucesso entre crian�as e tamb�m entre adultos. Para quem n�o conhece, 
 o �lbum cont�m espa�os numerados de 1 a N para colar as figurinhas; cada 
 figurinha, tamb�m numerada de 1 a N, � uma pequena foto de um jogador de uma 
 das sele��es que jogar� a Copa do Mundo. O objetivo � colar todas as figurinhas 
 nos respectivos espa�os no �lbum, de modo a completar o �lbum (ou seja, n�o 
 deixar nenhum espa�o sem a correspondente figurinha).

 As figurinhas s�o vendidas em envelopes fechados, de forma que o comprador n�o 
 sabe quais fi- gurinhas est� comprando, e pode ocorrer de comprar uma figurinha 
 que ele j� tenha colado no �lbum.

 Para ajudar os usu�rios, a empresa respons�vel pela venda do �lbum e das 
 figurinhas quer criar um aplicativo que permita gerenciar facilmente as 
 figurinhas que faltam para completar o �lbum e est� solicitando a sua ajuda.

 Dados o n�mero total de espa�os e figurinhas do �lbum, e uma lista das 
 figurinhas j� compradas (que pode conter figurinhas repetidas), sua tarefa � 
 determinar quantas figurinhas faltam para completar o �lbum.

 ENTRADA
 A primeira linha cont�m um inteiro N (1 <= N <= 100) indicando o n�mero total de 
 figurinhas e espa�os no �lbum. A segunda linha cont�m um inteiro M (1 <= M <= 300) 
 indicando o n�mero de figurinhas j� compradas. Cada uma das M linhas seguintes 
 cont�m um n�mero inteiro X (1 <= X <= N) indicando uma figurinha j� comprada.
 
 SA�DA
 Seu programa deve produzir uma �nica linha contendo um inteiro representando o 
 n�mero de figurinhas que falta para completar o �lbum.
 
*/

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class URI 2779 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int M = leitor.nextInt();
        HashSet<Integer> compradas = new HashSet<Integer>();
        for (int i = 0; i < M; i++) {
        	compradas.add(leitor.nextInt());
        }
        int faltam = N - compradas.size();
        System.out.println(faltam);
    }
	
}