package javaProjeto.executavel;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sobrenome;
	private Date dataNascimento;
	private Date dataNascimento2;
	
	
	public Date getDataNascimento2() {
		return dataNascimento2;
	}
	public void setDataNascimento2(Date dataNascimento2) {
		this.dataNascimento2 = dataNascimento2;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
