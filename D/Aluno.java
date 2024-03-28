package D;
public class Aluno 
{
    public String nome;
    public int matricula;
    public int idade;
    public int nota;
    public int opDesejada;

// chama o metodo escolha contido na classe Dados
    public static void main(String[] args) 
    {
        Dados dados = new Dados();        
        dados.escolha();
    }
}

