package numdigitos;

import java.util.Scanner;

public class Numdigitos {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		String numero;
	    char opcao;
		int cont = 0;
		String digito;
		
		do {
		
		System.out.print("Digite um numero");
		
		numero = entrada.next();
		
		if(numero.contains("-")) {
			
			System.out.print("Número Invalido; o numero deve ser positivo\n");
		
		}else {
			
			do {
				System.out.print("Digite um digito");
				
				digito = entrada.next();
				
				if (digito.contains("-")) {
				
				System.out.print("Digito Invalido. o digito deve ser positivo\n");
		
				}else {
					
					 for(int i = 0 ; i < numero.length(); i++) {
						 						 							
							if(numero.charAt(i) == digito.charAt(0)) {
								
							cont++;
								
						    }
					 }
					 
				System.out.print(numero+" possui "+cont+" digito(s) "+digito+"\n");
				
				cont = 0;
				
				}
				
			}while(digito.contains("-"));
			
		}
		
		
		System.out.print("Deseja repetir o programa?S ou N");
		
		opcao = entrada.next().charAt(0);
		
		}while(opcao != 'N');

	}

}
