/**
 * Meu primeiro programa Java
 * Este programa mostra ao aluno:
 * 1) Que um programa Java � constru�do dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um m�todo main.
 * 3) Como exibir informa��es no terminal(console) do Java.
 * 4) Como ler uma String no terminal(console) do Java.
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author raquel.paternazi
 * data: 03/02/2021
 */
public class Principal { //Classe que cont�m o m�todo principal.

	public static void main(String[] args) { //Este � o m�todo principal.
		System.out.println("Ol� amigo!\nQual � o seu nome?");
		
		//Ler uma string no console
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		//Exibir um String usando o printf
		System.out.printf("Ol� %s", nome);
		in.close();
	}

}
