package Exercicio9_Heranca3_Funcionario;
import java.util.Scanner;

public class Principal{

	public static void main(String[] args) {
	
		//Funcionario func1 = new Funcionario("Higor", 26, "3521-9772", "5", "Operador", "Operar maquinario");
		//func1.addFuncionario("Higor", 26, "3521-9772", "5", "Operador", "Operar maquinario");
		//func1.exibeFuncionario();
		
		
		
		Scanner scan = new Scanner(System.in);
		
		//DADOS DO FUNCIONARIO 1
		System.out.println("Insira o nome do Funcionario 1: ");
		String nomeFunc1 = scan.nextLine();
		
		System.out.println("Insira a idade do Funcionario 1: ");
		int idadeFunc1 = scan.nextInt();
		
		System.out.println("Insira o telefone do Funcionario 1: ");
		scan.nextInt();//LIMPEZA DO BUFFER
		String telFunc1 = scan.nextLine();
		
		System.out.println("Insira o setor do Funcionario 1: ");
		String setorFunc1 = scan.nextLine();
		
		System.out.println("Insira o cargo do Funcionario 1: ");
		String cargoFunc1 = scan.nextLine();
		
		System.out.println("Insira a função do Funcionario 1: ");
		String funcaoFunc1 = scan.nextLine();
		
		//PASSA OS DADOS PARA O CONSTRUTOR DE FUNCIONARIO
		Funcionario func1 = new Funcionario(nomeFunc1, idadeFunc1, telFunc1, setorFunc1, cargoFunc1, funcaoFunc1);
		
		
		//DADOS DO FUNCIONARIO 2
		System.out.println("Insira o nome do Funcionario 2: ");
		String nomeFunc2 = scan.nextLine();
		
		System.out.println("Insira a idade do Funcionario 2: ");
		int idadeFunc2 = scan.nextInt();
		
		System.out.println("Insira o telefone do Funcionario 2: ");
		scan.nextInt();//LIMPEZA DO BUFFER
		String telFunc2 = scan.nextLine();
		
		System.out.println("Insira o setor do Funcionario 2: ");
		String setorFunc2 = scan.nextLine();
		
		System.out.println("Insira o cargo do Funcionario 2: ");
		String cargoFunc2 = scan.nextLine();
		
		System.out.println("Insira a função do Funcionario 2: ");
		String funcaoFunc2 = scan.nextLine();
		
		//PASSA OS DADOS PARA O CONSTRUTOR DE FUNCIONARIO
		Funcionario func2 = new Funcionario(nomeFunc2, idadeFunc2, telFunc2, setorFunc2, cargoFunc2, funcaoFunc2);
		
		
		//DADOS DO FUNCIONARIO 3
		System.out.println("Insira o nome do Funcionario 3: ");
		String nomeFunc3 = scan.nextLine();
		
		System.out.println("Insira a idade do Funcionario 3: ");
		int idadeFunc3 = scan.nextInt();
		
		System.out.println("Insira o telefone do Funcionario 3: ");
		scan.nextInt();//LIMPEZA DO BUFFER
		String telFunc3 = scan.nextLine();
		
		System.out.println("Insira o setor do Funcionario 3: ");
		String setorFunc3 = scan.nextLine();
		
		System.out.println("Insira o cargo do Funcionario 3: ");
		String cargoFunc3 = scan.nextLine();
		
		System.out.println("Insira a função do Funcionario 3: ");
		String funcaoFunc3 = scan.nextLine();
		
		//PASSA OS DADOS PARA O CONSTRUTOR DE FUNCIONARIO
		Funcionario func3 = new Funcionario(nomeFunc3, idadeFunc3, telFunc3, setorFunc3, cargoFunc3, funcaoFunc3);
		
		func1.exibeFuncionario();
		func2.exibeFuncionario();
		func3.exibeFuncionario();
		
	}

}
