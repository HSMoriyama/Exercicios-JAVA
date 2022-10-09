package Exercicio2_Disciplina;

public class Disciplina {

	public static void main(String[] args) {
		
		//Instanciando classes Professor e Laboratorio
		Professor professor1 = new Professor();
		professor1.nome = "Lucas Schlestein";
		
		Laboratorio lab1 = new Laboratorio();
		lab1.local = "Sala 2";
		
		//Imprimindo os valores dos atributos dos objs criados
		System.out.println("Nome do professor: " + professor1.nome + "\n" + 
						   "O local da aula: " + lab1.local);

	}

}
