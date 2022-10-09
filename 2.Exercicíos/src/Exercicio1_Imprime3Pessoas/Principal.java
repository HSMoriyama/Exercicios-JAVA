package Exercicio1_Imprime3Pessoas;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciaremos 3 objs gerados apartir de Pessoa 
		Pessoa pessoa1 = new Pessoa();
		pessoa1.idade = 45; //Atribuindo um valor ao atributo idade de pessoa1
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.idade = 25; //Atribuindo um valor ao atributo idade de pessoa2
		 
		Pessoa pessoa3 = new Pessoa();
		pessoa3.idade = 82; //Atribuindo um valor ao atributo idade de pessoa3
		
		//Impressão dos atributos idade de cada obj
		System.out.println("Idade Pessoa 1: " + pessoa1.idade + "\n" +
						   "Idade Pessoa 2: " + pessoa2.idade + "\n" +
						   "Idade Pessoa 3: " + pessoa3.idade + "\n");
		
	}

}
