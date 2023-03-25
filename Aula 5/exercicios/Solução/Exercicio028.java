package Lista_002;
import java.util.Scanner;
/*
    28. Escreva um programa para digitar um número. 
    Se o número for par positivo, exibe três números pares consecutivos. 
    Se o número for ímpar negativo, exibe três números ímpares anteriores. 
    Caso contrário, exiba a mensagem: 'O número não é par positivo nem ímpar negativo'
    Entrada de amostra: -21
    Saída de amostra: -23, -25, -27
    Entrada de amostra: 34
    Saída de amostra: 36, 38, 40
    Exemplo de entrada: 41
    Exemplo de saída: O número não é par positivo nem ímpar negativo
 */

public class Exercicio028 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        int x;
        
        System.out.println("Entre com qualquer valor: ");
        x = entrada.nextInt();
        //verificando a probabilidade de negativos
        //System.out.println(x * 2);
        if((x < 0) && (x % 2 == -1))
        {
            System.out.println("Três números ímpares precedentes são: "
                                + (x-2) + "," + (x-4) + "," + (x-6) );
        }else if((x > 0) && (x % 2 == 0)){
            System.out.println("Três números pares sucessivos são: " 
                                + (x+2) + "," + (x+4) + "," + (x+6) );     
        }else{
            System.out.println("O número não é Par Positivo nem Ímpar Negativo.");
        }
    }
    
}
