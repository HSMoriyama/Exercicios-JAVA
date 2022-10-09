package Exercicio4_Metodos_LocadoraVeiculo2;

public class Moto {

	//ATRIBUTOS DE MOTO
	public String fabricante;
	public String modelo;
	public String cilindradas;
	
	//METODO PARA ATRIBUIR VALORES AOS ATRIBUTOS DE MOTO
	public void addValores(String fab, String mdl, String cilindradasMoto) {
		fabricante = fab;
		modelo = mdl;
		cilindradas = cilindradasMoto;
	}

	//METODO PARA EXIBIR OS VALORES DOS ATRIBUTOS DE MOTO
	public void exibeValores() {
		System.out.println("\nMoto: " + "Fabricante: " + fabricante + " | " + 
						   "Modelo: " + modelo + " | " + 
						   "Cilindrada: " + cilindradas + "\n");
	}
}