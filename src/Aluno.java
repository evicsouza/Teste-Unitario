
public class Aluno {

	protected String nome;
	protected double notas[] = new double[4];


	public void avaliar(int unidade, double nota) {
		int i = unidade -1;
		notas[i] = nota;
		System.out.println("A nota da unidade "+unidade+" �: " + nota);
	}

	public void recuperar(int unidade) {
		int i = unidade -1;
		System.out.println("Unidade " + notas[i]);
	}
}

