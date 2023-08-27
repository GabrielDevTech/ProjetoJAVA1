package javaProjeto.aula.variaveis;

import java.util.Objects;

public class Aluno {
	
	
	private int idade;
	private String nome;
	private String dataNascimento;
	private String registrogeral;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double media;
	private final double aprovacaoMin = 70;
	private final double recuperacaoMin = 50;
	
	
	
	public void valorAlunoTeste(){
		setIdade(23);
		setDataMatricula("22/08/2022");
		setDataNascimento("22/05/2005");
		setNomeEscola("Celso mariano");
		setNomeMae("Andressa Souza Ferreira");
		setNomePai("Leonardo Ribeiro Leandro");
		setRegistrogeral("5468748496");
		setSerieMatriculado("oitava");
		setNota1(22);
		setNota2(55);
		setNota3(100);
		setNota4(100);
		criaMedia();
	}
	
	public Aluno(){
		
	}
	
	public Aluno(String nome){
		this.nome = nome;
	}
	public Aluno(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, registrogeral);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(registrogeral, other.registrogeral);
	}

	@Override
	public String toString() {
		return "Aluno [idade=" + idade + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", registrogeral="
				+ registrogeral + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula
				+ ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + ", nota1=" + nota1
				+ ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4 + ", media=" + media + ", aprovacaoMin="
				+ aprovacaoMin + ", recuperacaoMin=" + recuperacaoMin + "]";
	}

	public String strAprovacao(String aprovacao, String recuperacao, String reprovacao){
		return media >= aprovacaoMin?aprovacao:media >= recuperacaoMin?recuperacao:reprovacao;
	}
	
	public double criaMedia(){
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		return media;
	}
	
	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}
	
	public double getAprovacaoMin() {
		return aprovacaoMin;
	}
	
	/*
	public void setAprovacaoMin(double aprovacaoMin) {
		this.aprovacaoMin = aprovacaoMin;
	}

	public double getRecuperacaoMin() {
		return recuperacaoMin;
	}

	public void setRecuperacaoMin(double recuperacaoMin) {
		this.recuperacaoMin = recuperacaoMin;
	}
	*/
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistrogeral() {
		return registrogeral;
	}

	public void setRegistrogeral(String registrogeral) {
		this.registrogeral = registrogeral;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	
}
