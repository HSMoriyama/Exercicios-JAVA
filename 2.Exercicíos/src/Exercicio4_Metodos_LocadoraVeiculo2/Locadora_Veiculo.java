package Exercicio4_Metodos_LocadoraVeiculo2;

import java.util.Scanner;

public class Locadora_Veiculo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//INSTANCIANDO carro1 
		Carro carro1 = new Carro();
		
		System.out.println("\nInsira o fabricante do carro!\n");
		String fabCarro1 = scan.nextLine();
		
		System.out.println("\nInsira o modelo do carro!\n");
		String mdlCarro1 = scan.nextLine();
		
		carro1.addValores(fabCarro1, mdlCarro1);
		
		//INSTANCIANDO moto1 
		Moto moto1 = new Moto();
		
		System.out.println("\nInsira o fabricante da primeira moto!\n");
		String fabMoto1 = scan.nextLine();
		
		System.out.println("\nInsira o modelo da primeira moto!\n");
		String mdlMoto1 = scan.nextLine();
		
		System.out.println("\nInsira as cilindradas da primeira moto!");
		String cilindsMoto1 = scan.nextLine();
		
		moto1.addValores(fabMoto1, mdlMoto1, cilindsMoto1);
		
		
		//INSTANCIANDO moto2 
		Moto moto2 = new Moto();
		
		System.out.println("\nInsira o fabricante da segunda moto!\n");
		String fabMoto2 = scan.nextLine();
		
		System.out.println("\nInsira o modelo da segunda moto!\n");
		String mdlMoto2 = scan.nextLine();
		
		System.out.println("\nInsira as cilindradas da segunda moto!");
		String cilindsMoto2 = scan.nextLine();
		
		moto2.addValores(fabMoto2, mdlMoto2, cilindsMoto2);
		
		
		//FAZENDO IMPRESSAO DO CARRO E DAS DUAS MOTOS 
		carro1.exibeValores();
		
		moto1.exibeValores();
		
		moto2.exibeValores();
		
		scan.close();
	}

}
