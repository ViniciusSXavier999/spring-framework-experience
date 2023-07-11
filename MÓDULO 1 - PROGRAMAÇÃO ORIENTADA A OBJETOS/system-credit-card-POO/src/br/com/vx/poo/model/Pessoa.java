package br.com.vx.poo.model;

public class Pessoa {
	
	private static final int TAMANHO_CPF = 11;
	
	private static final int TAMANHO_CNPJ = 14;
	
	public enum TipoPessoa {FISICA, JURIDICA}
	
	public Integer código;
	public String nome;
	public String cpf;
	// classe privada
	private String documento;
	public TipoPessoa tipo;

	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		
		// fazendo validação
		if(documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento não pode ser nulo ou vazio");
		}
		
		if(documento.length() == TAMANHO_CPF) {
			setDocumento(documento, tipo = TipoPessoa.FISICA);
			
		} else if (documento.length() == TAMANHO_CNPJ) {
			setDocumento(documento, tipo = TipoPessoa.JURIDICA);
		} else {
			throw new RuntimeException("Documento invalido para pessoa fisica ou juridica");
		}
		
	}
	
	// aplicando o polimorfismo
	/*podemos notar que eu tenho o mesmo nome de método, só que eu recebi parametros
	 * diferentes em cada um deles*/
	private void setDocumento(String documentom, TipoPessoa teste) {
		this.documento = documento;
		this.tipo = tipo;
	}
	
}
