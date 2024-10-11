package interfaceum;

public class Main {
	public static void main(String[] args) {

		EstrategiaApresentação apresentacao = new Professor();
		System.out.println(apresentacao.estrategia());
		EstrategiaApresentação apresentacao2 = new Aluno();
		System.out.println(apresentacao2.estrategia());
	}

}
