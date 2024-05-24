import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) 
    {
        lernome();
    }
    public static void lernome() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = scanner.nextLine(); 
        imprimirnome(nome);       
    }
    public static void imprimirnome( String nome)
    {
      
       System.out.println("olá " + nome);
    }
    
}
