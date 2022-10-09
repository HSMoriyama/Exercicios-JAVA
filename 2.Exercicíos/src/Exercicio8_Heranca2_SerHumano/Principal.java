package Exercicio8_Heranca2_SerHumano;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//SOLICITANDO AO USER OS DADOS
		System.out.println("Insira o nome: ");
		Pessoa.nome = scan.nextLine();
		
		System.out.println("Insira a idade: ");
		Pessoa.idade = scan.nextInt();
		
		scan.nextLine();//PARA LIMPEZA DO BUFFER **USAR(TRY CATCH)
		
		System.out.println("Insira o tipo de animal: ");
		Pessoa.tipo = scan.nextLine();
		
		//IMPRESSAO DOS ATRIBUTOS
		System.out.println("Nome: " + Pessoa.nome + " | " +
						   "Idade: " + Pessoa.idade + " | " +
						   "Tipo: " + Animal.tipo + " \n ");
		
		//EXECUCAO DOS METODOS
		Pessoa.falar();
		Pessoa.andar();
						   
		scan.close();
	}

}
