package edu.java.inheritance01;

public class BasicTv {
    // field(속성)
    private boolean powerOn;
    private int channel;
    private int volume;
    
    // getter/setters
    public boolean isPowerOn() {
        return powerOn;
    }
    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }
    public int getChannel() {
        return channel;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    /**
     * powerOnOff, TV의 전원을 켜거나 끄는 메서드.
     * TV의 현재 전원이 Off이면 ON, ON이면 OFF로 변경.
     * 
     * @return 전원 ON이면 true, off이면 false를 리턴.
     */
    
    public boolean powerOnOff() {
        if(this.powerOn) { // TV가 켜져 있으면
            this.powerOn = false;
            System.out.println("TV OFF");
        } else {// TV가 켜져 있으면
            this.powerOn = true;
            System.out.println("TV ON");
        }
        return this.powerOn;
    }
    
}
