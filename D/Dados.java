package D;

import java.util.Scanner;

public class Dados 
{
    Aluno aluno = new Aluno();
    Scanner scanner = new Scanner(System.in);   
    public void escolha()
    {

        // laço de repetição que cadastra o aluno ou infoma alunos ja cadastrados 
        do
        {
            System.out.println("#######################################################");
            System.out.println("qual operação você deseja realizar");
            System.out.println("#######################################################");
            System.out.println("1- cadastrar aluno novo // 2 - verificar informações de alunos já cadastrados // 3 - sair");
            aluno.opDesejada = scanner.nextInt();
            switch (aluno.opDesejada) 
            {
                case 1:
                    System.out.println("opção 1: cadastrar novo aluno selecionada");
                    System.out.println("################################################");
                    System.out.println("digite o nome do aluno");
                    aluno.nome = scanner.next();
                    System.out.println("################################################");
                    System.out.println("digite a matrícula do aluno");
                    aluno.matricula = scanner.nextInt();
                    System.out.println("################################################");
                    System.out.println("digite a idade do aluno");
                    aluno.idade = scanner.nextInt();
                    System.out.println("################################################");
                    System.out.println("digite a nota do aluno");
                    aluno.nota = scanner.nextInt();
                break;                
                case 2:
                    System.out.println("nome do aluno: "+ aluno.nome + " matrícula: "+ aluno.matricula + " idade: " + aluno.idade + " nota: " +aluno.nota);
                break; 
                case 3:
                    System.out.println("saindo");              
                default:
                    System.out.println("opção invalida");
                break;
            }
        }while(aluno.opDesejada != 3);
    }
}

