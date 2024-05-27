package Exercicios.MediaAlunos;

public class Main 
{
    public static void main(String[] args) 
    {
        Aluno aluno1 = new Aluno();
        aluno1.informacoes();
        try 
        {
            aluno1.resultado();
        } 
        catch (RuntimeException e) 
        {
            System.out.println("Erro: " + e.getMessage());
        }       
    }
}
