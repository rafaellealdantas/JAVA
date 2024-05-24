package ex10;

public class ContaBancaria 
{
    public String titular;
    public int saldo;
    public int resposta;

    public ContaBancaria(String titular , int saldo)
    {
        this.titular = titular;
        this.saldo = saldo;
    }    
    public void saque(int valorsaque)
    {
        saldo = saldo - valorsaque;
        System.out.println(saldo);
    }
    public void deposito(int valordepo)
    {
        saldo = saldo + valordepo;
        System.out.println(saldo);
    }
    public static void main(String[] args)
    {
        SaqueDeposito saqueDeposito = new SaqueDeposito();
        saqueDeposito.pergunta();
        saqueDeposito.resultado();       
    }
}
