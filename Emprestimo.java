 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimo;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class Emprestimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // variavel
        double emp,taxa,result;
        int temp;
        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("qunto quer emprestado? ");
        emp=entrada.nextDouble();
        System.out.println("em quantos meses vai pagar? ");
        temp= entrada.nextInt();
        taxa=0.02;
        //processamento
        result=emp*(Math.pow((1+taxa),temp));
        //saida
        System.out.println("ao final de "+temp+" meses,voce pagara: R$ "+result);
                
    }
    
}
