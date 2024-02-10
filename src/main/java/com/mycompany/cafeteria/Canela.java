/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafeteria;

/**
 *
 * @author fleme
 */
public class Canela extends ToppingDecorator{
    
    public Canela(Cafe cafe) {
        super(cafe);
    }
    
    @Override
    public double custo() {
        return cafe.custo() + 2.00;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " com canela";
    }
}