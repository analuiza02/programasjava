/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VelocidadeMedia;

import java.util.Scanner;

/**
 *
 * @author ana_l
 */
public class VelocidadeMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double per, hora, min, tempo, velmed;

    //entrada
    Scanner entrada= new Scanner (System.in);
    
    System.out.println("DIGITE O PERCURSO:");
    per = entrada.nextDouble();
    System.out.println("DIGITE A HORA SEM OS MINUTOS:");
    hora = entrada.nextDouble();
    System.out.println("DIGITE OS MINUTOS:");
    min = entrada.nextDouble();
    
    //processamento
    
    tempo =(min/60)+hora;
    velmed=per/tempo;
    
    //saida
    
    System.out.println("A VELOCIDADE MEDIA DESSE CARRO ERA DE:"+velmed+"Km/h");
    
    
    
            
    }
    
}
