package javaProjeto.aula.variaveis;

public class Teste1 {

	public static void main(String[] args) {

		double nota1 = 40;
		double nota2 = 20;
		double nota3 = 0;
		double nota4 = 20;
		double nota5 = 100;
		double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
		String aprovacao2 =  media >=70 ? "aprovado" : media >= 40 ? "de recuperação" : "reprovado" ;
		System.out.println("Media das notas = " + media);
		
		if(media >= 70) {
			System.out.println("Aluno aprovado.");
		}else if(media >= 50) {
			System.out.println("Aluno de recuperação.");
		}else {
			System.out.println("Aluno reprovado.");
		}
		
		System.out.println("Segundo critério aluno está " + aprovacao2.toLowerCase() + ".");
	
	}
}
