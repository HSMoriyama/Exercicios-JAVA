package Exercicio5_Construtores1_Pessoa2;

public class Pessoa {

	//ATRIBUTOS DE PESSOA
	public String nomePessoa = "CreazzY OzzY!";
	public int idadePessoa;
	
	//DEFINICAO DO CONSTRUTOR 2 PARAMETROS
	public Pessoa(String nome, int idade){
		nomePessoa = nome;
		idadePessoa = idade;
		
		System.out.println("Nome: " + nomePessoa + " | " + "Idade: " + idade);
	}
	
	//DEFINICAO DO CONSTRUTOR 1 PARAMETRO
	public Pessoa(int idade) {
		idadePessoa = idade;
		System.out.println("Nome: " + nomePessoa + " | " + "Idade: " + idade);
	}
}
