package BancoDados;

public class Usuario {
	private String nomeUsuario, nome, nomeNovo;
	private String senha, idade;
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getNomeNovo() {
		return nomeNovo;
	}

	public void setNomeNovo(String nomeNovo) {
		this.nomeNovo = nomeNovo;
	}

}
