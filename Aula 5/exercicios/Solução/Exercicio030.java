package Lista_002;
import java.util.Scanner;

/*
    30. A placa de eletricidade calcula a conta de energia elétrica para seus consumidores de acordo 
    com as unidades consumidas (por mês) conforme tarifa abaixo.

    Unidades consumidas                                 Cobranças

    Até 100 unidades                                    INR 2.5/unidade
    mais de 100 unidades e até 200 unidades		INR 3.5/unidade		
    mais de 200 unidades e até 300 unidades		INR 4.5/unidade
    mais de 300 unidades e até 400 unidades		INR 5.5/unidade

    Escreva um programa para inserir o nome do consumidor, número do consumidor, 
    mês e unidades consumidas. Calcule e exiba a conta de luz com todos os detalhes

 */

public class Exercicio030 {
    
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String  nome, mes;
        int     numeroConta, unidade;
        double  preco = 0.0;
        
        //Captura as informacoes do cliente
        System.out.println("Nome do Cliente: ");
        nome = entrada.nextLine();
        System.out.println("N° Consumidor: ");
        numeroConta = entrada.nextInt();
        System.out.println("Mês de Fatura: ");
        mes = entrada.next();
        System.out.println("Unidade Consumida: ");
        unidade = entrada.nextInt();
        
        //Regra de négocio do projetinho 
        //Até 100 unidades - INR 2.5/unidade
        if(unidade <= 100){
            
            preco = unidade * 2.5;
        
        //mais de 100 unidades e até 200 unidades - INR 3.5/unidade	
        }else if(unidade > 100 && unidade <= 200)
        {
           preco = unidade * 3.5;
        
        //mais de 200 unidades e até 300 unidades - INR 4.5/unidade
        }else if(unidade > 200 && unidade <= 300)
        {
            
            preco = unidade * 4.5;
            
        //mais de 300 unidades e até 400 unidades - INR 5.5/unidade    
        }else if(unidade > 300 && unidade <= 400)
        {
            preco = unidade * 5.5;
        }
        
        //Criando a saida dos dados
        System.out.println("-----------------Resumo da Tarifa----------------");
        System.out.println("Nome do Cliente             : " + nome);
        System.out.println("N° do Consumidor            : " + numeroConta);
        System.out.println("Mês de Consumo              : " + mes);
        System.out.println("Unidade de Consumo          : " + unidade);
        System.out.println("Valor á Pagar               : " + preco);
        System.out.println("--------------------------------------------------");
    }
    
}
