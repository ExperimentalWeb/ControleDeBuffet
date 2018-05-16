package Buffet;

public class Cliente {
	
	private String nome;
	private String telefone;
	private String email;
	private double idade;
	
	
	// get e set//
	public String getNome() {
		return nome;
	}


	public double getIdade() {
		return idade;
	}


	public void setIdade(double idade) {
		this.idade = idade;
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


	public Cliente(String nome, String telefone, String email, Double idade) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.idade  = idade;
	}


	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", email=" + email + "]";
	}

	
	

	
	
	

}
