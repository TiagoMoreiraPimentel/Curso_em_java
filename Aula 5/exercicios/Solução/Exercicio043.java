package Lista_002;
import java.util.Scanner;
/*
    43. Escreva um algoritmo em Java que dada a idade de uma pessoa, 
    determine sua classificação segundo a seguinte tabela: - maior de idade; 
    - menor de idade; - pessoa idosa (idade superior ou igual a 65 anos).
 */
public class Exercicio043 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int idade;
        System.out.println("Idade: ");
        idade = entrada.nextInt();
        
        if(idade > 0 && idade <= 12)
        {
            System.out.println("Criança");
        }
        else if(idade >= 12 && idade <= 17)
        {
            System.out.println("Adolescente");
        }
        else if(idade >= 18 && idade <= 60)
        {
            System.out.println("Adulto");
        }
        else
        {
            System.out.println("Idoso");
        }
    }
    
}
