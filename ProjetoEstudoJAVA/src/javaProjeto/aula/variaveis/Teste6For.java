package javaProjeto.aula.variaveis;

public class Teste6For {
	
	public static void main(String[] args) {
		
		for(int i = 1 ; i <= 10; i++) {
			System.out.println("Contagem: " + i);
			if(i == 7) {
				break;
			}
		}
	}
}
