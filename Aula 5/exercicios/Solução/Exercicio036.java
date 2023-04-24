package Lista_002;
import java.util.Scanner;
/*
    36. Faça um programa em Java que verifique se um número é divisível por 2 e 3, por 2 ou 3, e por 2 ou 3. 
    Obs: “Mas não Ambos”.

 */
public class Exercicio036 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        //Recebe a entrada
        System.out.println("Entre com o Inteiro: ");
        int numero = entrada.nextInt();
        
        //operador E "E" '&&'
        if(numero % 2 == 0 && numero % 3 == 0)
            System.out.println(numero + " é divisivel por 2 e 3");
        
        //Operador OR "OU" ||
        if(numero % 2 == 0 || numero % 3 == 0)
            System.out.println(numero + " é divisivel por 2 ou 3");
        
        //Operador OU Exclusivo '^' ele me garante que apenas 1 entrada seja verdadeira
        if(numero % 2 == 0 ^ numero % 3 == 0)
            System.out.println(numero + " é divisivel por 2 ou 3, mas não ambos!");
    }
    
}
