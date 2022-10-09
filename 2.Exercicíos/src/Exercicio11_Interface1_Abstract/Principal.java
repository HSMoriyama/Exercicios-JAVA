package Exercicio11_Interface1_Abstract;
import java.util.Scanner;

public class Principal extends Mensagem{

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Principal p = new Principal();
		
		System.out.println("Digite sua mensagem:\n");
		String msgUser = scan.nextLine(); 
		
		p.exibeMensagemA();
		p.exibeMensagemB(msgUser);

	}

	//IMPLEMENTACAO DOS METODOS ABSTRATOS
	@Override//SOBRE ESCRITA
	void exibeMensagemA() {
		System.out.println("Cuide bem dos animais");
	}
	
	@Override//SOBRE CARGA
	void exibeMensagemB(String msgUser) {
		System.out.println(msgUser);
	}
	
}
