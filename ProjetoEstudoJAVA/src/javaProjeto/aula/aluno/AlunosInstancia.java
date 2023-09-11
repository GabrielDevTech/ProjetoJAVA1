package javaProjeto.aula.aluno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AlunosInstancia {

	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		int continuaPessoa = 0;
		while(continuaPessoa == 0) {
			
			
			
			
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
			
			
			for(int i = 0; i<numMateria; i++) {
				String diciplinaNome = JOptionPane.showInputDialog("Digite o nome da matéria");
				String notaStr = JOptionPane.showInputDialog("Digite a nota (de 0 a 100)");
				
				double nota = Double.parseDouble(notaStr);
				
				Diciplina diciplina = new Diciplina(diciplinaNome, nota);
				aluno.getDiciplinas().add(diciplina);
			}
			
			int removerDiciplina = JOptionPane.showConfirmDialog(null, "Deseja remover diciplina(s)?");
			
			if(removerDiciplina == 0) {
				while(removerDiciplina == 0) {
					String diciplinaRemoveStr = JOptionPane.showInputDialog("Qual indice da diciplina que deseja remover(apartir do 1):");
					int indiceDiciplina = Integer.valueOf(diciplinaRemoveStr)-1;
					aluno.getDiciplinas().remove(indiceDiciplina);
					removerDiciplina = JOptionPane.showConfirmDialog(null, "Deseja remover outro");
					
					}
				}
			
			
			
			
			
		alunos.add(aluno);
		continuaPessoa = JOptionPane.showConfirmDialog(null, "Deseja continuar inserindo outra pessoa?");
		}
		String nomeEscolhido = JOptionPane.showInputDialog("Digite o nome que dejas buscar");
		for(Aluno aluno: alunos){
			if(aluno.getNome().equalsIgnoreCase(nomeEscolhido)) {
				System.out.println(aluno);
				System.out.println("----------------------------------------------");
				System.out.println("Dados cadastrais:");
				System.out.println("nome do aluno: " + aluno.getNome());
				System.out.println("Data da matricula: " + aluno.getDataMatricula());
				System.out.println("Data de nascimento: " + aluno.getDataNascimento());
				System.out.println("Idadde: "+aluno.getIdade());
				System.out.println("Nome da escola" + aluno.getNomeEscola());
				System.out.println("Nome da mãe:" + aluno.getNomeMae());
				System.out.println("Nome do pai" + aluno.getNomePai());
				System.out.println("Registro gearal: " + aluno.getRegistrogeral());
				System.out.println("Serie matriculado: " + aluno.getSerieMatriculado());
				System.out.println("----------------------------------------------");
				System.out.println("Resultado das notas do Aluno");
				for(int i = 0; i<aluno.getDiciplinas().size();i++){
					System.out.println("Diciplina - "+(i+1)+" :" + aluno.getDiciplinas().get(i).getDiciplina() + " nota:" + aluno.getDiciplinas().get(i).getNota());
				}
				System.out.println("media: " + aluno.getMedia());
				System.out.println(aluno.strAprovacao("O aluno foi aprovado.", "O aluno ficou de recuperação.", "O aluno foi reprovado."));
				System.out.println("----------------------------------------------");
				break;
			}
		}
		int desejaExcluir = JOptionPane.showConfirmDialog(null, "Deseja excuir algum aluno");
		if(desejaExcluir == 0) {
			String excluirAluno = JOptionPane.showInputDialog("qual aluno deseja excluir");
			for(Aluno aluno2: alunos){
				if(aluno2.getNome().equalsIgnoreCase(excluirAluno)) {
					alunos.remove(aluno2);
					break;
				}
				
			}
			
		}
		System.out.println("imprimindo lista pelo indice");
		for(int indice = 0; indice < alunos.size(); indice++) {
			Aluno aluno = alunos.get(indice);
			System.out.println((indice+1) + ") Aluno:"+ aluno.getNome());
			
		}

	}
}