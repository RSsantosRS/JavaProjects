package OO2;

public class Main {
	public static void main(String[] args) {
		Telefone telefone1 = new Telefone(1, "vivo", "21973867187");
		Telefone telefone2 = new Telefone(1, "vivo", "21973865478");
		Telefone telefone3 = new Telefone(1, "vivo", "21973865874");

		Funcionario f = new Funcionario(100, "belem", "programador senior", 100.);
		f.adicionarTelefone(telefone1);
		f.adicionarTelefone(telefone2);
		f.adicionarTelefone(telefone3);

		System.out.println(f);
	}

}
