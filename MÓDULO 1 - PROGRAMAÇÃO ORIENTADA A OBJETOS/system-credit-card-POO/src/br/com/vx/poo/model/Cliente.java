package br.com.vx.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	
	public String numCartao;
	
	// como sera bastante endereços, eu posso utilizar da minha interface LIST.
	private List<Endereco> enderecos;
	
	public void adicionaEnderecos(Endereco enderec) {
		if(enderec == null) {
			throw new RuntimeException ("Endereço não pode ser nulo");
		}
		
		if(enderec.cep == null) {
			throw new RuntimeException("Cep não pode ser nulo");
		} else {
			getEnderecos().add(enderec);
		}
		
	}
	
	// aqui estou dizendo que estou utilizando uma classe endereço
//	Endereco endereco;

	
	/*eu tirei o set enderecos pq eu nao quero permitir que os usuarios digitem
	 * uma lista de endereços, mas sim só endereço por endereço.*/
	/*
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}*/
	
	private List<Endereco> getEnderecos() {
		if(enderecos == null) {
			enderecos = new ArrayList<Endereco>();
		}
		return enderecos;
	}
	
}
