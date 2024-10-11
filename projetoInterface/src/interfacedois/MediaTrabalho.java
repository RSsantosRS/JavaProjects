package interfacedois;

public class MediaTrabalho implements EstrategiaMedia {

	@Override
	public double media(Double nota1, Double nota2, Double trabalho) {
		return (nota1 + nota2 + trabalho) / 3;
	}

}
