package javaProjeto.aula.variaveis;

import java.util.Objects;

public class Diciplina {
	private String diciplina1;
	private String diciplina2;
	private String diciplina3;
	private String diciplina4;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public Diciplina(){
		
	}	
	
	public Diciplina(String diciplina1, String diciplina2, String diciplina3, String diciplina4, double nota1, double nota2, double nota3, double nota4){
		this.diciplina1 = diciplina1;
		this.diciplina2 = diciplina2;
		this.diciplina3 = diciplina3;
		this.diciplina4 = diciplina4;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}
	
	@Override
	public String toString() {
		return "Diciplina [diciplina1=" + diciplina1 + ", diciplina2=" + diciplina2 + ", diciplina3=" + diciplina3
				+ ", diciplina4=" + diciplina4 + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3
				+ ", nota4=" + nota4 + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(diciplina1, diciplina2, diciplina3, diciplina4, nota1, nota2, nota3, nota4);
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
		return Objects.equals(diciplina1, other.diciplina1) && Objects.equals(diciplina2, other.diciplina2)
				&& Objects.equals(diciplina3, other.diciplina3) && Objects.equals(diciplina4, other.diciplina4)
				&& Double.doubleToLongBits(nota1) == Double.doubleToLongBits(other.nota1)
				&& Double.doubleToLongBits(nota2) == Double.doubleToLongBits(other.nota2)
				&& Double.doubleToLongBits(nota3) == Double.doubleToLongBits(other.nota3)
				&& Double.doubleToLongBits(nota4) == Double.doubleToLongBits(other.nota4);
	}



	public String getDiciplina1() {
		return diciplina1;
	}
	public void setDiciplina1(String diciplina1) {
		this.diciplina1 = diciplina1;
	}
	public String getDiciplina2() {
		return diciplina2;
	}
	public void setDiciplina2(String diciplina2) {
		this.diciplina2 = diciplina2;
	}
	public String getDiciplina3() {
		return diciplina3;
	}
	public void setDiciplina3(String diciplina3) {
		this.diciplina3 = diciplina3;
	}
	public String getDiciplina4() {
		return diciplina4;
	}
	public void setDiciplina4(String diciplina4) {
		this.diciplina4 = diciplina4;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public double getNota4() {
		return nota4;
	}
	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
	
	
	
}
