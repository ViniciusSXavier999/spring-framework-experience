package br.com.vx.poo.model;

import java.util.List;

public class Cliente {
	
	Integer código;
	String nome;
	String cpf;
	
	// como sera bastante endereços, eu posso utilizar da minha interface LIST.
	List<Endereco> enderecos;
	
	// aqui estou dizendo que estou utilizando uma classe endereço
//	Endereco endereco;

}
