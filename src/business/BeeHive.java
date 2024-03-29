/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import entity.QueenBee;
import entity.Bee;
import entity.WorkerBee;
import entity.Drone;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hp
 */
public class BeeHive {
    private ArrayList<Bee> listBee;

    public void init() {
        //create list of 10 bees  of Queen, Drone and Worker types
        //in each bee, type and health attributes are randomly chosen
        this.listBee = new ArrayList<>();
        //your code
        Random rd = new Random();
        int i = 0;
        while (i < 10) {
        	switch(rd.nextInt(3)) {
	        	case 0:
	        		Drone d = new Drone();
	        		this.listBee.add(d);
	        		break;
	        	case 1:
	        		QueenBee q = new QueenBee();
	        		this.listBee.add(q);
	        		break;
	        	default:
	        		WorkerBee w = new WorkerBee();
	        		this.listBee.add(w);
        	}
        	i++;
        }
    }

    public ArrayList<Bee> getAllBees() {
        return listBee;
    }

    //attach all bees
    public void attackBees() {
        //your code
    	for(Bee b : listBee) {
    		b.damage();
    		b.setHealth(b.getHealth());
    	}
    }
}
