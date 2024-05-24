package MetodosClasse.Aluno;

public class Aluno 
{
    private String nome;
    private String telefone;
    private String matricula;
   

    public Aluno(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void imprimir()
    {
        System.out.println("Aluno : " + this.getNome() + " Telefone: " + this.getTelefone() + " Matrícula: " + this.getMatricula());
    }
    public static double Media(double nota1, double nota2)
    {
        return (nota1 + nota2) / 2;
    }
    
}
