/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custodefabrica;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class Custodefabrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cf,imp,distr, ppc;

    //entrada
    Scanner entrada= new Scanner (System.in);
    
    System.out.println("Qual é o custo de fábrica deste carro?");
    cf = entrada.nextDouble();
 
    //processamento
    
      imp= cf+(cf*0.45);
      distr=imp+(imp*0.28);
      ppc=distr;
    
    //saida
    
    System.out.println("O preço do carro para o consumidor será de"+ppc);
    }
    
}
