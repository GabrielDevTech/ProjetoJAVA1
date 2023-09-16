package javaProjeto.aula.classeHeranca;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javaProjeto.aula.constante.StatusAluno;

public class Aluno extends Pessoa{
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private double media;
	private final double aprovacaoMin = 70;
	private final double recuperacaoMin = 50;
	private List<Diciplina> diciplinas =  new ArrayList<Diciplina>();
	
	@Override
	public double salario() {
		return 1500.90;
	}
	
	public double getRecuperacaoMin() {
		return recuperacaoMin;
	}
	
	public List<Diciplina> getDiciplinas() {
		return diciplinas;
	}

	public void setDiciplinas(List<Diciplina> diciplina) {
		this.diciplinas = diciplina;
	}

	public void valorAlunoTeste(){
		setIdade(23);
		setDataMatricula("22/08/2022");
		setDataNascimento("22/05/2005");
		setNomeEscola("Celso mariano");
		setNomeMae("Andressa Souza Ferreira");
		setNomePai("Leonardo Ribeiro Leandro");
		setRegistrogeral("5468748496");
		setSerieMatriculado("oitava");
		
		
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
				+ ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + ", media=" + media
				+ ", aprovacaoMin=" + aprovacaoMin + ", recuperacaoMin=" + recuperacaoMin + "]";
	}

	public String strAprovacao(String aprovacao, String recuperacao, String reprovacao){
		return media >= aprovacaoMin?aprovacao:media >= recuperacaoMin?recuperacao:reprovacao;
	}
	
	public String strAprovacao(){
		return getMedia() >= aprovacaoMin?StatusAluno.APROVADO: getMedia() >= recuperacaoMin? StatusAluno.RECUPERACAO:StatusAluno.REPROVADO;
	}
	
	public double getMedia() {
		double somaNotas = 0.0;
		for(Diciplina diciplina: diciplinas) {
			somaNotas += diciplina.getNota();
		}
		media = somaNotas/diciplinas.size();
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
	@Override
	public boolean pessoaMaiorIdade() {
		return idade >= 21;
	}
	
	public String msgMaiorIdade() {
		return pessoaMaiorIdade() ? "Obaa aluno é maior de idade" : "Ixii vc é menor de idade";
	}
	
	
	
}
