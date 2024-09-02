package br.estacio.input;

import java.util.Scanner;

public class AlunoInput {

	public String lerNome() {
		System.out.println("Digite o nome: ");
		Scanner leitura = new Scanner(System.in);
		return leitura.nextLine();
	}

	public String lerMatricula() {
		System.out.println("Digite a matrícula: ");
		Scanner leitura = new Scanner(System.in);
		return leitura.nextLine();
	}
}
