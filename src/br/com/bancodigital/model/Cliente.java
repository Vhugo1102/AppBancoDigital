package br.com.bancodigital.model;

import java.time.LocalDate;

import br.com.bancodigital.enums.CategoriaCliente;

public class Cliente {
	private int idCliente;
	private String nome;
	private String email;
	private String telefone;
	private String cpf;
	private String endereco;
	private String cep;
	private String cidade;
	private String uf;
	private CategoriaCliente categoria;
	private LocalDate dataNascimento;

	public Cliente(int idCliente, String nome, String email, String telefone, String cpf, String endereco, String cep,
			String cidade, String uf, CategoriaCliente categoria, LocalDate dataNascimento) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
		this.categoria = categoria;
		this.dataNascimento = dataNascimento;
	}

	// Getters e setters
	public String getNome() {
		return nome;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public CategoriaCliente getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaCliente categoria) {
		this.categoria = categoria;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Cliente{" + "nome='" + nome + '\'' + ", email='" + email + '\'' + ", telefone='" + telefone + '\''
				+ ", cpf='" + cpf + '\'' + ", endereco='" + endereco + '\'' + ", cep='" + cep + '\'' + ", cidade='"
				+ cidade + '\'' + ", uf='" + uf + '\'' + ", categoria=" + categoria + ", dataNascimento="
				+ dataNascimento + '}';
	}
}