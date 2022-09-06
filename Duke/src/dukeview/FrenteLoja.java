package dukeview;

import java.util.Scanner;

import dukecontroller.Carrinho;
import dukemodel.Cal�a;
import dukemodel.Camisa;
import dukemodel.Cinto;
import dukemodel.Sapato;
import dukemodel.Underwear;

public class FrenteLoja {
	public static void main(String[] args) {
		
		Carrinho car = new Carrinho(); // Objeto carrinho controla o todo
		while(true) {
			System.out.println("1-Adicionar Cal�a");
			System.out.println("2-Adicionar Camisa");
			System.out.println("3-Adicionar Sapato");
			System.out.println("4-Adicionar Underwear");
			System.out.println("5-Adicionar Cinto");
			System.out.println("6-Fechar Pedido.");
			System.out.println("Digite sua op��o: ");
			
			Scanner leia = new Scanner(System.in); // Nova variav�l do tipo scanner para ler o teclado
			
			int op = leia.nextInt(); // .nextInt para ler a variav�l como int
			
			if(op == 1) {
				// Adicionar Cal�a
				System.out.println("Digite o tipo da Cal�a: ");
				Cal�a cal = new Cal�a();
				cal.setTpCalca(leia.next()); // Usa o Setter para adicionar o input na vari�vel 
				
				System.out.println("Digite se a Cal�a tem Cinto (S/N): ");
				String temCinto = leia.next();
				if(temCinto.equalsIgnoreCase("s")) {
					cal.setTemCinto(true); 
				}
				
				System.out.println("Digite a cor da Cal�a: ");
				cal.setCor(leia.next()); 
				
				System.out.println("Digite o tamanho da Cal�a: ");
				cal.setTamanho(leia.next()); 
				
				System.out.println("Digite o pre�o da Cal�a: ");
				cal.setPreco(leia.nextDouble());
				
				System.out.println("Digite a marca da Cal�a: ");
				cal.setMarca(leia.next());
				
				System.out.println("Digite o modelo da Cal�a: ");
				cal.setModelo(leia.next());
				
				car.adicionarCalca(cal); // Adiciona Cal�a no Carrinho
				
			}
			
			if(op == 2) {
				// Adicionar camisa
				Camisa cam = new Camisa();
				System.out.println("Digite o tipo da Gola da Camisa: ");
				cam.setTpGola(leia.next());
				System.out.println("Digite a cor da Camisa: ");
				cam.setCor(leia.next());
				System.out.println("Digite a marca da Camisa: ");
				cam.setMarca(leia.next());
				System.out.println("Digite o modelo da Camisa: ");
				cam.setModelo(leia.next());
				System.out.println("Digite o tamanho da Camisa: ");
				cam.setTamanho(leia.next());
				System.out.println("Digite o pre�o da Camisa: ");
				cam.setPreco(leia.nextDouble());
				
				car.adicionarCamisa(cam);
				
			}
			
			if(op == 3) {
				// Adicionar Sapato
				System.out.println("Digite a Data de Fabrica��o do Sapato: ");
				Sapato sap = new Sapato();
				sap.setDtFabricacao(leia.next());
				System.out.println("Digite a cor do Sapato: ");
				sap.setCor(leia.next());
				System.out.println("Digite a marca do Sapato: ");
				sap.setMarca(leia.next());
				System.out.println("Digite o modelo do Sapato: ");
				sap.setModelo(leia.next());
				System.out.println("Digite o tamanho do Sapato: ");
				sap.setTamanho(leia.next());
				System.out.println("Digite o pre�o do Sapato: ");
				sap.setPreco(leia.nextDouble());
				
				car.adicionarSapato(sap);
				
			}
			
			if(op == 4) {
				// Adicionar Underwear
				System.out.println("Digite o tipo de Underwear: ");
				Underwear und = new Underwear();
				und.setTpCano(leia.next());
				System.out.println("Digite a cor da Underwear: ");
				und.setCor(leia.next());
				System.out.println("Digite a marca da Underwear: ");
				und.setMarca(leia.next());
				System.out.println("Digite o modelo da Underwear: ");
				und.setModelo(leia.next());
				System.out.println("Digite o tamanho da Underwear: ");
				und.setTamanho(leia.next());
				System.out.println("Digite o pre�o da Underwear: ");
				und.setPreco(leia.nextDouble());
				
				car.adicionarUnderwear(und);
			}
			
			if(op == 5) {
				// Adicionar Cinto
				System.out.println("Digite se o Cinto � de Couro (S/N): ");
				Cinto cin = new Cinto();
				String eCouro = leia.next();
				if(eCouro.equalsIgnoreCase("s")) {
					cin.seteCouro(true); 
				}
				
				System.out.println("Digite a quantidade de furos do Cinto: ");
				cin.setQtdeFuros(leia.nextInt());
				System.out.println("Digite a cor do Cinto: ");
				cin.setCor(leia.next());
				System.out.println("Digite a marca do Cinto: ");
				cin.setMarca(leia.next());
				System.out.println("Digite o modelo do Cinto: ");
				cin.setModelo(leia.next());
				System.out.println("Digite o tamanho do Cinto: ");
				cin.setTamanho(leia.next());
				System.out.println("Digite o pre�o do Cinto: ");
				cin.setPreco(leia.nextDouble());
				
				car.adicionarCinto(cin);
			}
			
			if(op == 6) {
				car.fecharPedido();
				System.exit(0);
			}
		}
	}
}
