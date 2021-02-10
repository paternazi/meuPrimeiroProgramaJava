/**
 * Meu primeiro programa Java
 * Este programa mostra ao aluno:
 * 1) Que um programa Java é construído dentro de um projeto Java.
 * 2) Todo programa Java deve ter uma classe com um método main.
 * 3) Como exibir informações no terminal(console) do Java.
 * 4) Como ler uma String no terminal(console) do Java.
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;

/**
 * @author raquel.paternazi
 * data: 03/02/2021
 */
public class Principal { 
	
	// Felipe ta alterando tudo aqui meu , vai lascar meu código kkkkk
	public static void main(String[] args) { 
		System.out.println("Olá amigo!\nQual é o seu nome?");
		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		
		// Saldação específica...
		System.out.printf("Olá %s", nome);
		in.close();
	}

}
