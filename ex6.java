import java.util.Scanner;
public class ex6 
{
    public static void main(String[] args) 
    {        
        int resultado = lernumero();
        imprimir(resultado);
    }
    public static int lernumero() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número: ");
        int numero = scanner.nextInt();
        return mult10(numero);
        
    }
    public static int mult10(int num) 
    {
        return num * 10;       
    }
    public static void imprimir(int i)
    {
        System.out.println("valor retornado: " + i);
        
    }
}
