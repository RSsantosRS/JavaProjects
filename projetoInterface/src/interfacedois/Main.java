package interfacedois;

import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {

		EstrategiaMedia estrategiaSimples = new MediaSimples();
		Aluno aluno = new Aluno("joão", estrategiaSimples);
		aluno.obterMedia(8., 9., null);

		EstrategiaMedia estrategiaTrabalho = new MediaTrabalho();
		Aluno aluno2 = new Aluno("miguel", estrategiaTrabalho);
		aluno2.obterMedia(8., 7., 10.);

	}
}
