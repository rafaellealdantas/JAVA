package jogo_calorias;

import java.util.Scanner;

public class Acoes
{
    Principal principal = new Principal(10, "coelho");
    Scanner scanner = new Scanner(System.in);
    public void resultado()   
    {      
        principal.vivo = true;  
        do
        {    
            if (principal.calorias <= 0) 
            {
                principal.vivo = false; 
            }else if(principal.calorias > 0) 
            {         
                principal.vivo = true;      
                System.out.println("#################################################################################################");
                System.out.println("O que quer que seu animal faça");
                System.out.println("#################################################################################################");
                System.out.println("1: comer // 2:correr // 3:dormir");
                principal.decisao = scanner.nextInt();
                switch (principal.decisao) 
                {
                    case 1:
                        principal.comer();                
                        break;
                    case 2:
                        principal.correr();
                        break;
                    case 3:
                        principal.dormir();
                        break;
                    default:
                        System.out.println("opção inválida");
                        break;
                }
            }
        }while(principal.vivo = true);
        
    }
}
