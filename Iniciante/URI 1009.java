package Iniciante;

/*

 QUEST�O
 Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e 
 o total de vendas efetuadas por ele no m�s (em dinheiro). Sabendo que 
 este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar 
 o total a receber no final do m�s, com duas casas decimais.

 ENTRADA
 O arquivo de entrada cont�m um texto (primeiro nome do vendedor) e 2 
 valores de dupla precis�o (double) com duas casas decimais, representando 
 o sal�rio fixo do vendedor e montante total das vendas efetuadas por este 
 vendedor, respectivamente.

 SA�DA
 Imprima o total que o funcion�rio dever� receber, conforme exemplo fornecido.

*/

import java.io.IOException;
import java.util.Scanner;

public class URI 1009 {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.next();
        double salarioFixo = leitor.nextDouble();
        double vendas = leitor.nextDouble();
        double total = ((vendas * 15) / 100) + salarioFixo;
        System.out.println(String.format("TOTAL = R$ %.2f" , total));
    }
	
}