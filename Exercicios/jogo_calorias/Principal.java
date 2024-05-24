package jogo_calorias;

public class Principal 
{
    public int calorias;
    public String nome;    
    public boolean vivo;
    public int decisao;

    public Principal(int calorias , String nome)
    {
        this.calorias = calorias;
        this.nome = nome;      
    }
    public void dormir()
    {
        calorias = calorias - 1; 
        System.out.println(calorias);      
    }
    public void correr()
    {
        calorias = calorias - 5; 
        System.out.println(calorias); 
    }
    public void comer()
    {
        calorias = calorias + 10; 
        System.out.println(calorias); 
    }
    public static void main(String[] args)
    {
        Acoes acoes = new Acoes();        
        acoes.resultado();
        System.out.println("seu animal morreu");
    }
}
