/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.cafeteria;

/**
 *
 * @author fleme
 */
public class Cafeteria {

    public static void main(String[] args) {
        // Cria um espresso
        Cafe cafe1 = new Espresso();
        System.out.println("Bebida: " + cafe1.getDescricao());
        System.out.println("Custo: R$" + cafe1.custo());

        // Adiciona leite ao espresso
        Cafe cafe2 = new Leite(cafe1);
        System.out.println("\nBebida: " + cafe2.getDescricao());
        System.out.println("Custo: R$" + cafe2.custo());

        // Adiciona canela ao espresso com leite
        Cafe cafe3 = new Canela(cafe2);
        System.out.println("\nBebida: " + cafe3.getDescricao());
        System.out.println("Custo: R$" + cafe3.custo());
        
        // Adiciona chocolate ao espresso com leite
        Cafe cafe4 = new Chocolate(cafe3);
        System.out.println("\nBebida: " + cafe4.getDescricao());
        System.out.println("Custo: R$" + cafe4.custo());

        // Cria um espresso com granulado
        Cafe cafe5 = new Granulado(new Espresso());
        System.out.println("Bebida: " + cafe5.getDescricao());
        System.out.println("Custo: R$" + cafe5.custo());
    }
}
