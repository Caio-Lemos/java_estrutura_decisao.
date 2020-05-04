
import java.util.Scanner;
 
public class resposta7 {


    public static void main(String[] args){       
        Scanner leitor = new Scanner(System.in);

       int idade1;
       int idade2;
       String nome1;
       String nome2;
           
       
       System.out.println("Escreva o nome do primeiro participante");
        nome1 = leitor.next();
       System.out.println("Escreva a idadde do primeiro participante");
         idade1= leitor.nextInt();
       System.out.println("Escreva o nome do segundo participante");
       nome2 = leitor.next();
       System.out.println("Escreva a idadde do segundo participante");
       idade2 = leitor.nextInt();
       
    		   if (idade1>idade2){
    			   System.out.println(nome1+"\n"+idade1);
        

}
    		   else { System.out.println(nome2+"\n"+idade2);
	
}
}
    
}