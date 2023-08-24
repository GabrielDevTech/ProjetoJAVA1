package javaProjeto.aula.variaveis;

public class Teste6For {
	
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 10; i++) {
			if(i == 4) {
				System.out.println("O 4 é chato estou pulando");
				continue;
			}
			System.out.println("Contagem: " + i);
			if(i == 7) {
				System.out.println("Obá encontrei o 7\nParei de executar");
				break;
			}
			
		}
	}
}
