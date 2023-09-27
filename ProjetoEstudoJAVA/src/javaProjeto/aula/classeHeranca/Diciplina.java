package javaProjeto.aula.classeHeranca;

import java.util.Arrays;
import java.util.Objects;

public class Diciplina {
	
	private int indiceTotalNotas;
	private String diciplina;
	private double[] notas = new double[indiceTotalNotas];
	
	public Diciplina(){
		
		
	}
	
	
	
	public double getMediaNotas() {
		double somaNotas = 0;
		for (int pos = 0; pos < notas.length; pos++) {
			somaNotas += notas[pos];
		}
		double media = somaNotas / notas.length;
		return media;
	}
	
	public Diciplina(String diciplina, double[] nota){
		this.diciplina = diciplina;
		this.notas = nota;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(diciplina);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diciplina other = (Diciplina) obj;
		return Objects.equals(diciplina, other.diciplina) && Arrays.equals(notas, other.notas);
	}

	public String getDiciplina() {
		return diciplina;
	}
	
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] nota) {
		this.notas = nota;
	}

	
	
	
}
