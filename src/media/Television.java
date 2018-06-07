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
    
    
    
}
