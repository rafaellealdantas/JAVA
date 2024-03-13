import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a matrícula do aluno");
        int matricula = scanner.nextInt();

        System.out.println("Informe o nome do aluno");
        String nome = scanner.next();

        System.out.println("Digite a nota 1");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite a nota 2");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;
        
        System.out.println("Matrícula:" + matricula);
        System.out.println("Nome:" + nome);
        if (media >= 6) {
            System.out.println("aprovado: sim(x) não()");
        }else{
            System.out.println("aprovado: sim() não(x)");
        }
        System.out.println("Nota:" + media);

        
    }
    
}
