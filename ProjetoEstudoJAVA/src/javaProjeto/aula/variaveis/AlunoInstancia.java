package javaProjeto.aula.variaveis;

public class AlunoInstancia {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno("João");
		
		
		aluno.setDataMatricula("22/08/2022");
		aluno.setDataNascimento("22/05/2005");
		aluno.setIdade(23);
		aluno.setNomeEscola("Celso mariano");
		aluno.setNomeMae("Andressa Souza Ferreira");
		aluno.setNomePai("Leonardo Ribeiro Leandro");
		aluno.setRegistrogeral("5468748496");
		aluno.setSerieMatriculado("oitava");
		aluno.setRegistrogeral("46875656");
		
		System.out.println("----------------------------------------------");
		System.out.println("Data da matricula: " + aluno.getDataMatricula());
		System.out.println("Data de nascimento: " + aluno.getDataNascimento());
		aluno.getIdade();
		aluno.getNomeEscola();
		aluno.getNomeMae();
		aluno.getNomePai();
		aluno.getRegistrogeral();
		aluno.getSerieMatriculado();
		aluno.getRegistrogeral();
	}
	
}
