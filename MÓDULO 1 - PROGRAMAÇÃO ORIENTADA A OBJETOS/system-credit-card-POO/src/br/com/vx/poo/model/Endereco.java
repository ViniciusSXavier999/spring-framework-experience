package br.com.vx.poo.model;

/* ao inves de criar endereco 1, 2, 3, 4 na minha classe cliente, eu utilizo do conceito 
da associação e faço a separação do endereço nessa classe nova*/

public class Endereco {
	
	// O ENUM É SE FOSSE UMA CLASSE;
	enum TipoEndereco {RESIDENCIAL, 
		ENTREGA,
		TRABALHO}
	
	String endereco;
	String numero;
	String complemento;
	String cidade;
	String bairro;
	String estado;
	String cep;
	

}
