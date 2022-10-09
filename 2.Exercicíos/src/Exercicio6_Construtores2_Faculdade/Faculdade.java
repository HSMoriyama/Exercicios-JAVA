package Exercicio6_Construtores2_Faculdade;

public class Faculdade {

	public static void main(String[] args) {
		
		//ALUNO 1 - 2 PARAMETROS
		Aluno aluno1 = new Aluno("Higor", 611);
		System.out.println("Aluno: " + aluno1.nomeAluno + 
						   " | " + aluno1.matriculaAluno);
		
		//ALUNO 2 - 1 PARAMETRO
		Aluno aluno2 = new Aluno("13/08/1996");
		System.out.println("Aluno: " + aluno2.nascAluno);
		
		//ALUNO 3 - 3 PARAMETROS
		Aluno aluno3 = new Aluno("Higor", "13/08/1996", "2021");
		System.out.println("Aluno: " + aluno3.nomeAluno +
						   " | " + "Nascimento: " +aluno3.nascAluno +
						   " | " + "Ano de ingresso: " + aluno3.anoIngressoAluno);
	}

}
