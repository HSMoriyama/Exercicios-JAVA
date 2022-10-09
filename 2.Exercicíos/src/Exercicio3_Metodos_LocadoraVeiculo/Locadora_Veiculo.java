package Exercicio3_Metodos_LocadoraVeiculo;

public class Locadora_Veiculo {

	public static void main(String[] args) {
		
		//INSTANCIANDO CARRO E GERANDO UM NOVO OBJ 
		Carro carro1 = new  Carro();
		
		//CHAMANDO METODO addValores E ATRIBUINDO PARA carro1 OS VALORES
		carro1.addValores("VW", "Gol");
		
		//CHAMANDO METODO exibeValores PARA EXIBIR OS VALORES DE carro1
		carro1.exibeValores();

	}

}
