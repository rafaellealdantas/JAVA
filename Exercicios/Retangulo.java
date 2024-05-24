public class Retangulo 
{
    public int largura;
    public int altura;  

    public static void main(String[] args)
    {
        Retangulo retangulo = new Retangulo(20, 30);
        retangulo.calc();
    }    
    public Retangulo(int largura, int altura)
    {
        this.largura = largura;
        this.altura = altura;
    }
    public void calc()
    {        
       int area = largura * altura;
       int per = (largura + altura) * 2;
       System.out.println(area+ " " + per);
       
    }
    
}
