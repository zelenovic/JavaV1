
package media;


public class Radio {
    
    private double fmFrequency;
    private int amFrequency;
    private char band;
    
    public double getFmFrequency() {
        return this.fmFrequency;
    }
    
    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }
    
    public int getAmFrequency() {
        return this.amFrequency;
    }
    
    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }
    
    public char getBand() {
        return this.band;
    }
    
    public void setBand(char band) {
        this.band = band;
    }
    
    public Radio() {
        this.fmFrequency = 91.8;
        this.amFrequency = 600;
        this.band = 'F';
    }
    
    public void printAttributes() {
        
        System.out.println("FM Frequency is: " + fmFrequency);
        System.out.println("AM Frequency is: " + amFrequency);
        System.out.println("Band is: " + band);
        System.out.println();
        
    }
    
}
