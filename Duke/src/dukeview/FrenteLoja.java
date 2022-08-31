package dukeview;

import java.util.Scanner;

import dukecontroller.Carrinho;
import dukemodel.Cal�a;

public class FrenteLoja {
	public static void main(String[] args) {
		System.out.println("1-Adicionar Cal�a");
		System.out.println("2-Adicionar Camisa");
		System.out.println("3-Adicionar Sapato");
		System.out.println("4-Adicionar Meia");
		System.out.println("5-Adicionar Cinto");
		System.out.println("Digite sua op��o: ");
		
		Scanner leia = new Scanner(System.in); // Nova variav�l do tipo scanner para ler o teclado
		
		int op = leia.nextInt(); // .nextInt para ler a variav�l como int
		
		if(op == 1) {
			// Adicionar Cal�a
			Cal�a cal = new Cal�a();
			System.out.println("Digite o tipo da cal�a: ");
			cal.setTpCalca(leia.next()); // Usa o Setter para adicionar o input na vari�vel 
			
			System.out.println("Digite se tem cinto (S/N): ");
			String temCinto = leia.next();
			if(temCinto.equalsIgnoreCase("s")) {
				cal.setTemCinto(true); 
			}
			
			System.out.println("Digite a cor da cal�a: ");
			cal.setCor(leia.next()); 
			
			System.out.println("Digite o tamanho da cal�a: ");
			cal.setTamanho(leia.next()); 
			
			System.out.println("Digite o pre�o da cal�a: ");
			cal.setPreco(leia.nextDouble());
			
			System.out.println("Digite a marca da cal�a: ");
			cal.setMarca(leia.next());
			
			System.out.println("Digite o modelo da cal�a: ");
			cal.setModelo(leia.next());
			
			Carrinho car = new Carrinho();
			car.adicionarCalca(cal); // Adiciona Cal�a 
			
		}
		
		if(op == 2) {
			// Adicionar camisa
		}
	}
}
