/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class Retangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaração de variáveis
        double base, altura, area, perimetro;
        
        //classe Scanner responsável pela entrada de dados
        Scanner leitura = new Scanner(System.in);
        
        //entrada
        System.out.println("Digite a base do retângulo: ");
        base = leitura.nextDouble();
        System.out.println("Digite a altura do retângulo: ");
        altura = leitura.nextDouble();
        //procesamento
        area = base*altura;
        perimetro = (base*2)+(altura*2);
        
        //Saída
        System.out.println("A área do retângulo é: "+area);
        System.out.println("O Perímetro do retângulo é: "+perimetro);
        
        
        
    }
    
}
