/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08;

/**
 *
 * @author JONAS
 */

import java.util.Scanner;


public class Aula08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Treinamento - Aula08, entrada de dado, tipo string
        //Jonas Valereo - Técnico em Informática
        
        //Declarando as variaveis tipo string
        
        String nome;
        String sobrenome;
        
        //Declrando o cogido Scanner entrada de dados
        
       Scanner entrada  = new Scanner(System.in); 
        
    
       /*Declarando o codigo entrada de dado, nextLine imprimir 
       no console */
       
       System.out.println("Digite seu nome: ");
       nome = entrada.nextLine();
       System.out.println("Digite seu sobrenome: ");
       sobrenome = entrada.nextLine();
       
       
       //Imprimir, saida de dados, Console System
       
       System.out.println("Meu nome = " + nome +  " " + "Sobrenome = " + sobrenome);
    
       
        //Saida da aplicação e descarregar a mamoria
       
       System.exit(0);
       
       //Fim do programa
      
    
    }
    
}
