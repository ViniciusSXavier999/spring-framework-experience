package vx.poo.conceitos;

/*
 * Classe de exemplo para o exercicio do bootcamp spring-framework
 * */

public class Carro {
	
	// FAZENDO A CRIAÇÃO DE ATRIBUTOS
	
	String cor;
	String modelo;
	int capacidadeTanque;
	
	// construtor 
	/*por boas praticas os construtores sempre devem estar abaixo dos atributos*/
	
	public Carro() {
		
	}
	
	/*
	 * Agr temos duas formas de criar objetos, objetos vazios e objetos com valores 
	 * iniciais que será passado através do construtor.
	 * */
	
	// SOBRECARGA DE CONSTRUTOR
	public Carro(String cor, String modelo, int capacidadeTanque) {
		/*Esse this faz referencia aos objetos da classe, diferencia o objeto do parametro
		 * do construtor*/
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}




	/*
	 * O get retorna alguma coisa, aqui no caso ira retornar a cor.
	 * */
	public String getCor() {
		return cor;
	}
	
	/*
	 * o SET é usado para setar, colocar um valor no atributo, aqui no caso eu estou
	 * querendo colocar um valor no método cor.
	 * */
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	// Método do total para encher o tanque
	
	public double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque * valorCombustivel;
		
	}
	
	

}
