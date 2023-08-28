package javaProjeto.aula.variaveis;

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
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("nota 1:"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("nota 2:"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("nota 3:"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("nota 4:"));
		
		
		Aluno aluno = new Aluno(nome);
		aluno.setDiciplina(new Diciplina());
		
		aluno.setIdade(idade);
		aluno.setDataMatricula(dataMatricula);
		aluno.setDataNascimento(dataNascimento);
		aluno.setNomeEscola(nomeEscola);
		aluno.setNomeMae(nomeMae);
		aluno.setNomePai(nomePai);
		aluno.setRegistrogeral(registroGeral);
		aluno.setSerieMatriculado(serieMatriculado);
		
		aluno.getDiciplina().setNota1(nota1);
		aluno.getDiciplina().setNota2(nota2);
		aluno.getDiciplina().setNota3(nota3);
		aluno.getDiciplina().setNota4(nota4);
		aluno.getDiciplina().setDiciplina1("Portugues");
		aluno.getDiciplina().setDiciplina2("Biologia");
		aluno.getDiciplina().setDiciplina3("Geografia");
		aluno.getDiciplina().setDiciplina4("Matematica");;
		aluno.criaMedia();
		
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
		System.out.println("nota 1:" + aluno.getDiciplina().getNota1());
		System.out.println("nota 2:" + aluno.getDiciplina().getNota2());
		System.out.println("nota 3:" + aluno.getDiciplina().getNota3());
		System.out.println("nota 4:" + aluno.getDiciplina().getNota4());
		System.out.println("diciplina 1:" + aluno.getDiciplina().getDiciplina1());
		System.out.println("diciplina 2:" + aluno.getDiciplina().getDiciplina2());
		System.out.println("diciplina 3:" + aluno.getDiciplina().getDiciplina3());
		System.out.println("diciplina 4:" + aluno.getDiciplina().getDiciplina4());
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
