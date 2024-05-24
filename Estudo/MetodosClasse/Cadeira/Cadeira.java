package MetodosClasse.Cadeira;

public class Cadeira 
{
    private double altura_assento;
    private double altura;
    private String cor;

    public Cadeira()
    {
        cor = "marrom";
        altura = 0.5;
        altura_assento = 1.20;
    }

    public void serrar()
    {
        System.out.println("serrando a madeira");
    }
    public void lixar()
    {
        System.out.println("lixando a madeira");
    }
    public void pintar()
    {
        System.out.println("pintando a madeira");
    }
    public String getCor()
    {
        return cor;
    }
    public void setCor(String c)
    {
        if(c.equals("verde") || c.equals("vermelho"))        
            cor = c;
            else
            System.out.println("não há tinta na cor desejada");
        
        
    }
}
