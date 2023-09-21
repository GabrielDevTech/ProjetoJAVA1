package javaProjeto.aula.excecao;

public class ExecaoProcessarNotas extends Exception{
	
	public ExecaoProcessarNotas(String erro) {
		super("Vix um erro no processamento do arquivo ao processar as notas do aluno." + erro);
	}
	
}
