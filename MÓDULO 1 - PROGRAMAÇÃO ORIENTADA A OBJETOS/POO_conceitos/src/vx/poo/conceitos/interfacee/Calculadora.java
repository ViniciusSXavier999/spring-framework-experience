package vx.poo.conceitos.interfacee;

/*Essa filosofia de uma interface, obrigar terceiros a implementar os seus métodos*/

public class Calculadora implements OperacaoMatematica {

	@Override
	public void soma(double a, double b) {
		System.out.println("Soma: " + a + b);
		
	}

	@Override
	public void subtracao(double a, double b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicacao(double a, double b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divisao(double a, double b) {
		// TODO Auto-generated method stub
		
	}
	
	

}
