package interfacedois;

public class MediaSimples implements EstrategiaMedia {

	@Override
	public double media(Double nota1, Double nota2, Double trabalho) {
		return (nota1 + nota2)/2;
	}

}