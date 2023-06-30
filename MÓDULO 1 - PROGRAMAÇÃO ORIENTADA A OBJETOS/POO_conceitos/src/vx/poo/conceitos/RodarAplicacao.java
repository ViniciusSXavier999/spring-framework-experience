package vx.poo.conceitos;

public class RodarAplicacao {

	// ponto de entrada para aplicação funcionar
	public static void main(String[] args) {

		/*
		 * agora eu vou criar um objeto do tipo da classe carro chamado carro1 e depois
		 * vou chamar o construtor padrão
		 * 
		 */
		
		Carro carro1 = new Carro();
		
		carro1.setModelo("Ferrari");
		carro1.setCor("Preto");
		carro1.setCapacidadeTanque(50);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println("O total a ser pago para encher o tanque é: " + 
		carro1.totalValorTanque(8));
		System.out.println();
		
		/*Criando objeto carro e passando valores através do construtor
		 * */
		
		Carro carro2 = new Carro("Azul", "Porshe", 60 );
		
		System.out.println(carro2.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.totalValorTanque(9.65));
		
	}

}
