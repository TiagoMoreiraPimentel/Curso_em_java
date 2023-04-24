package Lista_002;

import java.math.BigDecimal;

/*
    39. Programa Java para Calcular Impostos usando os tipos Double, implemente o seguinte: 
    Suponha que um produto custe R$: 9,99 líquidos, calcule seu valor bruto (assumimos IVA de 23%). 
    Em seguida, multiplique por 10.000 (ou seja, vendemos 10.000 unidades deste produto) 
    e calcule esse valor sem IVA.

    Obs: Implemente as ações acima usando a classe Big Decimal. 
    Imprima no console todos os valores calculados e compare seus valores.

 */

public class Exercicio039 {
    
    public static void main(String[] args)
    {
        double valor_liquido = 9.99;
        double IVA = 23.0;
        
        //calculando valor bruto
        double valor_bruto = valor_liquido + (IVA * valor_liquido / 100);
        System.out.println("O valor bruto é: " + valor_bruto);
        
        //multiplicando o valor por 10.000
        double valor_bruto10000 = valor_bruto * 10000;
        System.out.println("O valor bruto para 10.000 unidades é: " + valor_bruto10000);
        
        //calculo do preco sem o IVA 23%
        double ExcluidoIVA = valor_bruto10000 - (IVA * valor_bruto10000 / 100);
        System.out.println("O valor para 10.000 unidades sem o IVA é: " + ExcluidoIVA);
        
        //fazendo as mesmas operações  usando o BigDecimal
        System.out.println("\n----- Usando o BigDecimal em vez do Double -----\n");
        
        //Criando as variaveis BigDecimal
        BigDecimal valor_liquido_big = new BigDecimal("9.99");
        BigDecimal IVA_big = new BigDecimal("23.0");
        BigDecimal CENTENAS_big = new BigDecimal("100");
        BigDecimal DEZMIL_big = new BigDecimal("10000");
        
        //Calculando o valor por 10.000
        BigDecimal valor_bruto10000_big = valor_liquido_big.add(IVA_big.multiply(valor_liquido_big.divide(CENTENAS_big)));
        System.out.println("O valor Bruto para 10.000 unidades é: " + valor_bruto10000_big);
        
        //calculo do preco sem IVA 23%
        BigDecimal excluidoIVA_big = valor_bruto10000_big.subtract(IVA_big.multiply(valor_bruto10000_big.divide(CENTENAS_big)));
        System.out.println("O valor para 10.000 unidades sem IVA é: " + excluidoIVA_big);
        
        System.out.println("\nA precisão é maior quando usamos o BigDecimal em vez de Double");
    }
    
}
