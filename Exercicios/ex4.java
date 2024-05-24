import java.util.Scanner;
public class ex4
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String[][] nota = new String[1][5];  
        
        // registra dados do aluno
        System.out.println("digite a matrícula do aluno: ");
        String nome = scanner.nextLine();

        System.out.println("digite a matrícula: ");
        int matricula = scanner.nextInt();

        // registra as notas em um vetor
        for (int i = 0; i < nota.length; i++)
        {
            System.out.println("digite a nota: ");
            nota[1][i] = scanner.nextLine();            
        }
        
        // exibe nome e matrícula
        System.out.println("matrícula: " + matricula);
        System.out.println("nome do aluno: " + nome);

        // exibe as 5 notas
        for (int i = 0; i < nota.length; i++)
        {
            System.out.println("a nota" + (i + 1) + "foi :" + nota[1][i]);
        }
        
    }
}
