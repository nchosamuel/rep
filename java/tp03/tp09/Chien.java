/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp09;

/**
 *
 * @author lastreet'zer
 */
public class Chien extends Animal {
    
    public Chien(String unNom)
    {
        super(unNom);
    }
    
    public void crier()
    {
        System.out.println("ouaf !");
    }
}