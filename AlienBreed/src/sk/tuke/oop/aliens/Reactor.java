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
public class Reactor extends AbstractActor {
    boolean connect = false;
    boolean on;
    private int temperature;
    private Animation normalAnimation = new Animation("resources/images/reactor_on.png", 80, 80, 100);
    private int damage;
    private Light light;
    private Animation hotAnimation= new Animation("resources/images/reactor_hot.png", 80, 80, 50);
    private Animation brokenAnimation= new Animation("resources/images/reactor_broken.png", 80, 80, 50);
    private Animation offAnimation= new Animation("resources/images/reactor.png", 80, 80, 50);
    
    
    public Reactor() {
        temperature = 0;
        damage = 0;
        // create animation object
        // play animation repeatedly
        normalAnimation.setPingPong(true);
        // set actor's animation to just created Animation object
        setAnimation(normalAnimation);
        on = true;
    }
    public void turnOn() {
        on = true;
        if(connect){
            this.light.setElectricityFlow(connect);
        }
        updateAnimation();
        
    }
    
    public void turnOff() {
        light.setElectricityFlow(false);
        on = false;
        updateAnimation();
    }
    
    public boolean isRunning(){
        return on;
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public int getDamage() {
        return damage;
    }
    public void increaseTemperature(int temp){
        if(on == true) {
        if(temp < 0){
            return;
        }
        if(temperature >=5000){
            on = false;
            damage = 100;
            temperature = temperature + temp;
        } else if(temperature > 2000){
        if(damage>50){
            damage = (int) (temperature / 30.0 - 200.0/3.0);
            temperature = (temperature + temp)*2;
        }else{damage = (int) (temperature / 30.0 - 200.0/3.0);
        temperature = temperature + temp;}} else temperature = temperature + temp;
        if(temperature >= 4000){
            hotAnimation.setPingPong(true);
        }
        if(temperature >=5000){
            damage = 100;
            brokenAnimation.setPingPong(true);
        }
        updateAnimation();
        }
    }
    
    public void decreaseTemperature(int temp){
        if(on == true) {
        if(damage>50){
            temperature = temperature - (temp/2);
        } else {
            temperature = temperature - temp;
        }
        updateAnimation();
        }
    }
        
    
   private void updateAnimation(){
    if(on == true){
        if(temperature >= 5000){
            setAnimation(brokenAnimation);
        } else if(4000 < temperature && temperature < 5000){
            setAnimation(hotAnimation);
        }else {
            setAnimation(normalAnimation);
    }}else{setAnimation(offAnimation);} 
}
   public void repair(Hammer hammer){
       System.out.println("Volam repair");
       
       if(hammer == null){
           return;
       }
       
       if(temperature > 1000){
           temperature = 1000;
       }
       
       if(damage > 50) {
           damage -=50;
       } else {
           damage = 0;
       }
       
       updateAnimation();
   }
   public void addLight(Light light){
        this.connect =  true;
        this.light = light;
        if(on){
        this.light.setElectricityFlow(true);}
   }
   
   public void removeLight(Light light){
        this.light = light;
        this.light.setElectricityFlow(false);
   }
}


