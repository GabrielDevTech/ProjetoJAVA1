package javaProjeto.aula.variaveis;

public class AlunoInstancia {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno("Gabriel", 24);
		Aluno aluno5 = new Aluno("João");
		
		System.out.println(aluno5.getNome());		
	}
	
}
