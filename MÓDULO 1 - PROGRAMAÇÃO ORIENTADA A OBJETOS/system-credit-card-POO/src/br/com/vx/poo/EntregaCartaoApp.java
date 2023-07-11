package br.com.vx.poo;

import br.com.vx.poo.model.Cliente;
import br.com.vx.poo.model.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Endereco end = new Endereco();
		// dados do endereços
		 end.cep = ("0000000");
		
		Cliente cliente = new Cliente();
		// dados do cliente
		cliente.adicionaEnderecos(end);
		System.out.println("Endereço adicionado com sucesso");
	}

}
