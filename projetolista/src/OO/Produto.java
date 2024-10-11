package OO;

public class Produto {
	
	private Integer idProduto;
	private String nome;
	private Double preço;
	
	
	public Produto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Produto(Integer idProduto) {
		this.idProduto = idProduto;
	}


	public Produto(Integer idProduto, String nome, Double preço) {
		super();
		this.idProduto = idProduto;
		this.nome = nome;
		this.preço = preço;
	}
	
	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(Integer idProduto) {
		this.idProduto = idProduto;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreço() {
		return preço;
	}
	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	

}
