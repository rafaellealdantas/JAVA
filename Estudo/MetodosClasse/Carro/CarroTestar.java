package MetodosClasse.Carro;
public class CarroTestar 
{
    public static void main(String[] args) 
    {
        Carro carro = new Carro();
        carro.ano = 2023;
        carro.marca = "volkswagem";
        carro.nome = "Virtus";
        carro.velocidade = 60;

        carro.acelerar(10);
        carro.mensagem();
        carro.freiar(20);
        carro.mensagem();
    }
}