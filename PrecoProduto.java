/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package precoproduto;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class PrecoProduto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variaveis
        double preco, result;
        String nome;
        
        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do produto");
        nome = entrada.next();
        
        System.out.println("Digite o preco do produto");
        preco = entrada.nextDouble();
        
        //processamento
        result= (preco*1.65);
        
        //saida
        System.out.println("Voce vai vender o produto "+nome+" por R$ "+result);
    }
    
}
