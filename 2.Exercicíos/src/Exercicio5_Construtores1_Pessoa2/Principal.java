package Exercicio5_Construtores1_Pessoa2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o nome da pessoa!");
		String nome = scan.nextLine();
		
		System.out.println("Insira a idade da pessoa!");
		int idade = scan.nextInt();
		
		if(nome == null){
			//CRIA pessoa1 CHAMANDO O CONSTRUTOR 1 PARAMETRO
		  	Pessoa pessoa1 = new Pessoa(idade);
		}else if(nome != null){
			//CRIA pessoa1 CHAMANDO O CONSTRUTOR 2 PARAMETROS
		  	Pessoa pessoa1 = new Pessoa(nome, idade);
		}

		scan.close();
		
	}

}
