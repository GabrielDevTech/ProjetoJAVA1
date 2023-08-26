package javaProjeto.aula.variaveis;


import javax.swing.JOptionPane;

public class Teste1 {
	
	public static Double recebeDouble(String str) {
		
		boolean eUmInt = false;
		String nota = "";
				
		while(!eUmInt) {
			System.out.println("Digite um inteiro.");
			nota = JOptionPane.showInputDialog(str);
			eUmInt = nota.matches("[0-9]+");
			if(!eUmInt) {
				JOptionPane.showMessageDialog(null, "A nota não é um numero.");
			}
		}
		
		return Double.valueOf(nota).doubleValue();
	}

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
		double nota1 = recebeDouble("Digite a primeira nota do aluno: ");
		double nota2 = recebeDouble("Digite a segunda nota do aluno: ");
		double nota3 = recebeDouble("Digite a terceira nota do aluno: ");
		double nota4 = recebeDouble("Digite a quarta nota do aluno: ");
		
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		String aprovacao =  media >=70 ? "aprovado" : media >= 40 ? "de recuperação" : "reprovado" ;
		
		JOptionPane.showMessageDialog(null, "O Aluno "+ nome +" ficou " + aprovacao + " com a média de " + media + ".");
		
		
	
	}
}
