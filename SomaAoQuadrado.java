/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somaaoquadrado;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class SomaAoQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double A,B,C,D,A1,B1,C1,D1,result;

    //entrada
    Scanner entrada= new Scanner (System.in);
    
    System.out.println("Qual é o primeiro número?");
    A = entrada.nextDouble();
    System.out.println("E o segundo?:");
    B = entrada.nextDouble();
    System.out.println("E o terceiro?:");
    C = entrada.nextDouble();
    System.out.println("E o último número?");
    D = entrada.nextDouble();
    
    //processamento
    
      A1 = A*A;
      B1 = B*B;
      C1 = C*C;
      D1 = D*D;
    
      result=A1+B1+C1+D1;
    //saida
    
    System.out.println("A soma do quadrado desses números é:"+result);
    }
    
}
