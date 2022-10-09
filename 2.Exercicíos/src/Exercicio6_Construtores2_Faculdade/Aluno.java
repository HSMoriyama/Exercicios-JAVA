package Exercicio6_Construtores2_Faculdade;

public class Aluno {

	//ATRIBUTOS ALUNO
	public String nomeAluno;
	public int matriculaAluno;
	public String nascAluno;
	public String anoIngressoAluno;
	
	//CONSTRUTOR COM 2 PARAMETROS
	public Aluno(String nome, int matricula) {
		nomeAluno = nome;
		matriculaAluno = matricula;
	}
	
	//CONSTRUTOR COM 1 PARAMETRO
	public Aluno(String nasc) {
		nascAluno = nasc;
	}
	
	//CONSTRUTOR COM 3 PARAMETROS
	public Aluno(String nome, String nasc, String anoIngresso) {
		nomeAluno = nome;
		nascAluno = nasc;
		anoIngressoAluno = anoIngresso;
	}
	
}
