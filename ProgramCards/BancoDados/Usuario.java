package BancoDados;

public class Usuario {
	private String nomeUsuario, nome, nomeNovo;
	private String senha, email, resultadoQuest;
	
	public Usuario(String nomeUsuario, String nome, String nomeNovo, String senha, String email, String resultadoQuest) {
		super();
		this.nomeUsuario = nomeUsuario;
		this.nome = nome;
		this.nomeNovo = nomeNovo;
		this.senha = senha;
		this.email = email;
		this.resultadoQuest = resultadoQuest;
	}
	
	public Usuario() {
		
	}

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

	public String getNomeNovo() {
		return nomeNovo;
	}

	public void setNomeNovo(String nomeNovo) {
		this.nomeNovo = nomeNovo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResultadoQuest() {
		return resultadoQuest;
	}

	public void setResultadoQuest(String resultadoQuest) {
		this.resultadoQuest = resultadoQuest;
	}

}
