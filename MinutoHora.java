/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minutohora;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class MinutoHora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hora,minuto,result;

    //entrada
    Scanner entrada= new Scanner (System.in);
    
    System.out.println("QUANTAS HORAS?");
    hora = entrada.nextDouble();
    System.out.println("QUANTOS MINUTOS?");
    minuto = entrada.nextDouble();
    
    
    //processamento
    
    result=(minuto/60)+hora;
    
    //saida
    
    System.out.println("A CONVERSÃO SERÁ"+result);
    }
    
}
