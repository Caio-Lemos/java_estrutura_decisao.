import java.util.Scanner;
 
public class resposta4 {


    public static void main(String[] args){       
        Scanner leitor = new Scanner(System.in);
        
        int num;
        
        System.out.println("escreva um número e verifique se é positivo ou negativo");
        num = leitor.nextInt();
        
        if(num>0) {
        	System.out.println("Este nuúmero é positivo");
        }
        else {
        	System.out.println("Este número é negativo");
        }
        
     }
}