package ex10;

import java.util.Scanner;

public class SaqueDeposito 
{   
    ContaBancaria contaBancaria = new ContaBancaria("marcos" , 1000);    
    Scanner scanner = new Scanner(System.in);
    // pede os dados do usuário
    public void pergunta()
    
    {
        System.out.println("digite o número da conta:");
        contaBancaria.numConta = scanner.nextInt();
        System.out.println("digite o nome do titular:");   
        contaBancaria.titular = scanner.next();
        System.out.println("digite 1 para sacar ou 2 para depositar");
        contaBancaria.resposta = scanner.nextInt();
    }
    // faz os calculos de saque e despósito chamando os métodos "saque" e "deposito" que estão na classe ContaBancaria
    public void resultado()
    {
        switch (contaBancaria.resposta) {
            case 1:
                System.out.println("qual o valor a ser sacado: ");
                int valorsaque = scanner.nextInt();
                contaBancaria.saque(valorsaque);              
                break;
            case 2:
            System.out.println("qual o valor a ser depositado: ");
            int valordepo = scanner.nextInt();
            contaBancaria.deposito(valordepo);           
            break;
        
            default:
                break;
        }
    }
}
