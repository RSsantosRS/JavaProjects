package br.estacio;

import br.estacio.input.UserInput;
import br.estacio.model.Users;

//ctrl + shift + f (alinhar)
//ctrl + shift + o (importação)

public class UserApplication {

	public static void main(String[] args) {

		UserInput input = new UserInput();
		Users users = new Users();
		users.setId(new Integer(input.lerId()));
		users.setNome(input.lerNome());
		users.setEmail(input.lerEmail());

		System.out.println(users);

	}
}
