package br.estacio.model;

public class Aluno {
// contrutores (inicializadores)
//construtor vazio e cheio

	private String matricula;
	private String nome;

	// contrutor cheio
	public Aluno(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Aluno() {
		// ctrl +espaço - contrutor vazio
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
	}

}
