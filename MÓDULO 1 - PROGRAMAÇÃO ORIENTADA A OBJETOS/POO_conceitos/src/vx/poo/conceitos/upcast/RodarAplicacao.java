package vx.poo.conceitos.upcast;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		/*
		 * Nesta primeira linha eu peguei a classe Funcionario a esquerda, criei uma 
		 * variavel(funcionario) dentro deste método do tipo funcionario e criei um
		 * objeto do tipo funcionario e guardei dentro da variavel  
		 * */
		Funcionario funcionario = new Funcionario();
		
		// Aqui aconteceu o que chamamos de UPCAST
		
		// basicamente aqui eu estou transformando minhas classes no tipo funcionario.
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();
		

	}

}
