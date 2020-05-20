/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horaextra;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class Horaextra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hora,min,salhora,tempo,result;

    //entrada
    Scanner entrada= new Scanner (System.in);
    
    System.out.println("QUANTAS HORAS VOCÊ TRABALHA POR DIA?");
    hora = entrada.nextDouble();
    System.out.println("E MINUTOS?");
    min = entrada.nextDouble();
    System.out.println("QUANTO VOCÊ GANHA POR HORA?");
    salhora = entrada.nextDouble();
 
    //processamento
    
      tempo=(min/60)+hora;
      result= salhora+(0.7*salhora)*tempo;
    //saida
    
    System.out.println("O SEU SALARIO EXTRA SERÁ DE R$"+result);
    }
    
}
