package Lista_002;
import java.util.Scanner;
/*
    26. Escreva o programa para inserir dois números desiguais. 
        Se o primeiro número for maior exiba o quadrado do número 
        menor e o cubo do número maior. Caso contrário, vice-versa. 
        Se os números forem iguais exibir a mensagem 
        “Ambos os números são iguais”.
 */
public class Exercicio026 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int numero01 = 0, numero02 = 0;
        System.out.println("Entre com o 1° Num: "); 
        numero01 = entrada.nextInt();
        System.out.println("Entre com o 1° Num: ");        
        numero02 = entrada.nextInt();
        
        if(numero01 ==  numero02)
        {
            System.out.println("Ambos são iguais!");
        }else{
            if(numero01 > numero02)
            {
                System.out.println("Quadrado do menor: " + Math.pow(numero02, 2));
                System.out.println("Cubo do maior " + Math.pow(numero01, 3));
            }else{
                System.out.println("Quadrado do menor: " + Math.pow(numero01, 2));
                System.out.println("Cubo do maior: " + Math.pow(numero02, 3));
            }
        }
    }
    
}
