/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import media.Radio;
import media.Television;


public class Main {
    
    public static void main(String[] args) {
        
        Television t1 = new Television();
        t1.printAttributes();
        
        t1.setVolume(20);
        t1.setCurrentProgram(10);
        t1.setTurnOn(true);
        t1.printAttributes();
        
        Radio r1 = new Radio();
        r1.printAttributes();
        
        r1.setFmFrequency(92.8);
        r1.setAmFrequency(620);
        r1.setBand('F');
        r1.printAttributes();
        
    }
    
}
