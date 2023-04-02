package Lista_002;

/*
    31. Faça uma demonstração com todas as operações de Strings de comparação. 
                Frases
                1° "Pastos Verdes"
            	2° "Pastos Verdes II" i Maisculo
            	3° "pastos verdes"

*/

public class Exercicio031 {
    
    public static void main(String[] args)
    {
        String titulo01 = "Pastos Verdes";
        String titulo02 = "Pastos Verdes II";
        String titulo03 = "pastos verdes";
        
        //=================================================================================================================
        System.out.println("Verificando Igualdade: Operador: 'equal' ");
        if(titulo01.equals(titulo03))
            System.out.println(titulo01 + " É Igual á: " + titulo03);
        else
            System.out.println(titulo01 + " Não é Igual á: " + titulo03);
        //=================================================================================================================
        System.out.println("Ignorando 'Maiúsculas e Minúsculas' Operador: 'equalIgnoreCase' ");
        if(titulo01.equalsIgnoreCase(titulo03))
            System.out.println(titulo01 + " É Igual á: " + titulo03);
        else
            System.out.println(titulo01 + " Não é Igual á: " + titulo03);
        //=================================================================================================================
        System.out.println("Verificando 'Compara com' Operador: 'compareTo' ");
        if(titulo01.compareTo(titulo03) > 0)
            System.out.println(titulo01 + " É Maior que: " + titulo03);
        else
            System.out.println(titulo01 + " É Menor que: " + titulo03);
        //=================================================================================================================
        System.out.println("Verificando 'Compara com' Operador: 'compareTo' ");
        if(titulo01.compareTo(titulo02) > 0)
            System.out.println(titulo01 + " É Maior que: " + titulo02);
        else
            System.out.println(titulo01 + " É Menor que: " + titulo02);
        //=================================================================================================================
    }
    
}
