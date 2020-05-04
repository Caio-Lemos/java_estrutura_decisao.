import java.util.Scanner;
 
public class resposta6 {


    public static void main(String[] args){       
        Scanner leitor = new Scanner(System.in);

       float a, b, c;
     
       

        System.out.println("Digitea primeira nota");
        a = leitor.nextFloat();
        System.out.println("Digite a segunda nota");
        b = leitor.nextFloat();
        System.out.println("Digite a terceira nota");
        c = leitor.nextFloat();
        
   System.out.println("A nota da prova 1 foi ="+a*20/100+"!");
   System.out.println("A nota da prova 1 foi ="+b*30/100+"!");  
   System.out.println("A nota da prova 1 foi ="+c*50/100+"!");
    
   float média= (a*20)/100+(b*30)/100+(c*50)/100;
   if(média >=7.0) {
	   System.out.println("Parabens!você foi aprovado");
	   System.out.printf("sua média foi ="+média);
}else {
	  System.out.println("Você foi reprovado !");
	  System.out.println("sua média foi ="+média);
	 
}
}
}