package javaProjeto.aula.variaveis;
import javax.swing.JOptionPane;
public class Teste8CarroPessoa {

	public static void main(String[] args) {
		
		System.out.println("Vamos fazer a divisão de carros por pessoa");
		
		String carro = JOptionPane.showInputDialog("Digite a quantidade de carros");
		String pessoa = JOptionPane.showInputDialog("Digite a quantidade de carros");
		
		int carroNumero = Integer.parseInt(carro);
		int pessoaNumero = Integer.parseInt(pessoa);
		
		int restoCarro = carroNumero % pessoaNumero;
		int divisaoCarro = carroNumero / pessoaNumero; 
		System.out.println("A quantidade de caro pra cada pessoa ficou de:"
		+ divisaoCarro +"\nA quantidade que sobou foi: " + restoCarro);
	}
}
