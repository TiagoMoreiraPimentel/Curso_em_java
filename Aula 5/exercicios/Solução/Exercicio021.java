package Lista_002;

import java.util.Scanner;
/*
    21. - Construa um algoritmo que calcule o peso ideal de uma pessoa. Dados de entrada: altura e sexo. 
    Fórmulas para cálculo do peso: 

    peso ideal de homem = (72,7 x altura) - 58 peso ideal da mulher = (62,1 x altura) - 44,7

 */
public class Exercicio021 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Altura: ");
        float altura = entrada.nextFloat();
        System.out.println("Sexo: ");
        String sexo = entrada.next();
        
        double pesoIdealHomem = 0.0, pesoIdealMulher = 0.0;
        
        if(sexo.contains("f") || sexo.contains("F") || sexo.contains("Feminino") || sexo.contains("feminino"))
        {
            //mulher = (62,1 x altura) - 44,7
            pesoIdealMulher = ((62.1 * altura) - 44.7);
            
            System.out.println("Peso Ideal Feminino: " + pesoIdealMulher);
        }
        else
        {
            //homem = (72,7 x altura) - 58
            pesoIdealHomem = ((72.7 * altura) - 58);
            
            System.out.println("Peso Ideal Masculino: " + pesoIdealHomem);
        }
    }
    
}
