/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.tuke.oop.aliens;

import sk.tuke.oop.aliens.actor.AbstractActor;
import sk.tuke.oop.framework.Animation;

/**
 *
 * @author GALILEI-04
 */
public class Light extends AbstractActor {
    private Animation onAnimation = new Animation("resources/images/light_on.png", 16, 16,10);
    private Animation offAnimation = new Animation("resources/images/light_off.png", 16, 16,10);
    private boolean isOn;
    private boolean isElectricity;
    public Light(){
        this.isOn = false;
        this.isElectricity = false;
        this.updateAnimation();
    }
    
    public void toggle(){
        if(isElectricity){
            if(isOn){
                isOn = false;
            } else {
                isOn = true;
            }
        } else {
            isOn = false;
        }
        updateAnimation();
    }
    
    public void setElectricityFlow(boolean isElectricity){
        this.isElectricity = isElectricity;
        updateAnimation();
    }
    
    private void updateAnimation(){
        if(isElectricity){
            if(isOn){
                setAnimation(onAnimation);
            } else {setAnimation(offAnimation);}
        } else {setAnimation(offAnimation);}
    }
}
