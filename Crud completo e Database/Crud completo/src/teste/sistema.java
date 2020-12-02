/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Gledse_Jamisse
 */
public class sistema {
    
    Vector x = new Vector();
    
    // metodo para contar as palavras que tem em uma frase
    public void palavra(){
        
        Scanner ler = new Scanner(System.in);
        
    ob a;
    a = new ob();
    
    System.out.print("digite uma frase: ");
    a.nome = ler.nextLine();
    x.add(a);
    
    int var = a.nome.split("/", -1).length - 1; // esse parametro usamos para contar as palavras em uma frase que esta...
    System.out.println((var+1) + " palavras"); // ...separado por essa barra '/'.
    }
    public static void main(String [] args){
         sistema k = new sistema();
        k.palavra();
        k.maio();
    }
    
    // metodo que usamos para saber a palavra mais longa
    public void maio(){
        
        Scanner ler = new Scanner(System.in);
  
        System.out.print("digite uma palavra: ");
        String nome = ler.nextLine();
        System.out.print("digite outra palavra: ");
        String no = ler.nextLine();
        System.out.print("digite a ultima palavra: ");
        String nom = ler.nextLine();

        int b = nome.length(); // nome.length usamos para saber quantos caracteres tem uma palavra
        int c = no.length();
        int d = nom.length();
        
        if(b > c && b > d){
        System.out.println("A maior palavra eh: " + nome);
        }
        else if(d > c && d > b){
        System.out.println("A maior palavra eh: " + nom);
        }
        else if(c > d && b > d){
        System.out.println("A maior palavra eh: " + no);
        }
    }

}
