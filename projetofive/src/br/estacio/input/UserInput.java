package br.estacio.input;

import java.util.Scanner;

public class UserInput {
	Scanner in;

	public String lerId() {
		System.out.println("Entre com a Idade: ");
		in = new Scanner(System.in);
		return in.nextLine();
	}

	public String lerNome() {
		System.out.println("Entre com o nome: ");
		in = new Scanner(System.in);
		return in.nextLine();
	}

	public String lerEmail() {
		System.out.println("Entre com o Email: ");
		in = new Scanner(System.in);
		return in.nextLine();
	}

}
