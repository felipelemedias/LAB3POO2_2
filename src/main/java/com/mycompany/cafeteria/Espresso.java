/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cafeteria;

/**
 *
 * @author fleme
 */
class Espresso implements Cafe {
    @Override
    public double custo() {
        return 3.0;
    }

    @Override
    public String getDescricao() {
        return "Espresso";
    }
}
