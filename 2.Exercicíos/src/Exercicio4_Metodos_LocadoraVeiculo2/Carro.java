package Exercicio4_Metodos_LocadoraVeiculo2;

public class Carro {
	
		//ATRIBUTOS DE CARRO
		public String fabricante;
		public String modelo;
		
		
		//METODO QUE ATRIBUI VALORES AOS ATRIBUTOS
		public void addValores(String fab, String mdl) {
			fabricante = fab;
			modelo = mdl;	
		}
		
		
		//METODO QUE EXIBE OS VALORES DOS ATRIBUTOS DE CARRO
		public void exibeValores() {	
			System.out.println("\nCarro: " +"Fabricante: " + fabricante + " " + "Modelo: " + modelo + "\n");
		}
		
}
	
