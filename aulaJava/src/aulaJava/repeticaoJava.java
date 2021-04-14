package aulaJava;

public class repeticaoJava {

	/* Main é um método auto executavel em Java */
	public static void main(String[] args) {

		/* Estrutura de repetiçao while */
		/* Verifica e executa */

		int numero = 0;

		while (numero <= 7) {

			System.out.println("O numero atual é: " + numero);
			numero++;
		}
		System.out.println("----------------------------------------------------");
		/*----------------------------------------------------------------------------------------------*/
		/* estrutura de repetição DO */

		int numero2 = 0;
		do { /* primeiro executa e depois verifica */

			System.out.println("O numero atual é: " + numero2);
			numero2++;
		} while (numero2 <= 7);
		System.out.println("----------------------------------------------------");

		/*----------------------------------------------------------------------------------------------*/
		/* estrutura de repetição FOR */

		for (int numero3 = 0; numero3 <= 7; numero3++) {
			System.out.println("Numero atual é: " + numero3);
		}
		System.out.println("-----------------------------------------------------");

		/*----------------------------------------------------------------------------------------------*/
		/* repetição FOR com BREAK (parada) */

		for (int numero4 = 0; numero4 <= 10; numero4++) {
			if (numero4 == 7) {
				System.out.println("Obaaaa, encontrei o numero 7");
				System.out.println("estou parando de executar...");
				break;
			}
			
		}
				System.out.println("----------------------------------------------------");
		/*---------------------------------------------------------------------------------------------*/
		/* reptição com FOR e Continue */

		for (int numero5 = 0; numero5 <= 10; numero5++) {
			if (numero5 == 3 || numero5 ==7 || numero5 ==9) {
				System.out.println("Obaaaa, encontrei o numero " + numero5);
				continue;
			}
			
		}
		System.out.println("----------------------------------------------------");
		/*---------------------------------------------------------------------------------------------*/
		
	}

}
