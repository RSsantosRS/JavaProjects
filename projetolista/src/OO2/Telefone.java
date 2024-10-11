package OO2;

public class Telefone {

	private Integer id;
	private String operadora;
	private String numero;

	public Telefone() {
		// TODO Auto-generated constructor stub
	}

	public Telefone(Integer id, String operadora, String numero) {
		super();
		this.id = id;
		this.operadora = operadora;
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", operadora=" + operadora + ", numero=" + numero + "]";
	}

}
