/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotadolar;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class CotaDolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cot, valor, result;

    //entrada
    Scanner entrada= new Scanner (System.in);
    
    System.out.println("Qual é a cotação do dolar hoje?");
    cot = entrada.nextDouble();
    System.out.println("Qual é o valor em reais que você quer converter?");
    valor = entrada.nextDouble();
    
    
    //processamento
    
    result = valor/cot;
    
    //saida
    
    System.out.println("O valor em dólares é: $"+result);
    }
    
}
