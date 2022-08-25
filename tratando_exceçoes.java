package com.cursosoftex.excecoes;

public class Excecao {
    public static void main(String[] args) {
        try{
            int[] vetor = new int[4];
            
        System.out.println("antes da exception");
        System.out.println("esse texto nao sera impresso");
        vetor[4] = 1;
        
        } catch(ArrayIndexOutOfBounds Exception) {
             System.out.println("exceçao ao acessar um indice do vetor que nao existe");
        }
         System.out.println("texto que sera impresso apos a exception");
        
    }
}
