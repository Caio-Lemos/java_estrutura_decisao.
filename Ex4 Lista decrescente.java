import java.util.Scanner;
 
public class resposta4 {


    public static void main(String[] args){       
        Scanner leitor = new Scanner(System.in);

        int n1, n2 ;
       

        System.out.println("Digite um número");
        n1 = leitor.nextInt();
        System.out.println("Digite outro número");
        n2 = leitor.nextInt();
        
      if(n1>n2) {
    	  
    		  System.out.println(n1+"\n"+n2);
      }
    	  else {
    		  System.out.println(n2+"\n"+n1);
    	  }

    		  
   
    	 
   
    
        
     

    

}
}