package Exercicio10_Heranca4_Computador;
import java.util.Scanner;

public class Notebook extends Computador{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//SOLICITANDO MARCA AO USER
		System.out.println("Insira a marca: ");
		marca = scan.nextLine();
		
		
		//EXECUTANDO OS METODOS
		exibeMarca();
		exibeModelo();

	}
	
	//METODO exibeMarca
	public static void exibeMarca() {
		System.out.println("Marca: " + marca);
	}

}
