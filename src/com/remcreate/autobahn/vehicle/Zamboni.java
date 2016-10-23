package com.remcreate.autobahn.vehicle;

import java.util.Random;

public class Zamboni extends Auto{
  Random rand = new Random();

  public Zamboni() {
    setName("Zamboni");
    setSpeed(5);
  }

  public void newSpeed(){
    super.newSpeed();
    if(rand.nextInt(10) == 0){
      this.currSpeed = this.currSpeed + 100.0f;
      System.out.println("ZAMBONI TURBO POWER!");
    }
  }  
}

