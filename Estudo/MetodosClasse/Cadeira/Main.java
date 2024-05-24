package MetodosClasse.Cadeira;

public class Main 
{
    public static void main(String[] args) 
    {
        Cadeira cadeira = new Cadeira();
        cadeira.serrar();
        cadeira.lixar();
        cadeira.setCor("verde");
        cadeira.pintar();
        System.out.println("Cor Atual " + cadeira.getCor());
    }
}
