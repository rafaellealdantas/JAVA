import java.util.Scanner;

public class ex3 
{

    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);

        String[][] alunos= new String[5][4];
        
        // armazena dados do aluno
        for(int i = 0; i < alunos.length; i++)
        {
            System.out.println("digite a matrícula do aluno: ");
            alunos[i][0] = scanner.nextLine();

            System.out.println("digite o nome do aluno: ");
            alunos[i][1]= scanner.nextLine();

            System.out.println("digite a nota 1:");
            alunos[i][2] = scanner.nextLine();
        
            System.out.println("digite a nota 2:");
            alunos[i][3] = scanner.nextLine();   
        }


        for(int i = 0; i < alunos.length; i++)
        {
            // calculo da média
            Double media = (Double.parseDouble(alunos[i][2]) + Double.parseDouble(alunos[i][3])) / 2;
            // status do aluno
            String status = media < 6 ?
            "aprovado ()sim (x)não"
            :
            "aprovado (x)sim ()não";
            // apresenta em console
            System.out.println("matrícula do aluno: " + alunos[i][0]);
            System.out.println("nome do aluno: " + alunos[i][1]);
            System.out.println(status);
            System.out.println("nota final: " + media);
        }



    }
    
}
