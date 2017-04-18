import java.awt.List;

public class NotaFiscal {

	private String numNota;
    private int quantidade;
    private Double valor;
    private String descricao;
    private List produtos;
    
    public String getNumNota() {
		return numNota;
	}
	public void setNumNota(String numNota) {
		this.numNota = numNota;
	}    
    public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List getProdutos() {
		return produtos;
	}
	public void setProdutos(List produtos) {
		this.produtos = produtos;
	}

   

}
