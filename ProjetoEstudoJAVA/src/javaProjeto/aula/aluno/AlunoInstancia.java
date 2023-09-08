package javaProjeto.aula.aluno;

import javax.swing.JOptionPane;

public class AlunoInstancia {


	public static void main(String[] args) {
		
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
		
		
		
		System.out.println(aluno);
		System.out.println("----------------------------------------------");
		System.out.println("Dados cadastrais:");
		System.out.println("Data da matricula: " + aluno.getDataMatricula());
		System.out.println("Data de nascimento: " + aluno.getDataNascimento());
		System.out.println("Idadde: "+aluno.getIdade());
		System.out.println("Nome da escola" + aluno.getNomeEscola());
		System.out.println("Nome da mãe:" + aluno.getNomeMae());
		System.out.println("Nome do pai" + aluno.getNomePai());
		System.out.println("Registro geral: " + aluno.getRegistrogeral());
		System.out.println("Serie matriculado: " + aluno.getSerieMatriculado());
		System.out.println("----------------------------------------------");
		System.out.println("Resultado das notas do Aluno");
		for(int i = 0; i<aluno.getDiciplinas().size();i++){
			System.out.println("Diciplina:" + aluno.getDiciplinas().get(i).getDiciplina() + " nota:" + aluno.getDiciplinas().get(i).getNota());
		}
		System.out.println("media: " + aluno.getMedia());
		System.out.println(aluno.strAprovacao("O aluno foi aprovado.", "O aluno ficou de recuperação.", "O aluno foi reprovado."));
		System.out.println("----------------------------------------------");
		
		Aluno aluno2 = new Aluno(nome);
		aluno2.setRegistrogeral(registroGeral);
		
		if(aluno.equals(aluno2)){
			System.out.println("E igual os alunos");
		}else {
			System.out.println("Nao e igual os alunos");
		}
		
		
	}

}
