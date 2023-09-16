package javaProjeto.aula.executavel;

import javaProjeto.aula.classeHeranca.Aluno;
import javaProjeto.aula.classeHeranca.Diretor;
import javaProjeto.aula.classeHeranca.Pessoa;
import javaProjeto.aula.classeHeranca.Secretario;

public class ExecutaHeranca {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Gabriel Leandro Rosa");
		aluno.setIdade(19);
		
		Diretor diretor = new Diretor();
		diretor.setRegistrogeral("dfsfsdfsfsfsf56ssf");
		diretor.setIdade(20);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("administração");
		secretario.setNumeroCpf("456454189-55");
		secretario.setIdade(50);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		System.out.println("Salario do aluno: " + aluno.salario());
		System.out.println("Salario do diretor: " + diretor.salario());
		System.out.println("Salario do secretario: " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome()
		+ " e o salario é de " + pessoa.salario());
	}
	
}
