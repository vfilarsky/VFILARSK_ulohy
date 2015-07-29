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
public class Hammer extends AbstractActor{ 
    public Hammer(){
        setAnimation(new Animation("resources/images/hammer.png", 16, 16,10));
    }
}
