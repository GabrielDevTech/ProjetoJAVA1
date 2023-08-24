package javaProjeto.aula.variaveis;

public class Teste1 {

	public static void main(String[] args) {

		double nota1 = 62;
		double nota2 = 85;
		double nota3 = 24;
		double nota4 = 100;
		double nota5 = 100;
		double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
		String media2 =  media >=70 ? "Aprovado" : "Reprovado";
		System.out.println("Media das notas = " + media);
		
		if(media >= 70) {
			System.out.println("Aluno aprovado.");
		}else if(media >= 50) {
			System.out.println("Aluno de recuperação.");
		}else {
			System.out.println("Aluno reprovado.");
		}
		
		System.out.println("Segundo critério aluno " + media2.toLowerCase() + ".");
	
	}
}
