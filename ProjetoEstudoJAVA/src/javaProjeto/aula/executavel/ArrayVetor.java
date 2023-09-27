package javaProjeto.aula.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javaProjeto.aula.classeHeranca.Aluno;
import javaProjeto.aula.classeHeranca.Diciplina;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		
		
		
		
		double[] notasLogica = {6.5, 6.8, 7.8, 5.4};
		
		Aluno aluno = new Aluno();
		aluno.setNome("gabriel");
		aluno.setNomeEscola("houuracio");
		
		Diciplina diciplina = new Diciplina();
		diciplina.setDiciplina("java");
		diciplina.setNotas(notasLogica);
		
		aluno.getDiciplinas().add(diciplina);
		aluno.getDiciplinas().add(diciplina);
		
		
		Aluno[] aluno1 = new Aluno[4];
		aluno1[1] = aluno;
		aluno1[0] = aluno;
		
		for (Aluno alunoFor: aluno1) {
			if (alunoFor == null) {
				continue;
			}
			System.out.println(alunoFor.getNome());
			System.out.println(alunoFor);
				for (Diciplina diciplinaFor: alunoFor.getDiciplinas()) {
					System.out.println("O nome da diciplina é " + diciplinaFor.getDiciplina());
					
					for (double notaFor: diciplinaFor.getNotas()) {
						System.out.println("Nota: " + notaFor);
					}
					
					System.out.println("A media da diciplina é " + diciplinaFor.getMediaNotas());
				}
		}
		
		System.out.println(aluno1[1].getNome());
		System.out.println(aluno1);
		
		
		System.out.println("nome: " + aluno.getNome());
		System.out.println("nome da escola " + aluno.getNomeEscola());
		
		System.out.println("Diciplinas e notas do aluno:");
		
		System.out.println("-------------------------------------------------");
		
		for (int pos = 0; pos < aluno.getDiciplinas().size(); pos++) {
			
			
			
			String nomeDiciplina = aluno.getDiciplinas().get(pos).getDiciplina();
			double mediaDiciplina = aluno.getDiciplinas().get(pos).getMediaNotas();
			
			System.out.println("Nome da diciplina: " + nomeDiciplina);
			
			double[] arrayNotas = aluno.getDiciplinas().get(pos).getNotas();
			double maiorNota = 0.0;
			
			for (int posicaoNotas = 0; posicaoNotas < arrayNotas.length; posicaoNotas++) {
				double nota = arrayNotas[posicaoNotas];
				System.out.println((posicaoNotas + 1) + " nota: " + nota);
			
				if (nota > maiorNota) {
					maiorNota = nota ;
				}
			}
			System.out.println("A Maior nota da diciplina de "+ aluno.getDiciplinas().get(pos).getDiciplina() +": " + maiorNota);
			System.out.println("Media da diciplina: " + mediaDiciplina);
			
			System.out.println("-------------------------------------------------");
		}
		
		
		double[] notas2 =  {0.5, 22.8};
		
		String[] arrayInfo = new String[4];
		
		arrayInfo[0] = "Curso de java";
		arrayInfo[1] = "22.5";
		arrayInfo[2] = "modulo 2";
		
		
		String posicoes = JOptionPane.showInputDialog("Quantas posiçoes o Array deve ter?");
		
		
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		for(int pos = 0; pos < notas.length; pos++) {
			notas[pos] = Double.valueOf(JOptionPane.showInputDialog("Digite o valor da posição: " + (pos + 1)));
		}
		
		
		
		for(double valor: notas) {
			System.out.println(valor);
		}
		
		for(int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos+1) + ": " + notas[pos]);
		}
		
		List<Object> lista = new ArrayList<Object>();
	}
}
