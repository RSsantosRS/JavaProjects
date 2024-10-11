package OO;

public class ItemProduto {
	private Integer IdItem;

	private Produto produto;
	private Integer quantidade;
	private Double Total = 0.;

	public ItemProduto(Integer idItem) {
		IdItem = idItem;
	}
	public ItemProduto() {
		// TODO Auto-generated constructor stub
	}

	public ItemProduto(Integer idItem, Produto produto, Integer quantidade, Double total) {
		super();
		IdItem = idItem;
		this.produto = produto;
		this.quantidade = quantidade;
		Total = total;
	}

	public Integer getIdItem() {
		return IdItem;
	}

	public void setIdItem(Integer idItem) {
		IdItem = idItem;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getTotal() {
		this.Total = produto.getPreço() * this.quantidade;
		return Total;
	}

}
