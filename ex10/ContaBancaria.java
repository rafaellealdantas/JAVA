package ex10;

public class ContaBancaria 
{
    // variáveis globais
    public String titular;
    public int saldo;
    public int resposta;
    public int numConta;
    
    public ContaBancaria(String titular , int saldo)
    {
        this.titular = titular;
        this.saldo = saldo;
    }    
    // chama o método saque que subtrai o valor do saldo e imprimi na tela
    public void saque(int valorsaque)
    {
        saldo = saldo - valorsaque;
        System.out.println("o títular: " + titular + " com o numero bancário: " + numConta + " sacou: " + valorsaque + " reais e tem de saldo: "+ saldo);
    }
    // chama o método depósito que adiciona o valor do saldo e imprimi na tela
    public void deposito(int valordepo)
    {
        saldo = saldo + valordepo;
        System.out.println(saldo);
        System.out.println("o títular: " + titular + " com o numero bancário: " + numConta + " depositou: " + valordepo + " reais e tem de saldo: "+ saldo);
    }
    // no metodo main estou chamando o saqueDeposito.pergunta(); e o saqueDeposito.resultado();  que está na classe SaqueDeposito
    public static void main(String[] args)
    {
        SaqueDeposito saqueDeposito = new SaqueDeposito();
        saqueDeposito.pergunta();
        saqueDeposito.resultado();       
    }
}
