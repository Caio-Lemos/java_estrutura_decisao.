import java.util.Scanner;
public class resposta5 {
	

	
		public static void main(String[]args) {
			Scanner leitor = new Scanner(System.in);
			
		
			int x;		 
			 
			System.out.println("Escreva um número");
			x = leitor.nextInt();
			 
			if(x % 2 == 0 ) {
				System.out.println("Este número é par");
				
			}
			else {
				System.out.println("Este número é impar");
			}
			

		}
		}