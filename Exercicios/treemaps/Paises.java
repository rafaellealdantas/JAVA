// crie um programa que armazene o nome de alguns países e suas capitais, e depois exiba-os em ordem alfabética pela capital

import java.util.TreeMap;

public class Paises 
{
    public static void main(String[] args) 
    {
        // cria o treemap
        TreeMap <String , String> paiscapital = new TreeMap<>();

        // adiciona paises e capitais
        paiscapital.put ("Brasil" , "Brasília");
        paiscapital.put("Russia" , "Moscow");
        paiscapital.put("Alemanha" , "Berlin");
        paiscapital.put("China" , "Pequim");
        paiscapital.put("Canada", "ottawa");

        System.out.println("capitais em ordem alfabética: ");
        for(String capital : paiscapital.values())
        {
            System.out.println(capital);
        }
    }
}
