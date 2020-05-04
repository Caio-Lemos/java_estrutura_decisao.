import java.util.Scanner;
 
public class resposta9 {


    public static void main(String[] args){       
        Scanner leitor = new Scanner(System.in);

        float n1 ;
    
       
        System.out.println("Digite um número");
        n1 = leitor.nextInt();
       
        float a = (n1*45)/100;
        float b = (n1*30)/100;
    	
        if(n1<20) {
    		 System.out.println(n1+a );   		    		
    	 }
        else {
        	 System.out.println(n1+b );   	
        }

    
        
     

    

}
}