package javaProjeto.aula.aluno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javaProjeto.aula.constante.StatusAluno;

public class AlunosInstancia2 {

	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		int continuaPessoa = 0;
		while (continuaPessoa == 0) {

			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
			String nome = JOptionPane.showInputDialog("Nome:");
			String dataMatricula = JOptionPane.showInputDialog("Data Matricula:");
			String dataNascimento = JOptionPane.showInputDialog("Data de nascimento:");
			String nomeEscola = JOptionPane.showInputDialog("Nome da escolar:");
			String nomeMae = JOptionPane.showInputDialog("Nome da mae:");
			String nomePai = JOptionPane.showInputDialog("Nome do pai:");
			String registroGeral = JOptionPane.showInputDialog("Registro geral:");
			String serieMatriculado = JOptionPane.showInputDialog("Serie:");
			String numMateriaStr = JOptionPane.showInputDialog("Quantidade de materias");
			int numMateria = Integer.parseInt(numMateriaStr);

			Aluno aluno = new Aluno(nome);

			aluno.setIdade(idade);
			aluno.setDataMatricula(dataMatricula);
			aluno.setDataNascimento(dataNascimento);
			aluno.setNomeEscola(nomeEscola);
			aluno.setNomeMae(nomeMae);
			aluno.setNomePai(nomePai);
			aluno.setRegistrogeral(registroGeral);
			aluno.setSerieMatriculado(serieMatriculado);

			for (int i = 0; i < numMateria; i++) {
				String diciplinaNome = JOptionPane.showInputDialog("Digite o nome da matéria");
				String notaStr = JOptionPane.showInputDialog("Digite a nota (de 0 a 100)");

				double nota = Double.parseDouble(notaStr);

				Diciplina diciplina = new Diciplina(diciplinaNome, nota);
				aluno.getDiciplinas().add(diciplina);
			}

			int removerDiciplina = JOptionPane.showConfirmDialog(null, "Deseja remover diciplina(s)?");

			if (removerDiciplina == 0) {
				while (removerDiciplina == 0) {
					String diciplinaRemoveStr = JOptionPane
							.showInputDialog("Qual indice da diciplina que deseja remover(apartir do 1):");
					int indiceDiciplina = Integer.valueOf(diciplinaRemoveStr) - 1;
					aluno.getDiciplinas().remove(indiceDiciplina);
					removerDiciplina = JOptionPane.showConfirmDialog(null, "Deseja remover outro");

				}
			}

			alunos.add(aluno);
			continuaPessoa = JOptionPane.showConfirmDialog(null, "Deseja continuar inserindo outra pessoa?");
		}

		
		
		int desejaExcluir = JOptionPane.showConfirmDialog(null, "Deseja excuir algum aluno");
		if (desejaExcluir == 0) {
			String excluirAluno = JOptionPane.showInputDialog("qual aluno deseja excluir");
			for (Aluno aluno2 : alunos) {
				if (aluno2.getNome().equalsIgnoreCase(excluirAluno)) {
					alunos.remove(aluno2);
					break;
				}

			}

		}
		
		for(Aluno aluno: alunos) {
			
			if(aluno.strAprovacao().equalsIgnoreCase(StatusAluno.APROVADO)) {
				alunosAprovados.add(aluno);
			}else if(aluno.strAprovacao().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				alunosRecuperacao.add(aluno);
			}else if(aluno.strAprovacao().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				alunosReprovados.add(aluno);
			}
		}
		
		
		System.out.println("---------------------------- Lista dos Aprovados ----------------------------");
		for (Aluno aluno: alunosAprovados) {
			System.out.println("Nome: " + aluno.getNome() + "Resultado: " + aluno.strAprovacao() + "media: " + aluno.getMedia());
		}
		
		System.out.println("---------------------------- Lista dos Recuperação ----------------------------");
		for (Aluno aluno: alunosRecuperacao) {
			System.out.println("Nome: " + aluno.getNome() + "Resultado: " + aluno.strAprovacao() + "media: " + aluno.getMedia());
		}
		
		System.out.println("---------------------------- Lista dos Reprovados ----------------------------");
		for (Aluno aluno: alunosReprovados) {
			System.out.println("Nome: " + aluno.getNome() + "Resultado: " + aluno.strAprovacao() + "media: " + aluno.getMedia());
		}
		
		
		
	}
}