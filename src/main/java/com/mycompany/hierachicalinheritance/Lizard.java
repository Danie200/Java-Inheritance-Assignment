/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hierachicalinheritance;

/**
 *
 * @author USER
 */
public class Lizard extends Animal2 {
    public void tail(){
        System.out.println("lizards have tails");
    }
    public static void main(String[] args){
        Lizard done = new Lizard();
        done.dance();
        done.tail();
        
        Lion omo = new Lion();
        omo.Roar();
        omo.dance();
    }
    
}
