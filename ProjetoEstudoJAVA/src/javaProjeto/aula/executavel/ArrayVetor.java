package javaProjeto.aula.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	public static void main(String[] args) {
		
		
		
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
