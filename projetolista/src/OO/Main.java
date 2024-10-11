package OO;

public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto(100, "xanxung", 200.);
		Produto p2 = new Produto(200, "playStation", 100.);
		ItemProduto item = new ItemProduto();
		item.setProduto(p2);
		item.setIdItem(200);
		item.setQuantidade(5);

		System.out.println("nome: " + item.getProduto().getNome());
		System.out.println("preço: " + item.getProduto().getPreço());
		System.out.println("quantidade: " + item.getQuantidade());
		System.out.println("total: " + item.getTotal());

	}

}
