/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.multipleinheritance;

/**
 *
 * @author USER
 */
public class Dog extends Cat2 {
     public void walk(){
    System.out.println("Dogs can walk");
  }
   public static void main (String[] args){
       Dog mul = new Dog();
       mul.jumps();
       mul.sleep();
       mul.walk();
       
   }
    
}
