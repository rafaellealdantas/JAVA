package MetodosClasse.Aluno;

public class Main
{
    public static void main(String[] args) 
    {
        Aluno aluno1 = new Aluno("Rafael");
        aluno1.setTelefone("984382434");
        aluno1.setMatricula("123");
        aluno1.imprimir();
        double media = aluno1.Media(10, 5);
        System.out.println(media);

        Aluno aluno2 = new Aluno("Gracieli");
        aluno2.setTelefone("997049269");
        aluno2.setMatricula("124");        
        aluno2.imprimir();
        media = aluno2.Media(10, 10);
        System.out.println(media);
    }

}
