package vx.poo.conceitos.polimorfismo;

public class RodarAplicacao {

	public static void main(String[] args) {
		
		/*
		 * Aqui eu criei um vetor do tipo ClasseMae e dentro desse vetor tem 3 objetos 
		 * */
		
		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), 
				new ClasseMae()};
		
		/*
		 * Aqui eu fiz um foreach para percorrer cada um desses objetos e chamei o 
		 * método1 de cada um deles 
		 * */
		
		for (ClasseMae classe: classes) {
			/*
			 * Esse método 1 está presente na classe mãe e foi sobreescrito na classe
			 * filha 1 e na classe filha 2.
			 * */
			
			// aqui aconteceu o polimorfismo pq ele chamou o método 1 de cada classe
			classe.metodo1();
		}
		
		System.out.println("");
		
		for (ClasseMae classe: classes) {
			classe.metodo2();
		}
		
		System.out.println("");
		
		/*Aqui não teve polimorfismo, teve sobreescrita
		 * porque eu estou trabalhando diretamente com a classe filha
		 * estou instanciando o objeto dele e estou chamando o método diretamente
		 * chamamos isso de sobreescrita pura*/
		ClasseFilha2 classeFilha2 = new ClasseFilha2();
		classeFilha2.metodo2();

	}

}
