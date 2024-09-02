package br.estacio;

import br.estacio.input.AlunoInput;
import br.estacio.model.Aluno;
import br.estacio.util.AlunoUtil;

public class Main {

	public static void main(String[] args) {
		// pra rodar main(nome classe) crtl + espaço
		AlunoUtil util = new AlunoUtil();
		AlunoInput input = new AlunoInput();
		Aluno aluno = new Aluno();
		aluno.setMatricula(input.lerMatricula());
		aluno.setNome(input.lerNome());

		Integer resposta = util.writeAluno(aluno); // gravação do arquivo
		if (resposta.equals(1)) {
			System.out.println("gravação bem sucedida");
		} else {
			System.out.println("gravação não concluida");
		}

	}
}
