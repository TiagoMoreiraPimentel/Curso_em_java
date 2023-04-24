package Lista_002;
import java.util.Random;
/*
    38. Faça um programa Java para verificar se o número aleatório gerado é par ou ímpar
 */
public class Exercicio038 {
    
    public static void main(String[] args)
    {
        int min = 1;
        int max = 100;
        
        //Gerando os numeros aleatorios
        Random random = new Random();
        int randomNumero = min + random.nextInt(max);
        System.out.println("O numero aleatório gerado é: " + randomNumero);
        
        //Verificando se o numero é par ou impar
        if(randomNumero % 2 == 0)
        {
            System.out.println("O Numero gerado é Par");
        }
        else
        {
            System.out.println("O Numero gerado é Impar");
        }
                
    }
    
}
