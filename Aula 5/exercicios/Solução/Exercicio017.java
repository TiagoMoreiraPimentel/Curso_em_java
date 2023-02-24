package Lista_002;
import java.util.Scanner;
/*
    17. A escola “APRENDER” faz o pagamento de seus professores por hora/aula. 
    Faça um algoritmo que calcule e exiba o salário de um professor. Sabe-se que 
    o valor da hora/aula segue a tabela abaixo: Professor Nível 1 R$12,00 por hora/aula 
    Professor Nível 2 R$17,00 por hora/aula Professor Nível 3 R$25,00 por hora/aula
 */
public class Exercicio017 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        int nivel;
        double horas;
        
        System.out.println("Informe o Nivel do Professor (1, 2 e 3)");
        nivel = entrada.nextInt();
        
        System.out.println("Informe Horas Trabalhadas: ");
        horas  = entrada.nextDouble();
        
        if(nivel == 1)
        {
            System.out.println("Salario a ser pago!" + horas * 12);
        }
        else if(nivel == 2)
        {
            System.out.println("Salario a ser pago!" + horas * 17);
        }
        else 
        {
            System.out.println("Salario a ser pago!" + horas * 25);
        }
    }
    
}
