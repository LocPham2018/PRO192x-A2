/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Random;

/**
 *
 * @author hp
 */
public class Bee {
    private String type;
    private byte health;
    private boolean alive;

    public Bee() {
        //init
        //your cote
    	this.health = 100;
    	this.alive = true;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte getHealth() {
        return health;
    }

    public void setHealth(byte health) {
        this.health = health;
        //update the alive status when the health value changed
        //your code
        if (this.getType() == "Worker" && this.getHealth() < 70) {
        	this.alive = false;
        }
        if (this.getType() == "Drone" && this.getHealth() < 50) {
        	this.alive = false;
        }
        if (this.getType() == "Queen" && this.getHealth() < 20) {
        	this.alive = false;
        }
    }   
    
    public boolean isAlive(){
        return this.alive;
    }  

    //attack this bee
    public void damage() {
        //your code
    	
    	if (this.isAlive()) {
    		Random rd = new Random();
    		this.health -= rd.nextInt(101);
    		this.health = this.health < 0 ? 0 : this.health;
    	}
    }

    @Override
    public String toString() {
        String beeDetails ="Bee details";
        //your code
        
        return beeDetails;
    }
}
