package Exercicio3_Metodos_LocadoraVeiculo;

public class Carro {

	//ATRIBUTOS DE CARRO
	public String fabricante;
	public String modelo;
	
	
	//ATRIBUI VALORES AOS ATRIBUTOS
	public void addValores(String fab, String mdl) {
		fabricante = fab;
		modelo = mdl;	
	}
	
	
	//EXIBE OS VALORES DOS ATRIBUTOS DE CARRO
	public void exibeValores() {	
		System.out.println("Fabricante: " + fabricante + " " + modelo );
	}
	
}