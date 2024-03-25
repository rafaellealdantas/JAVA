public class Carro 
{
    public String modelo;
    public String cor;
    public int ano;
    public static void main(String[] args) 
    {
        mostrar_informações();
    }  
    public Carro(String modelo, String cor, int ano)
    {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano; 
    }  
    public static void mostrar_informações()
    {
        Carro carro = new Carro("fusca" , "azul", 2022);
        System.out.println("modelo: " + carro.modelo + " cor: " + carro.cor + " ano:" + carro.ano);   
    }

}