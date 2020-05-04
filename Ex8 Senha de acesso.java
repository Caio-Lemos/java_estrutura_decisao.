import java.util.Scanner;
 
public class resposta8 {


    public static void main(String[] args){   
    	
        Scanner leitor = new Scanner(System.in);
        
        String tentativa;
        String senha = "AEDB";
        
        
        
        System.out.println("Escreva a senha");
        tentativa= leitor.next();
        
        
        if(tentativa.equalsIgnoreCase(senha))
        {
        	 System.out.println("Acesso permitido!");
}
        else {
System.out.println("você nao tem acesso!");
        }
}
}
