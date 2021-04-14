package aulaJava;

public class JavaBasico {

	public static void main(String[] args) {

		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;
		int dia = 3;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

/*-------------------------------------------------------------------------------------------------*/
		/* Condições Lógicas com IF e ELSE */

		if (media >= 70) {
			System.out.println("Aluno aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperação: " + media);
		} else {
			System.out.println("Aluno reprovado: " + media);

		}
		System.out.println("----------------------------------------------------------------");
/*------------------------------------------------------------------------------------------------*/
		/* Operadores ternários são para micro validações */

		String saidaResultado = media >= 70 ? "Aluno Aprovado"
				: (media >= 40 && media <= 69) ? "Aluno em Recuperação" : "Aluno Reprovado";
		System.out.println("A Média foi: " + media);
		System.out.println(saidaResultado);
		System.out.println("----------------------------------------------------------------");

		/*-----------------------------------------------------------------------------------------*/
		/* Operações lógicas aninhadas: São operações dentro de operações */

		if (media >= 50) {
			if (media >= 70) {
				System.out.println("Aluno está aprovado direto");
			} else {
				System.out.println("Aluno está em recuperação");
			}
		} else {
			System.out.println("Aluno reprovado direto");
		}
		System.out.println("----------------------------------------------------------------");
	

	
/*---------------------------------------------------------------------------------------------*/
	/*Swith CASE: Operações exatas*/
	
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Terça-Feira");
			break;
			
			
		default : System.out.println("Outro dia qualquer");
			break;
		}
		
		System.out.println("----------------------------------------------------------------");
/*------------------------------------------------------------------------------------------------*/
		
		
	}
}
