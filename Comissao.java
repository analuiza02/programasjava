/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comissao;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class Comissao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pUnit,qtdeVend,result,comiss;

    //entrada
    Scanner entrada= new Scanner (System.in);
    
    System.out.println("Qual é o preço unitário das peças?");
    pUnit = entrada.nextDouble();
    System.out.println("Qual foi a quantidade vendida?");
    qtdeVend = entrada.nextDouble();
    
    
    //processamento
    
    result=pUnit*qtdeVend;
    comiss=result*0.05;
    
    //saida
    
    System.out.println("A comissão sobre esse produto será de:R$"+comiss);
    }
    
}
