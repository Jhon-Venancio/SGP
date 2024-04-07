package br.com.viertech.sgp.model;

public class Usuario {
	
	Integer id;
	String login;
	String senha;
	String nome;
	String telefone;
	String email;
	int idSetor;
	int idFuncao;
	int idNvAcesso;
	String status;
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", login=" + login + ", senha=" + senha + ", nome=" + nome + ", telefone="
				+ telefone + ", email=" + email + ", idSetor=" + idSetor + ", idNvAcesso=" + idNvAcesso + ", status="
				+ status + "]";
	}

	public int getIdFuncao() {
		return idFuncao;
	}
	public void setIdFuncao(int idFuncao) {
		this.idFuncao = idFuncao;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdSetor() {
		return idSetor;
	}
	public void setIdSetor(int idSetor) {
		this.idSetor = idSetor;
	}
	public int getIdNvAcesso() {
		return idNvAcesso;
	}
	public void setIdNvAcesso(int idNvAcesso) {
		this.idNvAcesso = idNvAcesso;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
