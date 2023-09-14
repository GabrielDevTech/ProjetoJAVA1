package principio.responsabilidade;

public class ContaBancaria {

	private String descricao;
	
	double saldo;
	
	public void soma100Reais() {
		saldo += 100;
	}
	
	public void diminui100Reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
	
	public void depositarDinheiro(double deposito) {
		saldo += deposito;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
