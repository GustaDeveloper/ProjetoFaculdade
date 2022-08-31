package dukeview;

import java.util.Scanner;

import dukecontroller.Carrinho;
import dukemodel.Calça;

public class FrenteLoja {
	public static void main(String[] args) {
		System.out.println("1-Adicionar Calça");
		System.out.println("2-Adicionar Camisa");
		System.out.println("3-Adicionar Sapato");
		System.out.println("4-Adicionar Meia");
		System.out.println("5-Adicionar Cinto");
		System.out.println("Digite sua opção: ");
		
		Scanner leia = new Scanner(System.in); // Nova variavél do tipo scanner para ler o teclado
		
		int op = leia.nextInt(); // .nextInt para ler a variavél como int
		
		if(op == 1) {
			// Adicionar Calça
			Calça cal = new Calça();
			System.out.println("Digite o tipo da calça: ");
			cal.setTpCalca(leia.next()); // Usa o Setter para adicionar o input na variável 
			
			System.out.println("Digite se tem cinto (S/N): ");
			String temCinto = leia.next();
			if(temCinto.equalsIgnoreCase("s")) {
				cal.setTemCinto(true); 
			}
			
			System.out.println("Digite a cor da calça: ");
			cal.setCor(leia.next()); 
			
			System.out.println("Digite o tamanho da calça: ");
			cal.setTamanho(leia.next()); 
			
			System.out.println("Digite o preço da calça: ");
			cal.setPreco(leia.nextDouble());
			
			System.out.println("Digite a marca da calça: ");
			cal.setMarca(leia.next());
			
			System.out.println("Digite o modelo da calça: ");
			cal.setModelo(leia.next());
			
			Carrinho car = new Carrinho();
			car.adicionarCalca(cal); // Adiciona Calça 
			
		}
		
		if(op == 2) {
			// Adicionar camisa
		}
	}
}
