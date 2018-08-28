
public class Main {

	public static void main(String[] args) {

		//cenario
		Aluno aluno = new Aluno();
		Secretaria secretaria = new Secretaria();

		//ação
		aluno.nome = "Emelena";		
		aluno.notas[0] = 9.0;
		aluno.notas[1] = 9.0;
		aluno.notas[2] = 9.0;
		aluno.notas[3] = 9.0;

		double media = secretaria.media(aluno);

		//verificação
		System.out.println("A média de "+aluno.nome+" é: " +media);


		aluno.avaliar(2, 10);
		aluno.recuperar(2);



	}

}
