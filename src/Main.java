
public class Main {

	public static void main(String[] args) {

		//cenario
		Aluno aluno = new Aluno();
		Secretaria secretaria = new Secretaria();

		//a��o
		aluno.nome = "Emelena";		
		aluno.notas[0] = 9.0;
		aluno.notas[1] = 9.0;
		aluno.notas[2] = 9.0;
		aluno.notas[3] = 9.0;

		double media = secretaria.media(aluno);

		//verifica��o
		System.out.println("A m�dia de "+aluno.nome+" �: " +media);


		aluno.avaliar(2, 10);
		aluno.recuperar(2);



	}

}
