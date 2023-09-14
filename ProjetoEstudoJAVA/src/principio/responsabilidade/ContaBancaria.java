package principio.responsabilidade;

public class ContaBancaria {

	private String descricao;
	
	double saldo = 8000;
	
	public void soma100Reais() {
		saldo += 100;
	}
	
	public void diminui100Reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
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
