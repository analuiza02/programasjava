/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gasolina;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class Gasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double km, consg, gasprec, result;

    //entrada
    Scanner entrada= new Scanner (System.in);
    
    System.out.println("QUANTOS QUILOMETROS VOCE VAI PERCORRER?");
    km = entrada.nextDouble();
    System.out.println("QUANTO SEU CARRO CONSOME DE GASOLINA?");
    consg = entrada.nextDouble();
    System.out.println("QUAL É O PREÇO MÉDIO DA GASOLINA?");
    gasprec = entrada.nextDouble();
 
    //processamento
    
      result=(km/consg)*gasprec;
    
    //saida
    
    System.out.println("VOCÊ GASTARÁ R$:"+result);
    }
    
}
