package javaProjeto.aula.variaveis;

import javax.swing.JOptionPane;

public class Teste7Modulo {
	
	public static void main(String[] args) {
		/*Resto da divisão*/
		int numero = Integer.parseInt(JOptionPane.showInputDialog(""));
		
		if(numero % 2 == 0 ) {
			System.out.println("O "+ numero +" é par.");
		}else {
			System.out.println("O "+ numero +" é impar.");
		}
		
	}
 
}
