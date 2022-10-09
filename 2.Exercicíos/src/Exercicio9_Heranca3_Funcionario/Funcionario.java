package Exercicio9_Heranca3_Funcionario;

//HERDA nome, idade e telefone de Pessoa
public class Funcionario extends Pessoa{

	//ATRIBUTOS FUNCIONARIO
	protected static String setor;
	protected static String cargo;
	protected static String funcao;
	
	public Funcionario(String nomeFunc, int idadeFunc, 
					   String telefoneFunc, String setorFunc, 
					   String cargoFunc, String funcaoFunc) {
		
		nome = nomeFunc;
		idade = idadeFunc;
		telefone = telefoneFunc;
		setor = setorFunc;
		cargo = cargoFunc;
		funcao = funcaoFunc;
		
	}
	
	public void exibeFuncionario() {
		System.out.println("\nNome: " + nome + " | " + "Idade: " + idade +
						   " | " + "Telefone: " + telefone + " | " + "Setor: " +
						   " | " + "Cargo: " + cargo + " | " + "Função: " + funcao + "\n");
	}
	
	
}
