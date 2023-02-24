package Lista_002;
import java.util.Scanner;
/*
    24. Uma empresa concederá um aumento de salário aos seus funcionários, 
    variável de acordo com o cargo, conforme a tabela abaixo. 

    Faça um algoritmo que leia o salário e o cargo de um funcionário e calcule o novo salário. 
    Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de aumento. 

    Mostre o salário antigo, o novo salário e a diferença. 

    Código Cargo Percentual 101 Gerente 10% 102 Engenheiro 20% 103 Técnico 30%

 */
public class Exercicio024 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        double  salario             = 0.0;
        int     codigo              = 0;
        double  salarioNovo;
        double  diferencaSalarial   = 0.0;
        
        System.out.println("Informe o Salario do Funcionario: ");
        salario = entrada.nextDouble();
        
        System.out.println("Salario do Colaborador: " + salario);
        
        System.out.println("Codigo do Colaborador: ");
        codigo = entrada.nextInt();
        
        //Código Cargo Percentual 101 Gerente 10% 102 Engenheiro 20% 103 Técnico 30%
        if(codigo == 101)
        {
            System.out.println("Gerente");
            salarioNovo = salario + ((salario * 10) / 100);
        }
        else if(codigo == 102)
        {
            System.out.println("Engenheiro");
            salarioNovo = salario + ((salario * 20) / 100);
        }
        else if(codigo == 103)
        {
            System.out.println("Técnico");
            salarioNovo = salario + ((salario * 30) / 100);
        }
        else
        {
            //Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de aumento. 
            System.out.println("Fora da Tabela tem Maior Aumento: ");
            salarioNovo = salario + ((salario * 40) / 100);
        }
        
        //Mostre o salário antigo, o novo salário e a diferença. 
        diferencaSalarial = salarioNovo - salario;
        System.out.println("O Salario Antigo: "     + salario);
        System.out.println("O Salario Novo: "       + salarioNovo);
        System.out.println("O Salario Diferença: "  + diferencaSalarial);
    }
    
}

