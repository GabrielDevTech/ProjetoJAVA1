package javaProjeto.aula.variaveis;

public class Teste5While {
	public static void main(String[] args) {
		int contagem = 0;
		int contagem2 = 0;
		
		while(contagem < 10) {
			contagem++;
			System.out.println("Contagem esta em " + contagem);
		}
		
		do {
			contagem2++;
			System.out.println("Contagem esta em " + contagem2);
		}while(contagem2 < 10);
	}
}
