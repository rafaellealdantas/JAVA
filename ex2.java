import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        System.out.println("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Alimento não-perecível");
                break;
            case 2: 
                System.out.println("Alimento perecível");
                break;
            case 3: 
                System.out.println("Vestuário");
                break;
            case 4:
            System.out.println("Limpeza");
            break;

            default:
            System.out.println("Processo encerrado");
                break;
        }

    }
}

