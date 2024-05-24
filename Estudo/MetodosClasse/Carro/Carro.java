package MetodosClasse.Carro;
public class Carro 
{
    String nome;
    String marca;
    int ano;
    int velocidade;        

    void acelerar(int aceleracao)
    {
        velocidade += aceleracao;
    }
    void freiar(int reduzir)
    {
        velocidade -= reduzir;
    }
    void buzinar()
    {
        System.out.println("bibi");
    }
    void mensagem()
    {
        System.out.println("O modelo do carro é: " + nome + " da marca: " + marca + " do ano: " + ano + " que está indo na velociade de: " + velocidade + "km/h." );
    }
}


