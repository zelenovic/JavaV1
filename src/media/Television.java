/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media;


public class Television {
    
    private int volume = 0;
    private int currentProgram = 1;
    private boolean turnOn;
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }
    
    public boolean getTurnOn() {
        return this.turnOn;
    }
    
    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    
    public Television() {
        this.volume = 0;
        this.currentProgram = 1;
        this.turnOn = false;
    }
    
    public Television(int volume, int currentProgram, boolean turnOn) {
        this.volume = volume;
        this.currentProgram = currentProgram;
        this.turnOn = turnOn;
    }
    
    public void printAttributes() {
        
        System.out.println("Current volume level is: " + volume);
        System.out.println("Chosen channel: " + currentProgram);
        System.out.println("Is TV turned on: " + turnOn);
        System.out.println();
        
    }
    
}
