package aulaJava;

public class JavaBasico {
	
	public static void main(String[] args) {
		
		int nota1 = 70;
		int nota2 = 70;
		int nota3 = 70;
		int nota4 = 70;
		int media = 0;
		
		media = (nota1+nota2+nota3+nota4)/4;
		
/*----------------------------------------------------------------------------------------*/		
		/*Condi��es L�gicas com IF e ELSE*/
		
		/*if (media >= 70) { 
			System.out.println("Aluno aprovado: " + media);
		}else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recupera��o: " + media);
		}else {
			System.out.println("Aluno reprovado: " + media);
		}*/
		
/*-----------------------------------------------------------------------------------------*/		
		/*Operadores tern�rios s�o para micro valida��es*/
		
			
			String saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em Recupera��o" : "Aluno Reprovado";
				System.out.println("A M�dia foi: " + media);
				System.out.println(saidaResultado) ;
	}

}


