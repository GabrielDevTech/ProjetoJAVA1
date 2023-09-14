package aula.live;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {

	private long id;
	private String descricaoCliente;
	private String nomecliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	
	List<Produto> listaProdutos = new ArrayList<Produto>();
	
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescricaoCliente() {
		return descricaoCliente;
	}
	public void setDescricaoCliente(String descricaoCliente) {
		this.descricaoCliente = descricaoCliente;
	}
	public String getNomecliente() {
		return nomecliente;
	}
	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
}
