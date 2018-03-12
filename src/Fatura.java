public class Fatura {

	private Integer numero;
	private String descricao;
	private Integer qtde;
	private Double preco;
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}
	
	public Integer getQtde() {
		return qtde;
	}
		
	public void  setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	
	public Double calcularTotal() {
		return preco * qtde;
	}
	
	
}
