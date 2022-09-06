package dukecontroller;

import dukemodel.Calça;
import dukemodel.Camisa;
import dukemodel.Cinto;
import dukemodel.Sapato;
import dukemodel.Underwear;

public class Carrinho {
	
	// Atributos
	private static final int TAM_ESTOQUE = 100;
	private double totalPedido = 0.0;
	
	// Métodos
	
	Calça calcaVetor[] = new Calça[TAM_ESTOQUE]; // Vetores
	Camisa camisaVetor[] = new Camisa[TAM_ESTOQUE];
	Sapato sapatoVetor[] = new Sapato[TAM_ESTOQUE];
	Underwear underVetor[] = new Underwear[TAM_ESTOQUE];
	Cinto cintoVetor[] = new Cinto[TAM_ESTOQUE];
	
	int contadorCalca = 0;
	public void adicionarCalca(Calça cal) {
		this.calcaVetor[contadorCalca] = new Calça();
		this.calcaVetor[contadorCalca] = cal;
		this.contadorCalca++;
	}
	
	int contadorUnderwear = 0;
	public void adicionarUnderwear(Underwear und) {
		this.underVetor[contadorUnderwear] = new Underwear();
		this.underVetor[contadorUnderwear] = und;
		this.contadorUnderwear++;
	}
	
	int contadorCamisa = 0;
	public void adicionarCamisa(Camisa cam) {
		this.camisaVetor[contadorCamisa] = new Camisa();
		this.camisaVetor[contadorCamisa] = cam;
		this.contadorCamisa++;
		
	}
	
	int contadorSapato = 0;
	public void adicionarSapato(Sapato sap) {
		this.sapatoVetor[contadorSapato] = new Sapato();
		this.sapatoVetor[contadorSapato] = sap;
		this.contadorSapato++;
	}
	
	int contadorCinto = 0;
	public void adicionarCinto(Cinto cin) {
		this.cintoVetor[contadorCinto] = new Cinto();
		this.cintoVetor[contadorCinto] = cin;
		this.contadorCinto++;
	}
	
	public void fecharPedido() {
		for(int i = 0; i < this.contadorCalca; i++) {
			totalPedido = totalPedido + calcaVetor[i].getPreco();
		}
		System.out.println("O valor a pagar é de: " + totalPedido);
	}
	
}
