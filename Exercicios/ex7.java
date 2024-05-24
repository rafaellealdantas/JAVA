public class ex7
{
    public static void main(String[] args)
    {
        double resultado = soma(10 , 10.3);
        imprimir(resultado);
    }
    public static double soma (double val1, double val2)
    {
        return val1 + val2;
    }
    public static void imprimir(double i)
    {
        System.out.println("o valor da soma dos dois números é: " + i);
    }
}
