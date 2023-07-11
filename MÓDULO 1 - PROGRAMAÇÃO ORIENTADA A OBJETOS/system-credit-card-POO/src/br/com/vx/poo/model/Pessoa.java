package br.com.vx.poo.model;

public class Pessoa {
	
	public enum TipoPessoa {FISICA, JURIDICA}
	
	public Integer código;
	public String nome;
	public String cpf;
	public TipoPessoa tipoPessoa;

}
